package com.example.borelaxd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button info, stats, news;
    private TextView infected;
    private ImageButton fetch, appInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = (Button) findViewById(R.id.infoBtn);
        stats = (Button) findViewById(R.id.statsBtn);
        news = (Button) findViewById(R.id.newsBtn);
        infected = (TextView)findViewById(R.id.infectedNum);
        fetch = (ImageButton)findViewById(R.id.refreshBtn);
        appInfo = (ImageButton)findViewById(R.id.appInfoButton);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), CountriesActivity.class);
                startActivity(startIntent);
            }
        });

        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), StatsActivity.class);
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

        appInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, Pop.class));
                }
        });
    }

    public void getBodyText() {
        {
            String url = "https://corona.lmao.ninja/v2/all";
            DecimalFormat formatter = new DecimalFormat("###,###,###");

            StringRequest request
                    = new StringRequest(
                    Request.Method.GET,
                    url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject jsonObject = new JSONObject(response.toString());
                                infected.setTextSize(45);
                                infected.setPadding(10,0,0,20);
                                infected.setText(formatter.format(Integer.parseInt(jsonObject.getString("active"))));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(
                                    MainActivity.this,
                                    error.getMessage(),
                                    Toast.LENGTH_SHORT)
                                    .show();
                        }
                    });

            RequestQueue requestQueue
                    = Volley.newRequestQueue(this);
            requestQueue.add(request);
        }
    }
}