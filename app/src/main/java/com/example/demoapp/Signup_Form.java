package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class Signup_Form extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__form);
        getSupportActionBar().setTitle("SignUp Form");

        b1= (Button)findViewById(R.id.register);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Login_Form.class);
                startActivity(i);
            }
        });
    }
}