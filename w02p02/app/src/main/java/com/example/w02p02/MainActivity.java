package com.example.w02p02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ile=0;
    TextView okienko;
    Button p1,p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        okienko = findViewById(R.id.textView01);
        p1 = findViewById(R.id.button01);
        p2 = findViewById(R.id.button02);
        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch(id)
                {
                    case R.id.button01: ile++; break;
                    case R.id.button02: ile--; break;
                    case R.id.textView01: ile=0; break;
                }
                okienko.setText(String.valueOf(ile));
            }
        };
        p1.setOnClickListener(sluchacz);
        p2.setOnClickListener(sluchacz);
        okienko.setOnClickListener(sluchacz);
    }
}