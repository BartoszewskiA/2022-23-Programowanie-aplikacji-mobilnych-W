package com.example.w10p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    GestureDetector detektorGestow;
    TextView textView01;
    int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detektorGestow = new GestureDetector(this, this);
        textView01 = findViewById(R.id.textView01);
        textView01.setText(String.valueOf(x));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detektorGestow.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        x=0;
        textView01.setText(String.valueOf(x));
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if(Math.abs(velocityX)>Math.abs(velocityY)) //gest poziomy
        {
            if(velocityX>0)
                x+=10;
            else
                x-=10;
        } else
        {
            if(velocityY>0)
                x++;
            else
                x--;
        }
        textView01.setText(x);
        return false;
    }
}