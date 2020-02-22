package com.calc.alcohol.appalyzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Vrijeme extends Alkohol {
    EditText kolko;
    public static double sati;
    Button gumb2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrijeme);

        kolko = (EditText) findViewById(R.id.sat);
        gumb2 = (Button)findViewById(R.id.dalje2);

        gumb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sati = Double.parseDouble(kolko.getText().toString());
                Intent intent4;
                intent4 = new Intent(Vrijeme.this, Alkohol.class);
                startActivity(intent4);
            }
        });
    }
}
