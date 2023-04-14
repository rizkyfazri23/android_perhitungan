package com.example.myapplication.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class LuasSegitiga extends AppCompatActivity {

    EditText a, t;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        a = findViewById(R.id.etNilaiAlas);
        t = findViewById(R.id.etNilaiTinggi);
        hitung = findViewById(R.id.btnHitung);
        hasil = findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //jika panjang dan lebar tidak diisiii akan tampil notif ewoww
                if (a.length() == 0 && t.length() == 0){
                    Toast.makeText(getApplication(), "alas dan tinggi harus diisi coy",
                            Toast.LENGTH_LONG).show();
                }else if (a.length() == 0) {
                    Toast.makeText(getApplication(), "alas harus diisi coy",
                            Toast.LENGTH_LONG).show();
                }else if (t.length() == 0) {
                    Toast.makeText(getApplication(), "tinggi harus diisi coy",
                            Toast.LENGTH_LONG).show();
                }else{
                    //ubah dari text ke string
                    String isiAlas = a.getText().toString();
                    String isiTinggi = t.getText().toString();

                    //ubah dari string ke double
                    double al = Double.parseDouble(isiAlas);
                    double ti = Double.parseDouble(isiTinggi);
                    double hs = LuasSegitiga(al, ti);

                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }

    public double LuasSegitiga(double a, double t){
        return 0.5 * a * t;
    }

}