package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Reverseno extends AppCompatActivity {

    Button btnreverse;
    EditText etfirst2;
    TextView tvresult2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverseno);

        btnreverse = findViewById(R.id.btnreverse);
        etfirst2 = findViewById(R.id.etfirst2);
        tvresult2 = findViewById(R.id.tvresult2);

        btnreverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (TextUtils.isEmpty(etfirst2.getText())){
                   etfirst2.setError("Please enter a number");
                   return;

               }

int numberToReverse = Integer.parseInt(etfirst2.getText().toString());

               Logic logic = new Logic();
               int reversedNumber = logic.reverseNumber(numberToReverse);
               tvresult2.setText(Integer.toString(reversedNumber));
            }
        });
    }
}
