package com.example.w08p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.time.LocalTime;

public class MainActivity extends AppCompatActivity {

    TextView textView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = findViewById(R.id.textView01);
        LocalTime czas = LocalTime.now();
        String s = textView01.getText().toString();
        s+="Metoda: onCreate\n";
        s+=czas.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String s = textView01.getText().toString();
        s+="Metoda: onStart\n";
        LocalTime czas = LocalTime.now();
        s+=czas.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String s = textView01.getText().toString();
        s+="Metoda: onResume\n";
        LocalTime czas = LocalTime.now();
        s+=czas.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String s = textView01.getText().toString();
        s+="Metoda: onPause\n";
        LocalTime czas = LocalTime.now();
        s+=czas.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onStop() {
        super.onStop();
        String s = textView01.getText().toString();
        s+="Metoda: onStop\n";
        LocalTime czas = LocalTime.now();
        s+=czas.toString()+"\n";
        textView01.setText(s);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String s = textView01.getText().toString();
        s+="Metoda: onRestart\n";
        LocalTime czas = LocalTime.now();
        s+=czas.toString()+"\n";
        textView01.setText(s);
    }
}