package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   TextView textView01;
   Random random = new Random();
   SharedPreferences sharedPreferences;
   SharedPreferences.Editor edytor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = findViewById(R.id.textView01);
        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        edytor = sharedPreferences.edit();
        textView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rand = random.nextInt(100);
                textView01.setText(String.valueOf(rand));
                edytor.putInt("dana",rand);
                edytor.commit();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        int rand = sharedPreferences.getInt("dana",0);
        textView01.setText(String.valueOf(rand));
    }
}