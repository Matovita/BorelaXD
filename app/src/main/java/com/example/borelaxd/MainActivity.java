package com.example.borelaxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    private Button info;
    private Button important;
    private Button news;
    private TextView infected;
    private ImageButton fetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = (Button) findViewById(R.id.infoBtn);
        important = (Button) findViewById(R.id.importantBtn);
        news = (Button) findViewById(R.id.newsBtn);
        infected = (TextView)findViewById(R.id.infectedNum);
        fetch = (ImageButton)findViewById(R.id.refreshBtn);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), CountriesActivity.class);
                startActivity(startIntent);
            }
        });

        important.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ImportantActivity.class);
                startActivity(startIntent);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), NewsActivity.class);
                startActivity(startIntent);
            }
        });

        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        getBodyText();
                    }
        });
    }

    public void getBodyText() {
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