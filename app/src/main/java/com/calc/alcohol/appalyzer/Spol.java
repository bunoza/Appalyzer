package com.calc.alcohol.appalyzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Spol extends Alkohol    {
        public static double r;
        ImageButton malebutton;
        ImageButton femalebutton;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_spol);
            malebutton = (ImageButton) findViewById(R.id.male);
            malebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    r =10;
                    Intent intent1;
                    intent1 = new Intent(Spol.this, Kilaza.class);
                    startActivity(intent1);
                }
            });
            femalebutton = (ImageButton) findViewById(R.id.female);
            femalebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    r =20;
                    Intent intent2;
                    intent2 = new Intent(Spol.this, Kilaza.class);
                    startActivity(intent2);
                }
            });
        }

    }
