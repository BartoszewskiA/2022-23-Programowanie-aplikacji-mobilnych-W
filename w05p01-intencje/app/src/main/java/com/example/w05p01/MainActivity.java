package com.example.w05p01;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b01,b02, b03;
    EditText et01;
    TextView wynik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b01 = findViewById(R.id.button01);
        b02 = findViewById(R.id.button02);
        b03 = findViewById(R.id.button03);
        et01 = findViewById(R.id.ediyText01);
        wynik = findViewById(R.id.textView02);
        otwieranieAktywnosci();
        otwieranieIWysylanie();
        otwieranieiOdbieranie();
    }

    private void otwieranieiOdbieranie() {
        b03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja =  new Intent(getApplicationContext(), MainActivity4.class);
                startActivityForResult(intencja, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==RESULT_OK)
        {
            Bundle paczka = data.getExtras();
            String s = paczka.getString("odpowiedz");
            String s1 = data.getStringExtra("odpowiedz");
            wynik.setText(s);
        }
    }

    private void otwieranieIWysylanie() {
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(), MainActivity3.class);
                intencja.putExtra("dana_tekstowa",et01.getText().toString());
                intencja.putExtra("dana_numeryczna", 101);
                startActivity(intencja);
            }
        });
    }

    private void otwieranieAktywnosci() {
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intencja);
            }
        });
    }
}