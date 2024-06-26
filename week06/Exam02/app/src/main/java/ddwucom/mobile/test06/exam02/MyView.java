package ddwucom.mobile.test06.exam02;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyView extends View {

    float posX = 100;
    float posY = 100;
    float r = 100;
    int paintColor = Color.CYAN;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) { // 이벤트 핸들러 메소드 재정의. view 터치 기능이 activity에서 처리됨
//        if(event.getAction() == MotionEvent.ACTION_DOWN) {
//            posX = event.getX();
//            posY = event.getY();
//            invalidate();
//        }
//        return true;
//    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.LTGRAY);

        Paint paint = new Paint();
        paint.setColor(paintColor);

        canvas.drawCircle(posX, posY, r, paint);
    }

}
