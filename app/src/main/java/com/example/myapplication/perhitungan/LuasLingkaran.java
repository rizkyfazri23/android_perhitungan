package com.example.myapplication.perhitungan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class LuasLingkaran extends AppCompatActivity {

    EditText r;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        r = findViewById(R.id.etNilaiJariJari);
        hitung = findViewById(R.id.btnHitung);
        hasil = findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //jika panjang dan lebar tidak diisiii akan tampil notif ewoww
                if (r.length() == 0){
                    Toast.makeText(getApplication(), "jari-jari harus diisi coy!",
                            Toast.LENGTH_LONG).show();
                }else{
                    //ubah dari text ke string
                    String isiJariJari = r.getText().toString();

                    //ubah dari string ke double
                    double rr = Double.parseDouble(isiJariJari);
                    double hs = LuasLingkaran(rr);

                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }

    public double LuasLingkaran(double r){
        return 3.14*r*r;
    }

}
