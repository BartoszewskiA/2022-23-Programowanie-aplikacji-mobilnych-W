package com.example.w05p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView okienko = findViewById(R.id.textWiew01_a3);
        Bundle paczka = getIntent().getExtras();
        String s = paczka.getString("dana_tekstowa");
        int liczba = paczka.getInt("dana_numeryczna");
        okienko.setText("Dana tekstowa: "+s+"\nDana liczbaowa"+String.valueOf(liczba));
    }
}