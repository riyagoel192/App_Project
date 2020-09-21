package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Form extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;

    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login__form);
        getSupportActionBar().setTitle("Login Form");

        b1 = (Button)findViewById(R.id.login);
        b2 = (Button)findViewById(R.id.signup);

        e1 = (EditText) findViewById(R.id.email);
        e2 = (EditText) findViewById(R.id.password);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("admin") &&
                        e2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "मुखपृष्ठ पर पुनर्निर्देशित करना", Toast.LENGTH_SHORT).show();
                    Intent i= new Intent(getApplicationContext(),Homepage.class);
                    startActivity(i);

                } else {
                    Toast.makeText(getApplicationContext(), "गलत प्रत्यक्ष पत्र", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "पृष्ठ साइन अप करने के लिए पुनर्निर्देशित करना", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),Signup_Form.class);
                startActivity(i);
            }
        });
}
}