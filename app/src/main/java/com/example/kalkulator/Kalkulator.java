package com.example.kalkulator;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kalkulator.R;

public class Kalkulator extends AppCompatActivity {

    EditText edAngka1;
    EditText edAngka2;
    Button btnPlus;
    Button btnMinus;
    Button btnMultiple;
    Button btnDivide;
    TextView txtResult;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator.xml);

        edAngka1 = findViewById(R.id.edAngka1);
        edAngka2 = findViewById(R.id.edAngka2);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiple = findViewById(R.id.btnMultiple);
        btnDivide = findViewById(R.id.btnDivide);
        txtResult = findViewById(R.id.txtResult);
        btnClear = findViewById(R.id.btnClear);

        //ini commit
        btnPlus.setOnClickListener(view -> {
            try {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());
                int result = angka1 + angka2;
                txtResult.setText("Hasil Penjumlahan dari " + angka1 + " + " + angka2 + " adalah : " + result);
            } catch (Exception e) {
                Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show();
            }
        });

        btnMinus.setOnClickListener(view -> {
            try {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());
                int result = angka1 - angka2;
                txtResult.setText("Hasil Pengurangan dari " + angka1 + " - " + angka2 + " adalah : " + result);
            } catch (Exception e) {
                Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show();
            }
        });


        // hkjkjh
        btnMultiple.setOnClickListener(view -> {
            try {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());
                int result = angka1 * angka2;
                txtResult.setText("Hasil Perkalian dari " + angka1 + " * " + angka2 + " adalah : " + result);
            } catch (Exception e) {
                Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show();
            }
        });

        btnDivide.setOnClickListener(view -> {
            try {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());
                if (angka2 == 0) {
                    txtResult.setText("Tidak bisa dibagi 0");
                } else {
                    int result = angka1 / angka2;
                    txtResult.setText("Hasil Pembagian dari " + angka1 + " / " + angka2 + " adalah : " + result);
                }
            } catch (Exception e) {
                Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show();
            }
        });

        btnClear.setOnClickListener(view -> {
            edAngka1.setText("");
            edAngka2.setText("");
            txtResult.setText("Hasil: -");
            Toast.makeText(this, "Form Clear", Toast.LENGTH_SHORT).show();
        });
    }
}
