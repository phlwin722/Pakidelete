package com.example.finalsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button central, muzon, sanjose, dulongbayan, binay, bb, bsu , starmall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        central = (Button)findViewById(R.id.central);
        muzon = (Button) findViewById(R.id.muzon);
        sanjose = (Button) findViewById(R.id.sanjose);
        dulongbayan = (Button) findViewById(R.id.dulong);
        binay = (Button) findViewById(R.id.binay);
        bb = (Button) findViewById(R.id.bb);
        bsu = (Button) findViewById(R.id.bsu);
        starmall = (Button) findViewById(R.id.starmall);

        central.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String central = "Central Terminal";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("destini",central);
                startActivity(i);
            }
        });

        muzon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Muzon = "Muzon";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("destini",Muzon);
                startActivity(i);
            }
        });

        sanjose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sanjose = "San jose ";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("destini",sanjose);
                startActivity(i);
            }
        });

        dulongbayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dulongbayan = "Dulong Bayan";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("destini",dulongbayan);
                startActivity(i);
            }
        });

        binay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String binay = "Binay";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("destini",binay);
                startActivity(i);
            }
        });

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bb = "4B";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("destini",bb);
                startActivity(i);
            }
        });

        bsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bsu = "Bulacan State University";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("destini",bsu);
                startActivity(i);
            }
        });

        starmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String starmall = "StarMall";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("destini",starmall);
                startActivity(i);
            }
        });
    }
}