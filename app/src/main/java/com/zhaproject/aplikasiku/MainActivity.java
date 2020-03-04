package com.zhaproject.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_soal1, btn_soal2, btn_soal3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inisial();

        btn_soal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, Soal1Activity.class);
                startActivity(intent);
            }
        });

        btn_soal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, Soal2Activity.class);
                startActivity(intent);
            }
        });

        btn_soal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, Soal3Activity.class);
                startActivity(intent);
            }
        });
    }

    void inisial() {
        btn_soal1 = findViewById(R.id.btn_1);
        btn_soal2 = findViewById(R.id.btn_2);
        btn_soal3 = findViewById(R.id.btn_3);
    }
}
