package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Palindromeno extends AppCompatActivity {

    Button btncheck;
    EditText etfirst1;
    TextView tvresult1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindromeno);

        btncheck = findViewById(R.id.btncheck);
        etfirst1 = findViewById(R.id.etfirst1);
        tvresult1 = findViewById(R.id.tvresult1);

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etfirst1.getText())){
                    etfirst1.setError("Please enter number");
                    return;
                }

                int number = Integer.parseInt(etfirst1.getText().toString());

                Logic logic = new Logic();
                boolean result = logic.checkPalindrome(number);
                tvresult1.setText(Boolean.toString(result));
            }
        });
    }
}
