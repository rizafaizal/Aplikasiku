package com.zhaproject.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Soal1Activity extends AppCompatActivity {
    Button btn_procc;
    EditText edt_input;
    TextView tv_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);

        inisial();
        btn_procc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validation();
            }
        });
    }

    void inisial() {
        btn_procc = findViewById(R.id.btn_procc_fibonacci);
        edt_input = findViewById(R.id.edt_input_fibonacci);
        tv_output = findViewById(R.id.tv_output_fibonacci);
    }

    void validation() {
        String input = edt_input.getText().toString().trim();

        if (input.length() > 0) {
            output();
        }else {
            Toast.makeText(this, "Kolom tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
    }

    void output() {
        int n = Integer.parseInt(edt_input.getText().toString());
        tv_output.setText(getFibonacci(n));
    }

    public static int fibonacci(int n) {
        int prev1 = 0, prev2 = 1;
        for(int i = 0; i < n; i++) {
            int savePrev1 = prev1;
            prev1 = prev2;
            prev2 = savePrev1 + prev2;
        }
        return prev1;
    }

    public static String getFibonacci(int n) {
        StringBuilder sb = new StringBuilder(fibonacci(0));
        for (int i = 1; i < n; ++i) {
            sb.append(", ");
            sb.append(fibonacci(i));
        }
        return sb.toString();
    }
}
