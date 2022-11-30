package com.example.w08p03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    EditText editText01;
    TextView textView01;
    Button bt_zaloguj, bt_wyloguj;
    SharedPreferences preferencje;
    SharedPreferences.Editor edytor;
    LocalDate localDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText01 = findViewById(R.id.editText01);
        textView01 = findViewById(R.id.textView01);
        bt_zaloguj = findViewById(R.id.button01);
        bt_wyloguj = findViewById(R.id.button02);
        preferencje = this.getPreferences(Context.MODE_PRIVATE);
        edytor = preferencje.edit();
        czyZalogowany();
        obslugaPrzyciskow();

    }

    private void czyZalogowany() {
        String s =preferencje.getString("user","");
        if(s.length()>0){

            String data = preferencje.getString("data","");
            textView01.setText(s+"\n"+data);
            editText01.setVisibility(View.INVISIBLE);
            bt_zaloguj.setVisibility(View.INVISIBLE);
            bt_wyloguj.setVisibility(View.VISIBLE);
        }

    }

    private void obslugaPrzyciskow() {
        bt_zaloguj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText01.getText().toString();
                localDate = LocalDate.now();
                if(s.length()>0)
                {
                    edytor.putString("user",s);
                    edytor.putString("data",localDate.toString());
                    edytor.commit();
                    textView01.setText(s+"\n"+localDate.toString());
                    editText01.setVisibility(View.INVISIBLE);
                    bt_zaloguj.setVisibility(View.INVISIBLE);
                    bt_wyloguj.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}