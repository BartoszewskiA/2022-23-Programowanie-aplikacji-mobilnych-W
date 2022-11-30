package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.time.LocalTime;

public class MainActivity extends AppCompatActivity {

    TextView textView01;
    LocalTime localTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01=findViewById(R.id.textView01);
        String s= textView01.getText().toString();
        localTime = LocalTime.now();
        s+="Metoda: onCreate\n"+localTime.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String s= textView01.getText().toString();
        localTime = LocalTime.now();
        s+="Metoda: onStart\n"+localTime.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String s= textView01.getText().toString();
        localTime = LocalTime.now();
        s+="Metoda: onResume\n"+localTime.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String s= textView01.getText().toString();
        localTime = LocalTime.now();
        s+="Metoda: onPause\n"+localTime.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onStop() {
        super.onStop();
        String s= textView01.getText().toString();
        localTime = LocalTime.now();
        s+="Metoda: onStop\n"+localTime.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String s= textView01.getText().toString();
        s+="Metoda: onDestroy\n"+localTime.toString()+"\n";
        textView01.setText(s);
    }
}