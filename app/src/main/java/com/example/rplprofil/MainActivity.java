package com.example.rplprofil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button akbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        akbar = findViewById(R.id.button4);

        akbar.setOnClickListener(view -> {
            Intent akbarIntent = new Intent(getApplicationContext(), ProfilAkbar.class);
            startActivity(akbarIntent);
        });
    }
}