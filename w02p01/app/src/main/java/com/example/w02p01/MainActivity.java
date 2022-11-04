package com.example.w02p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ile =0;
    Button p1,p2;
    TextView opis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opis = findViewById(R.id.textView01);
        p1 = findViewById(R.id.button01);
        p2 = findViewById(R.id.button02);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ile++;
                opis.setText(String.valueOf(ile));
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ile--;
                opis.setText(String.valueOf(ile));
            }
        });

    }
}