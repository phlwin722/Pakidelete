package com.example.finalsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView tryy;
    Button central, muzon, sanjose, dulong, bb, bsuu, starmall , binay , plus, minus;
    EditText Quan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        central = (Button) findViewById(R.id.central);
        muzon = (Button) findViewById(R.id.muzon);
        sanjose = (Button) findViewById(R.id.sanjose);
        dulong = (Button) findViewById(R.id.dulong);
        binay = (Button) findViewById(R.id.binay);
        bb = (Button) findViewById(R.id.bb);
        bsuu = (Button) findViewById(R.id.bsuu);
        starmall = (Button) findViewById(R.id.starmall);
        Quan = (EditText) findViewById(R.id.quantity);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);


        Intent i = getIntent();
        String destinii = i.getStringExtra("destini");
        String quantit = i.getStringExtra("quantit");

        //((TextView)findViewById(R.id.titi)).setText(destination);*/

        central.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String central = "Central Terminal";

                Intent y = new Intent(MainActivity2.this, MainActivity3.class);
                y.putExtra("destini",destinii);
                y.putExtra("arriv",central);
                y.putExtra("quantity",String.valueOf(Quan.getText().toString()));
                startActivity(y);
            }
        });

        muzon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String muzon = "Muzon";
              if(muzon == destinii){

                  Toast.makeText(MainActivity2.this,"Bawal Magkaparehas",Toast.LENGTH_LONG).show();

              }else {
                  Intent y = new Intent(MainActivity2.this, MainActivity3.class);
                  y.putExtra("destini",destinii);
                  y.putExtra("arriv",muzon);
                  y.putExtra("quantity",String.valueOf(Quan.getText().toString()));
                  startActivity(y);
                     }
            }
        });

        sanjose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sanjose = "San jose";
                Intent y = new Intent(MainActivity2.this, MainActivity3.class);
                y.putExtra("destini",destinii);
                y.putExtra("arriv",sanjose);
                y.putExtra("quantity",String.valueOf(Quan.getText().toString()));
                startActivity(y);
            }
        });

        dulong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dulong ="Dulong Bayan";
                Intent y = new Intent(MainActivity2.this, MainActivity3.class);
                y.putExtra("destini",destinii);
                y.putExtra("arriv",dulong);
                y.putExtra("quantity",String.valueOf(Quan.getText().toString()));
                startActivity(y);
            }
        });
        binay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String binay = "Binay";
                Intent y = new Intent(MainActivity2.this, MainActivity3.class);
                y.putExtra("destini",destinii);
                y.putExtra("arriv",binay);
                y.putExtra("quantity",String.valueOf(Quan.getText().toString()));
                startActivity(y);

            }
        });

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bb = "4B";
                Intent y = new Intent (MainActivity2.this, MainActivity3.class);
                y.putExtra("destini",destinii);
                y.putExtra("arriv",bb);
                y.putExtra("quantity",String.valueOf(Quan.getText().toString()));
                startActivity(y);
            }
        });

        bsuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bsu = "Bulacan State University";
                Intent y = new Intent(MainActivity2.this, MainActivity3.class);
                y.putExtra("destini",destinii);
                y.putExtra("arriv",bsu);
                y.putExtra("quantity",String.valueOf(Quan.getText().toString()));
                startActivity(y);
            }
        });

        starmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String starmall ="Starmall";
                Intent y = new Intent(MainActivity2.this, MainActivity3.class);
                y.putExtra("destini",destinii);
                y.putExtra("arriv",starmall);
                y.putExtra("quantity",String.valueOf(Quan.getText().toString()));
                startActivity(y);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(Quan.getText().toString()) ;
                 i+=1;
               Quan.setText(i);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(Quan.getText().toString()) ;
                i-=1;
                Quan.setText(i);
            }
        });



    }
}