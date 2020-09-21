package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Shahi extends AppCompatActivity {

    Button b1,b2,b3;
    int minteger = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shahi);

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
        minteger = minteger + 1;

        if(minteger>1)
        {
            b3.setEnabled(true);
        }

        if(minteger<4)
        {
            display(minteger);
        }

        else
        {
            Toast.makeText(getApplicationContext(), "तीन के बाद मात्रा को पार नहीं किया जा सकता है", Toast.LENGTH_LONG).show();
            b2.setEnabled(false);
        }
    }

    public void decreaseInteger(View view)
    {
        minteger = minteger - 1;

        if(minteger<1)
        {
            Toast.makeText(getApplicationContext(), "मात्रा नकारात्मक नहीं जा सकती", Toast.LENGTH_LONG).show();
            b3.setEnabled(false);
        }

        else
        {
            display(minteger);
        }
    }

    private void display(int number)
    {
        TextView displayInteger = (TextView)findViewById(R.id.integer_number);
        displayInteger.setText(""+ number);
    }
}