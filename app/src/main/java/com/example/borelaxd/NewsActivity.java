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
                String st = "Zwykle: wysoka gorączka, kaszel, duszności utrata węchu i smaku\n\n" +
                        "Rzadziej: bóle mięśni, bóle głowy, biegunka, wysypka";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Najlepiej w piąty lub szósty dzień od podejrzenia zakażenia, wtedy wynik będzie najbardziej wiarygodny.";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Zalecane jest korzystanie z Internetowego Konta Pacjenta (IKP), dzięki temu od razu po pojawieniu się wyników w systemie\n" +
                        "zostanie wysłany SMS z informacją o wyniku.";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "- przebywanie w bezpośredniej bliskości (twarzą w twarz) z osobą chorą, w odległości mniejszej niż 2 m przez " +
                        "ponad 15 minut,\n" +
                        "- bezpośredni kontakt fizyczny z osobą zakażoną wirusem SARS-CoV-2 (np. podanie ręki),\n" +
                        "- przebywanie w tym samym pomieszczeniu, co chory z COVID-19, przez co najmniej 15 minut (np. w mieszkaniu, w klasie, " +
                        "poczekalni szpitala/przychodni, sali konferencyjnej),\n" +
                        "- kontakt korzystając z środków transportu zbiorowego obejmujący osoby zajmujące dwa miejsca.";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Co do zasady kwarantanna trwa 10 dni. Jednak w niektórych przypadkach okres ten jest dłuższy, \n" +
                        "np. wobec osób przebywających na kwarantannie w związku z zachorowaniem współdomownika (7 dni).";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "https://www.gov.pl/web/koronawirus";
                //String st = getString(R.string.q6String);
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "- osoba przekraczająca granicę Rzeczypospolitej Polskiej, jest obowiązana kwarantannę.\n\n" +
                        "- kwarantanna nakładana „automatycznie” w systemie EWP w dniu otrzymania skierowania na test – trwa do chwili uzyskania\n" +
                        "wyniku ujemnego.\n\n" +
                        "- kwarantanna, której podlega osoba prowadząca wspólne gospodarstwo domowe lub zamieszkująca z osobą, u której \n" +
                        "stwierdzono zakażenie wirusem SARS-CoV-2.";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Tak, należy się zgłosić do lekarza pierwszego kontaktu po skierowanie. Jeśli wybrany lekarz akurat nie dyżuruje\n" +
                        "twoja przychodnia skieruje cię do lekarza dyżurnego, który ma prawo zlecić wykonanie testu. Zlecenie wykonania \n" +
                        "testu na koronawirusa może również wystawić Ci lekarz dyżurujący w ramach nocnej lub świątecznej opieki zdrowotnej.";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q9Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "https://pacjent.gov.pl/aktualnosc/test-w-mobilnym-punkcie-pobran";
                //String st = getString(R.string.q9String);
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q10Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "Zalecane jest udanie się na test od razu po otrzymaniu skierowania";
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });

        q12Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopAnswer.class);
                String st = "https://www.gov.pl/web/szczepimysie/mapa-punktow-szczepien#/";
                //String st = getString(R.string.q12String);
                i.putExtra("Answer", st);
                startActivity(i);
            }
        });
    }
}