package com.example.motbot.chemistry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class balance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);


        Button calculate = (Button)findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private String balancer(String eq)
    {
        String reactants = eq.substring(0,eq.indexOf("="));
        String products = eq.substring(eq.indexOf("=")+1);

        reactants.trim();
        products.trim();

        

    }
}


