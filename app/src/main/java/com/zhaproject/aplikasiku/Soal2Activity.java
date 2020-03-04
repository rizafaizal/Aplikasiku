package com.zhaproject.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Soal2Activity extends AppCompatActivity {
    Button btn_procc;
    EditText edt_input1, edt_input2;
    TextView tv_output;

    String input1 = "", input2 ="";
    int val = 0, val1 = 0, val2 = 0, i = 0, j = 0, found = 0, not_found = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        inisial();
        btn_procc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validation();
            }
        });
    }

    void inisial() {
        btn_procc = findViewById(R.id.btn_procc_anagram);
        edt_input1 = findViewById(R.id.edt_input_anagram1);
        edt_input2 = findViewById(R.id.edt_input_anagram2);
        tv_output = findViewById(R.id.tv_output_anagram);
    }

    void validation() {
        input1 = edt_input1.getText().toString().trim();
        input2 = edt_input2.getText().toString().trim();

        if (input1.length() > 0 && input2.length() > 0) {
            output();
        }else {
            Toast.makeText(this, "Kolom tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
    }

    void output() {
        val1 = input1.length();
        val2 = input2.length();
        if (val1 == val2) {
            val = val1;

            for (i = 0; i < val; i++) {
                found = 0;
                for (j = 0; j < val; j++) {
                    if (input1.charAt(i) == input2.charAt(j)) {
                        found = 1;
                        break;
                    }
                }

                if (found == 0) {
                    not_found = 1;
                    break;
                }
            }

            if (not_found == 1) {
                Toast.makeText(this, "Kedua kata tidak termasuk anagram!", Toast.LENGTH_LONG).show();
                tv_output.setText("Kedua kata tidak termasuk anagram!");
                not_found = 0;
            } else {
                Toast.makeText(this, "Kedua kata termasuk anagram!", Toast.LENGTH_LONG).show();
                tv_output.setText("Kedua kata termasuk anagram!");
            }
        } else {
            Toast.makeText(this, "Jumlah kata tidak sama!", Toast.LENGTH_LONG).show();
            tv_output.setText("");
        }
    }
}
