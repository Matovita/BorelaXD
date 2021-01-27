package com.example.borelaxd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

import android.os.Bundle;

import java.text.DecimalFormat;

public class StatsActivity extends AppCompatActivity {

    TextView tvCases, tvRecovered, tvCritical, tvTodayCases, tvTotalDeaths, tvTodayDeaths, tvAffectedCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvTotalDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);
        tvAffectedCountries = findViewById(R.id.tvAffectedCountries);
        fetchdata();
    }

    private void fetchdata()
    {
        String url = "https://corona.lmao.ninja/v2/all";
        DecimalFormat formatter = new DecimalFormat("###,###,###");

        StringRequest request
                = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response)
                    {
                        try {
                            JSONObject jsonObject = new JSONObject(response.toString());
                            tvCases.setText(formatter.format(Integer.parseInt(jsonObject.getString("cases"))));
                            tvRecovered.setText(formatter.format(Integer.parseInt(jsonObject.getString("recovered"))));
                            tvCritical.setText(formatter.format(Integer.parseInt(jsonObject.getString("critical"))));
                            tvTodayCases.setText(formatter.format(Integer.parseInt(jsonObject.getString("todayCases"))));
                            tvTotalDeaths.setText(formatter.format(Integer.parseInt(jsonObject.getString("deaths"))));
                            tvTodayDeaths.setText(formatter.format(Integer.parseInt(jsonObject.getString("todayDeaths"))));
                            tvAffectedCountries.setText(formatter.format(Integer.parseInt(jsonObject.getString("affectedCountries"))));
                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        Toast.makeText(
                                StatsActivity.this,
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