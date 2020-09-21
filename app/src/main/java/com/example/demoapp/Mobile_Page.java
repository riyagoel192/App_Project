package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mobile_Page extends AppCompatActivity {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile__page);

        b1= (Button)findViewById(R.id.buy);
        b2= (Button)findViewById(R.id.sell);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "मुखपृष्ठ पर पुनर्निर्देशित करना", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),Newpage.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "आइटम बिक्री के लिए जोड़ा गया", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),Sell_Form.class);
                startActivity(i);
            }
        });
    }
}