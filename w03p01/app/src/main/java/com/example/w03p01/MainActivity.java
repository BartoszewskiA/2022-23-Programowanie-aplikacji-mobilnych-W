package com.example.w03p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView info;
    RadioButton rb_01, rb_02, rb_03;
    RatingBar gwiazdki;
    Spinner menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = findViewById(R.id.textView01);
        rb_01 = findViewById(R.id.radioButton01);
        rb_02 = findViewById(R.id.radioButton02);
        rb_03 = findViewById(R.id.radioButton03);
        gwiazdki = findViewById(R.id.ratingBar01);
        menu = findViewById(R.id.spinner01);
       View.OnClickListener sluchacz = new View.OnClickListener() {
           @Override
           public void onClick(View v) {
   /*           int id = v.getId();
              switch (id) {
                  case R.id.radioButton01: info.setText("Opcja 1"); break;
                  case R.id.radioButton02: info.setText("Opcja 2"); break;
                  case R.id.radioButton03: info.setText("Opcja 3"); break;
              }*/
               if(rb_01.isChecked())
                   info.setText("Opcja 1");
               else if(rb_02.isChecked())
                   info.setText("Opcja 2");
               else
                   info.setText("Opcja 3");
           }
       };
        rb_01.setOnClickListener(sluchacz);
        rb_02.setOnClickListener(sluchacz);
        rb_03.setOnClickListener(sluchacz);

        gwiazdki.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                info.setText(rating + " gwiazdek");
            }
        });

        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                info.setText(position + "element");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}