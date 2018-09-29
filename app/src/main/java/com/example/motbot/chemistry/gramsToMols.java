package com.example.motbot.chemistry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gramsToMols extends AppCompatActivity {

    public String[][] masses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grams_to_mols);

        masses = (String[][])getIntent().getExtras().get("com.example.motbot.chemistry");
        String[] elementNames = (String[])getIntent().getExtras().get("names");


        final AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,elementNames);
        actv.setAdapter(adapter);
        actv.setThreshold(1);

        Button calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText grams = (EditText)findViewById(R.id.grams);
                TextView result = (TextView) findViewById(R.id.result);
                double gramAmount = Double.parseDouble(grams.getText().toString());
                String elementName = actv.getText().toString();
                result.setText(gramAmount / elementalMass(elementName) + " mol");
            }
        });
    }

    public double elementalMass(String n)
    {
        double mass = 0;
        for(int i = 0; i < masses.length; i++) {
            if(masses[i][0].equals(n)) {
                mass = Double.valueOf(masses[i][1]);
            }
        }
        return mass;
    }
}

