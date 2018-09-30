package com.example.motbot.chemistry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Objects;


public class arrayPrinter extends AppCompatActivity {
    public String[][]masses;
    public String[] elementNames;
    static final int OUT = 0;
    static final int IN = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_printer);
        masses = (String[][]) getIntent().getExtras().get("com.example.motbot.chemistry");
        elementNames = (String[]) getIntent().getExtras().get("names");

        final TextView elements = (TextView) findViewById(R.id.elements);
        elements.setMovementMethod(new ScrollingMovementMethod());
        elements.setText(printArray(masses));
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, elementNames);
        actv.setAdapter(adapter);
        actv.setThreshold(1);
        actv.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }


            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().equals(""))
                    elements.setText(printArray(masses));

                else if(nameExists(masses,s.toString())) {
                    elements.setText("Element - Mass\n\n" + s.toString() + " - " + elementalMass(s.toString()));
                }

                else{
                    String result ="Element - Mass\n\n";
                   for(int i = 0; i < masses.length; i++)
                   {
                       if(masses[i][0].toLowerCase().startsWith(s.toString()) || masses[i][0].toUpperCase().startsWith(s.toString()) || masses[i][0].startsWith(s.toString()))
                           result+= masses[i][0] + " - " + elementalMass(masses[i][0]) + "\n";
                   }
                   elements.setText(result);
                }
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
    public String printArray(String[][] list)
    {
        String result = "Element - Mass\n\n";
        for(int i = 1; i < 56; i++)
        {
            for(int j = 0; j < list[i].length; j++)
            {
                if(j==0)
                    result += list[i][j] + " - ";
                else
                    result += list[i][j];
            }
            result += "\n";
        }

        for(int x = 72; x < 89; x++)
        {
            for(int y = 0; y < list[x].length; y++)
            {
                if(y==0)
                    result+= list[x][y] + " - ";
                else
                    result+= list[x][y];
            }
            result += "\n";
        }

        return result;
    }

    public boolean nameExists(String[][] list, String s)
    {
        for(int i = 0; i < list.length; i++)
        {
                if(list[i][0].equals(s))
                    return true;
        }
        return false;
    }

}
