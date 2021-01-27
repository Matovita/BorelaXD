package com.example.borelaxd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CovidCountryAdapter extends RecyclerView.Adapter<CovidCountryAdapter.ViewHolder> {

    ArrayList<CovidCountry> covidCountries;

    public CovidCountryAdapter(ArrayList<CovidCountry> covidCountries) {
        this.covidCountries = covidCountries;
    }

    @NonNull
    @Override
    public CovidCountryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_covid_country, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CovidCountryAdapter.ViewHolder holder, int position) {
        CovidCountry covidCountry = covidCountries.get(position);
        holder.tvCases.setText(covidCountry.getmCases());
        holder.tvCountryName.setText(covidCountry.getmCovidCountry());
    }

    @Override
    public int getItemCount() {
        return covidCountries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCountryName, tvCases;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCases = itemView.findViewById(R.id.tvCountryCases);
            tvCountryName = itemView.findViewById(R.id.tvCountryName);
        }
    }
}
