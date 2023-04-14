package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.dashboard.dashboard;

public class MainActivity extends AppCompatActivity {

    Button btnModule1, btnModule2, MenuPerhitungan, btnDashboard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnModule1 = findViewById(R.id.btnModule1);
        btnModule2 = findViewById(R.id.btnModule2);
        MenuPerhitungan = findViewById(R.id.btnPerhitungan);
        btnDashboard = findViewById(R.id.btnDashboard);



        btnModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity.this, Module1.class);
                startActivity(intent);
            }
        });


        btnModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity.this, Module2.class);
                startActivity(intent);
            }
        });

        MenuPerhitungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuPerhitungan.class);
                startActivity(intent);
            }
        });

        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dashboard.class);
                startActivity(intent);
            }
        });
    }
}