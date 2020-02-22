package com.calc.alcohol.appalyzer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import static com.calc.alcohol.appalyzer.Kilaza.kg;
import static com.calc.alcohol.appalyzer.Spol.r;
import static com.calc.alcohol.appalyzer.Vrijeme.sati;
import static com.calc.alcohol.appalyzer.Visina.cm;
import static java.sql.Types.NULL;

public class Alkohol extends Rez {
        CharSequence kolicinaVina;
        CharSequence kolicinaPiva;
        CharSequence kolicinaZeste;
        EditText t1;
        EditText t2;
        double db1;
        double db2;
        double db3;
        EditText t3;
        Button b1;
        double sum;
        public static double racunanje;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alkohol);




        t1 = (EditText) findViewById(R.id.kolkopiva);
        t2 = (EditText) findViewById(R.id.kolkovina);
        t3 = (EditText) findViewById(R.id.kolkozeste);
        b1 = (Button) findViewById(R.id.kraj);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kolicinaPiva = t1.getText();
                kolicinaVina = t2.getText();
                kolicinaZeste = t3.getText();
                if(TextUtils.isEmpty(t1.getText()) ){
                    kolicinaPiva = "0";
                }
                if(TextUtils.isEmpty(t2.getText()) ){
                    kolicinaVina = "0";
                }
                if(TextUtils.isEmpty(t3.getText()) ){
                    kolicinaZeste = "0";
                }
                db1 =Double.parseDouble(kolicinaPiva.toString());
                db2 =Double.parseDouble(kolicinaVina.toString());
                db3 =Double.parseDouble(kolicinaZeste.toString());

                if(r ==10){
                    r =1.0181 - (0.01213*(kg/((cm/100)*(cm/100))));
                }
                if(r ==20){
                    r =0.9367 - (0.01240*(kg/((cm/100)*(cm/100))));
                }

                sum = db1*19.725 + db2*18.147 + db3*10.4148;


                racunanje= ((sum/( kg *1000* r))*100 - (sati*0.015))*10;



                Intent intent5;
                intent5 = new Intent(Alkohol.this, Rez.class);
                startActivity(intent5);
            }
        });

    }
}
