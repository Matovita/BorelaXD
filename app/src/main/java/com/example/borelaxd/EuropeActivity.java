package com.example.borelaxd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class EuropeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe);
    }

    RecyclerView rvCovidCountry;
    ArrayList<CovidCountry> covidCountries;

    private static final String TAG = EuropeActivity.class.getSimpleName();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_europe, container, false);

        //rvCovidCountry = root.findViewById(R.id.rvEuropeCountry);
        rvCovidCountry.setLayoutManager(new LinearLayoutManager(this));

        getInfo();

        return root;
    }

    private void showRecyclerView() {
        CovidCountryAdapter covidCountryAdapter = new CovidCountryAdapter(covidCountries);
        rvCovidCountry.setAdapter(covidCountryAdapter);
    }

    public void getInfo() {
        String url = "https://corona.lmao.ninja/v2/coutries";
        DecimalFormat formatter = new DecimalFormat("###,###,###");

        covidCountries = new ArrayList<>();

        StringRequest request
                = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response)
                    {
                        if (response != null) {
                            Log.e(TAG, "onRespone: " + response);
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    JSONObject data = jsonArray.getJSONObject(i);
                                    covidCountries.add(new CovidCountry(data.getString("country"), data.getString("cases")));
                                }
                                showRecyclerView();
                            } catch(JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        Log.e(TAG, "onResponse: " + error);
                    }
                });
        Volley.newRequestQueue(this).add(request);
    }
}