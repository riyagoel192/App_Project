package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Landing Page");

        b1= (Button)findViewById(R.id.start);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Homepage.class);
                startActivity(i);
            }
        });


    }
}