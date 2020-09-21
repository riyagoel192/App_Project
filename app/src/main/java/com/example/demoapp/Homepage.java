package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {
    Button b1;
    TextView t1,t2,t3,t4;
    ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        getSupportActionBar().setTitle("Home Page");

        b1= (Button)findViewById(R.id.button3);

        t1= (TextView)findViewById(R.id.buysell);
        t2= (TextView)findViewById(R.id.repair);
        t3= (TextView)findViewById(R.id.food);
        t4= (TextView)findViewById(R.id.education);
        i1= (ImageView)findViewById(R.id.bs);
        i2= (ImageView)findViewById(R.id.rm);
        i3= (ImageView)findViewById(R.id.f);
        i4= (ImageView)findViewById(R.id.edu);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Login_Form.class);
                startActivity(i);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Mobile_Page.class);
                startActivity(i);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Repair_Page.class);
                startActivity(i);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Food_Page.class);
                startActivity(i);
            }
        });

    }
}