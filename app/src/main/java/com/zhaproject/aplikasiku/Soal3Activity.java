package com.zhaproject.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Soal3Activity extends AppCompatActivity {
    Button btn_procc;
    EditText edt_angkaN, edt_angkaR;
    TextView tv_output;

    String input1 = "", input2 ="";
    int n,r,m,Permutasi;
    int Fak1,Fak2,Fak3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);

        inisial();
        btn_procc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validation();
            }
        });
    }

    void inisial() {
        btn_procc = findViewById(R.id.btn_procc_permutasi);
        edt_angkaN = findViewById(R.id.edt_input_permutasi_n);
        edt_angkaR = findViewById(R.id.edt_input_permutasi_r);
        tv_output = findViewById(R.id.tv_output_permutasi);
    }

    void validation() {
        input1 = edt_angkaN.getText().toString().trim();
        input2 = edt_angkaR.getText().toString().trim();

        if (input1.length() > 0 && input2.length() > 0) {
            output();
        }else {
            Toast.makeText(this, "Kolom tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
    }

    void output() {
        Fak1=Fak2=Fak3=1;
        n = Integer.parseInt(input1);
        r = Integer.parseInt(input2);
        m = n - r;

        if( n <= 0){
            Toast.makeText(this, "Angka yang dimasukan salah!", Toast.LENGTH_LONG).show();
        } else{
            while( n > 0 ){
                Fak1 = Fak1 * n;
                n = n - 1;
            }
            while(m > 0){
                Fak2 = Fak2 * m;
                m = m - 1;
            }
        }
        Permutasi=Fak1 / Fak2;
        tv_output.setText(""+Permutasi);
    }
}
