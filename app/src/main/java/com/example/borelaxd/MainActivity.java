package com.example.borelaxd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView infected;
    private ImageButton fetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infected = (TextView)findViewById(R.id.infectedNum);
        fetch = (ImageButton)findViewById(R.id.refreshBtn);
        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getBodyText();
            }
        });
    }

    private void getBodyText() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                final StringBuilder builder = new StringBuilder();

                try {
                    String url = "https://www.worldometers.info/coronavirus/";
                    Document doc = Jsoup.connect(url).get();

                    Elements body = doc.select("div.maincouter-wrap > maincouter-number > span");
                    Double rate = Double.valueOf(body.get(0).text());
                    builder.append(rate);
                } catch (Exception e) {
                    builder.append("Error : ").append(e.getMessage()).append("\n");
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        infected.setText(builder.toString());
                    }
                });
            }
        }).start();
    }
}