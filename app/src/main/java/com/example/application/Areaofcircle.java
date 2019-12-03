package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Areaofcircle extends AppCompatActivity {
    Button btncalculate;
    EditText etfirst;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaofcircle);

        btncalculate = findViewById(R.id.btncalculate);
        etfirst = findViewById(R.id.etfirst);
        tvresult = findViewById(R.id.tvresult);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etfirst.getText())) {
                    etfirst.setError("Please enter radius");
                    return;
                }
                double radius = Double.parseDouble(etfirst.getText().toString());

                Logic logic = new Logic();
                double area = logic.calculateRadius(radius);
                tvresult.setText("Area = " + Double.toString(area).substring(0, 8));
            }
            });


    }
}



