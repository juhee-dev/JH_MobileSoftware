package ddwucom.mobile.test14.exam02;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateActivity extends AppCompatActivity {

    Food food;

    EditText etFood;
    EditText etNation;

    FoodDBManager foodDBManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        food = (Food) getIntent().getSerializableExtra("food"); // 객체 받음

        etFood = findViewById(R.id.et_food_name);
        etNation = findViewById(R.id.et_nation);

        etFood.setText(food.getFood());
        etNation.setText(food.getNation());

        foodDBManager = new FoodDBManager(this);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_update:
                food.setFood(etFood.getText().toString());
                food.setNation(etNation.getText().toString());

                if (foodDBManager.modifyFood(food)) { // 성공
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("food", food);
                    setResult(RESULT_OK, resultIntent);
                } else { // 실패
                    setResult(RESULT_CANCELED);
                }
                break;
            case R.id.btn_cancel:
                setResult(RESULT_CANCELED);
                break;
        }
        finish(); // UpdateActivity 종료
    }
}
