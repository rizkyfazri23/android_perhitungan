package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.perhitungan.KonversiSuhu;
import com.example.myapplication.perhitungan.LuasLingkaran;
import com.example.myapplication.perhitungan.LuasPersegiPanjang;
import com.example.myapplication.perhitungan.LuasSegitiga;

public class MenuPerhitungan extends AppCompatActivity {

    Button lpp, lst, ll, ks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_perhitungan);

        lpp = findViewById(R.id.btnPersegiPanjang);
        lst = findViewById(R.id.btnSegiTiga);
        ll  = findViewById(R.id.btnLingkaran);
        ks  = findViewById(R.id.btnSuhu);


        lpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPerhitungan.this,LuasPersegiPanjang.class);
                startActivity(intent);
            }
        });

        lst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPerhitungan.this, LuasSegitiga.class);
                startActivity(intent);
            }
        });

        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPerhitungan.this, LuasLingkaran.class);
                startActivity(intent);

            }
        });

        ks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPerhitungan.this, KonversiSuhu.class);
                startActivity(intent);

            }
        });
    }
}