package ddwucom.mobile.week10.customadaptertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MyData> myDataList;
    private MyAdapter myAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDataList = new ArrayList<MyData>( );

        myDataList.add(new MyData(1, "홍길동", "012345")); // 원본 데이터 저장
        myDataList.add(new MyData(2, "전우치", "123456"));
        myDataList.add(new MyData(3, "일지매", "234567"));
        myDataList.add(new MyData(4, "홍길동", "012345"));
        myDataList.add(new MyData(5, "전우치", "123456"));
        myDataList.add(new MyData(6, "일지매", "234567"));
        myDataList.add(new MyData(7, "홍길동", "012345"));
        myDataList.add(new MyData(8, "전우치", "123456"));
        myDataList.add(new MyData(9, "일지매", "234567"));
        myDataList.add(new MyData(10, "홍길동", "012345"));
        myDataList.add(new MyData(11, "전우치", "123456"));
        myDataList.add(new MyData(12, "일지매", "234567"));
        myDataList.add(new MyData(13, "홍길동", "012345"));
        myDataList.add(new MyData(14, "전우치", "123456"));
        myDataList.add(new MyData(15, "일지매", "234567"));
        myDataList.add(new MyData(16, "홍길동", "012345"));
        myDataList.add(new MyData(17, "전우치", "123456"));
        myDataList.add(new MyData(18, "일지매", "234567"));
        myDataList.add(new MyData(19, "홍길동", "012345"));
        myDataList.add(new MyData(20, "전우치", "123456"));

        listView = findViewById(R.id.customListView);

        myAdapter = new MyAdapter(this, R.layout.custom_adapter_view, myDataList); // myDataList 에 있는 원본파일의 layout 파일을 옮긴다.

        listView.setAdapter(myAdapter); // 화면과 데이터 연결

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, myDataList.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}