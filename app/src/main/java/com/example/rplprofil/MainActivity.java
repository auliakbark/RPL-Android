package com.example.rplprofil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button akbar;
    Button daniel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        akbar = findViewById(R.id.button4);
        daniel = findViewById(R.id.button5);

        akbar.setOnClickListener(view -> {
            Intent akbarIntent = new Intent(getApplicationContext(), ProfilAkbar.class);
            startActivity(akbarIntent);
        });
        daniel.setOnClickListener(view -> {
            Intent danielIntent = new Intent(getApplicationContext(), ProfilDaniel.class);
            startActivity(danielIntent);
        });
    }
}