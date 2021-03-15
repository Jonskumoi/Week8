package com.example.myapplication;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button money;
    Button buy;         //luodaan classit
    Button returns;
    TextView field;
    BottleDispenser bd = new BottleDispenser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        money = (Button) findViewById(R.id.button);     //määritetään Buttonit
        buy = (Button) findViewById(R.id.button2);
        returns =  (Button) findViewById(R.id.button3);
        field = findViewById(R.id.textView1);   //textboxin määritys

        money.setOnClickListener(new View.OnClickListener() {       //mitä tapahtuu osto napista
            @Override
            public void onClick(View v) {
                bd.addMoney(field);
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd.buyBottle(field);
            }
        });

        returns.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd.returnMoney(field);
            }
        }));
    }








}