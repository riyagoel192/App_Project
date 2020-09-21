package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Rasmalai extends AppCompatActivity {

    Button b1,b2,b3;
    int minteger = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rasmalai);

        b1 = (Button)findViewById(R.id.order);
        b2 = (Button)findViewById(R.id.increase);
        b3 = (Button)findViewById(R.id.decrease);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "कार्ट में जोड़ा गया", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void increaseInteger(View view)
    {
//        minteger = minteger + 1;
//        if(minteger>4)
//        {
//            Toast.makeText(getApplicationContext(), "Quantity can't be exceeded after three", Toast.LENGTH_SHORT).show();
//            b2.setEnabled(false);
//        }
//
//        else
//        {
//            display(minteger);
//        }
        b2.setEnabled(false);
    }

    public void decreaseInteger(View view)
    {
//        minteger = minteger - 1;
//
//        if(minteger<1)
//        {
//            Toast.makeText(getApplicationContext(), "Quantity can't go negative", Toast.LENGTH_SHORT).show();
//            b1.setEnabled(false);
//        }
//
//        else
//        {
//            display(minteger);
//        }
        b3.setEnabled(false);
    }

    private void display(int number)
    {
        TextView displayInteger = (TextView)findViewById(R.id.integer_number);
        displayInteger.setText(""+ number);
    }
}