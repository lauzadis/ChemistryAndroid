package com.example.motbot.chemistry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class molsToGrams extends AppCompatActivity {


    public String[][] masses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mols_to_grams);

        masses = (String[][]) getIntent().getExtras().get("com.example.motbot.chemistry");
        String[] elementNames = (String[]) getIntent().getExtras().get("names");


        final AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, elementNames);
        actv.setAdapter(adapter);
        actv.setThreshold(1);

        Button calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText mols = (EditText) findViewById(R.id.mols);
                TextView grams = (TextView) findViewById(R.id.grams);
                double molAmount = Double.parseDouble(mols.getText().toString());
                String elementName = actv.getText().toString();

                grams.setText(molAmount * elementalMass(elementName) + " g");
            }
        });
    }

    public double elementalMass(String n) {
        double mass = 0;
        for (int i = 0; i < masses.length; i++) {
            if (masses[i][0].equals(n)) {
                mass = Double.valueOf(masses[i][1]);
            }
        }
        return mass;
    }
}

