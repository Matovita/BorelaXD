package com.example.borelaxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CountriesActivity extends AppCompatActivity {

    private Button sAmericaBtn, nAmericaBtn, europeBtn, asiaBtn, africaBtn, australiaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        sAmericaBtn = (Button) findViewById(R.id.sAmericaBtn);
        nAmericaBtn = (Button) findViewById(R.id.nAmericaBtn);
        europeBtn = (Button) findViewById(R.id.europeBtn);
        asiaBtn = (Button)findViewById(R.id.asiaBtn);
        africaBtn = (Button)findViewById(R.id.africaBtn);
        australiaBtn = (Button)findViewById(R.id.australiaBtn);

        sAmericaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SouthAmericaActivity.class);
                startActivity(startIntent);
            }
        });

        nAmericaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), NorthAmericaActivity.class);
                startActivity(startIntent);
            }
        });

        europeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), EuropeActivity.class);
                startActivity(startIntent);
            }
        });

        asiaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), AsiaActivity.class);
                startActivity(startIntent);
            }
        });

        africaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), AfricaActivity.class);
                startActivity(startIntent);
            }
        });

        australiaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), AustraliaActivity.class);
                startActivity(startIntent);
            }
        });
    }
}