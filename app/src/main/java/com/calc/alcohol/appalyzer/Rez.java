package com.calc.alcohol.appalyzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.calc.alcohol.appalyzer.Alkohol.racunanje;
public class Rez extends AppCompatActivity {

    TextView t1;
    Button gumb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rez);

        t1 = findViewById(R.id.textView2);
        t1.setText(Double.toString(racunanje));
        if(racunanje <0){
            t1.setText("0.00");
        }
        gumb = (Button) findViewById(R.id.dalje);

        gumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3;
                intent3 = new Intent(Rez.this, Spol.class);
                startActivity(intent3);
            }
        });
    }
}
