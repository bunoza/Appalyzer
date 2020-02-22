package com.calc.alcohol.appalyzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Visina extends Alkohol {


    public static double cm;
    EditText visina;
    Button gumb;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visina);

        visina = (EditText) findViewById(R.id.textinput);
        gumb = (Button) findViewById(R.id.dalje);

        gumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm = Double.parseDouble(visina.getText().toString());
                Intent intent3;
                intent3 = new Intent(Visina.this, Vrijeme.class);
                startActivity(intent3);
            }
        });
    }

}
