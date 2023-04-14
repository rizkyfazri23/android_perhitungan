package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Module2 extends AppCompatActivity {

    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);

        txtHasil = findViewById(R.id.hasil);

        int hasil, a, b;
        a=10;
        b=20;

        hasil = a+b;


        txtHasil.setText(String.valueOf(hasil));
    }
}