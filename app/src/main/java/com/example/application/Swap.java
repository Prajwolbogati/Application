package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Swap extends AppCompatActivity {
    Button btnswap1;
    EditText etfirst3;
    EditText etsecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);

        btnswap1 = findViewById(R.id.btnswap1);
        etfirst3 = findViewById(R.id.etfirst3);
        etsecond = findViewById(R.id.etsecond);

        btnswap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etfirst3.getText())){
                    etfirst3.setError("Enter first number");
                    return;
                }
                else if (TextUtils.isEmpty(etsecond.getText())){
                    etsecond.setError("Enter second number");
                    return;
                }
                int firstNumber = Integer.parseInt(etfirst3.getText().toString());
                int secondNumber = Integer.parseInt(etsecond.getText().toString());

                Logic logic = new Logic();
                logic.swapNumbers(firstNumber,secondNumber);
                int numberOne = logic.getNumberOne();
                int numberTwo = logic.getNumberTwo();

                etfirst3.setText(Integer.toString(numberTwo));
                etsecond.setText(Integer.toString(numberOne));
            }
        });

    }
}
