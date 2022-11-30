package com.example.w05p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    Button b01;
    EditText okienko;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b01 = findViewById(R.id.button01_a04);
        okienko = findViewById(R.id.editText01_a04);
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent();
                intencja.putExtra("odpowiedz",okienko.getText().toString());
                setResult(RESULT_OK, intencja);
                finish();
            }
        });
    }
}