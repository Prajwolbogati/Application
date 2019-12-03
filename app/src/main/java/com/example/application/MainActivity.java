package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAreaofcircle, btnpalindromeno, btnreverseno, btnswap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAreaofcircle = findViewById(R.id.btnAreaofcircle);
        btnpalindromeno = findViewById(R.id.btnpalindromeno);
        btnreverseno = findViewById(R.id.btnreverse);
        btnswap = findViewById(R.id.btnswap);

        btnAreaofcircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Areaofcircle.class);
                startActivity(intent);
            }
        });

        btnpalindromeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Palindromeno.class);
                startActivity(intent);
            }
        });

        btnreverseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Reverseno.class);
                startActivity(intent);
            }
        });

        btnswap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Swap.class);
                startActivity(intent);
            }
        });
    }


}
