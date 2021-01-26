package com.example.borelaxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewsActivity extends AppCompatActivity {
    private Button q1Btn, q2Btn, q3Btn, q4Btn, q5Btn, q6Btn, q7Btn, q8Btn, q9Btn, q10Btn, q12Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        q1Btn = (Button)findViewById(R.id.q1Btn);
        q2Btn = (Button)findViewById(R.id.q2Btn);
        q3Btn = (Button)findViewById(R.id.q3Btn);
        q4Btn = (Button)findViewById(R.id.q4Btn);
        q5Btn = (Button)findViewById(R.id.q5Btn);
        q6Btn = (Button)findViewById(R.id.q6Btn);
        q7Btn = (Button)findViewById(R.id.q7Btn);
        q8Btn = (Button)findViewById(R.id.q8Btn);
        q9Btn = (Button)findViewById(R.id.q9Btn);
        q10Btn = (Button)findViewById(R.id.q10Btn);
        q12Btn = (Button)findViewById(R.id.q12Btn);

        q1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Jebana";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q9Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q10Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q12Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Kurwo";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });
    }
}