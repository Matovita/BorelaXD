package com.example.borelaxd;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PopAnswer extends AppCompatActivity {
    private TextView popAnswer;
    private String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popanswerwindow);
        popAnswer = (TextView)findViewById(R.id.popAnswer);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.6));

        answer = getIntent().getStringExtra("Answer");
        popAnswer.setText(answer);
    }
}
