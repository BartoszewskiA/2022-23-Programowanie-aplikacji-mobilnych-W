package com.example.w08p02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText01;
    Button button01;
    TextView textView01;
    SharedPreferences udostepnionePreferencje;
    SharedPreferences.Editor edytor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText01 = findViewById(R.id.editText01);
        button01 = findViewById(R.id.button01);
        textView01 = findViewById(R.id.textView01);
        udostepnionePreferencje = this.getPreferences(Context.MODE_PRIVATE);
        edytor = udostepnionePreferencje.edit();
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText01.getText().toString();
                textView01.setText(s);
                edytor.putString("napis",s);
                edytor.commit();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        String s =udostepnionePreferencje.getString("napis","");
        textView01.setText(s);
    }
}