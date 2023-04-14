package com.example.myapplication.perhitungan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class KonversiSuhu extends AppCompatActivity {

    EditText c;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);

        c = findViewById(R.id.etNilaiCelcius);
        hitung = findViewById(R.id.btnHitung);
        hasil = findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //jika panjang dan lebar tidak diisiii akan tampil notif ewoww
                if (c.length() == 0){
                    Toast.makeText(getApplication(), "celcius harus diisi coy!",
                            Toast.LENGTH_LONG).show();
                }else{
                    //ubah dari text ke string
                    String isiCelcius = c.getText().toString();

                    //ubah dari string ke double
                    double ce = Double.parseDouble(isiCelcius);
                    double hs = ConvertFahrenheit(ce);

                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }

    public double ConvertFahrenheit(double c){
        return (c * 1.8) + 32;
    }

}
