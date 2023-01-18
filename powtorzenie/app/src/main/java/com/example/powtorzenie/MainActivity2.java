package com.example.powtorzenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    int[] obrazki = new int[] {R.drawable.g01,
            R.drawable.g02,
            R.drawable.g03,
            R.drawable.g04};
    int ID = obrazki[0];
    ImageView mini01,mini02,mini03,mini04;
    TextView adres;
    Button ok, anuluj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mini01 = findViewById(R.id.miniaturka01);
        mini02 = findViewById(R.id.miniaturka02);
        mini03 = findViewById(R.id.miniaturka03);
        mini04 = findViewById(R.id.miniaturka04);
        ok = findViewById(R.id.ok);
        anuluj = findViewById(R.id.Anuluj);
        adres = findViewById(R.id.adres);
        dodajSluchacze();
    }

    private void dodajSluchacze() {
        View.OnClickListener sluchaczMinajaturek = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch (id) {
                    case R.id.miniaturka01: adres.setText(obrazki[0]); ID = obrazki[0]; break;
                    case R.id.miniaturka02: adres.setText(obrazki[1]); ID = obrazki[1];break;
                    case R.id.miniaturka03: adres.setText(obrazki[2]); ID = obrazki[2];break;
                    case R.id.miniaturka04: adres.setText(obrazki[3]); ID = obrazki[3];break;
                }
            }
        };
        mini01.setOnClickListener(sluchaczMinajaturek);
        mini02.setOnClickListener(sluchaczMinajaturek);
        mini03.setOnClickListener(sluchaczMinajaturek);
        mini04.setOnClickListener(sluchaczMinajaturek);
        View.OnClickListener sluchaczPrzyciskow = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                if(id==R.id.ok)
                {
                    Intent odpowiedz = new Intent();
                    odpowiedz.putExtra("adres",ID);
                    setResult(RESULT_OK,odpowiedz);
                }
                else
                {
                    setResult(RESULT_CANCELED);
                }
                finish();
            }
        };
        ok.setOnClickListener(sluchaczPrzyciskow);
        anuluj.setOnClickListener(sluchaczPrzyciskow);
    }

}