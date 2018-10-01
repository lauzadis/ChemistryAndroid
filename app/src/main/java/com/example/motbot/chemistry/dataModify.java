package com.example.motbot.chemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dataModify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_modify);
        final String[][]masses = (String[][])getIntent().getExtras().get("data");
        String[]names = (String[])getIntent().getExtras().get("names");


        final AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names);
        actv.setAdapter(adapter);
        actv.setThreshold(1);

        final TextView output = (TextView)findViewById(R.id.output);
        Button storeData = (Button)findViewById(R.id.storeData);


        storeData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mass = (EditText)findViewById(R.id.mass);

               /* TextView result = (TextView)findViewById(R.id.output);
                String name = actv.getText().toString();
                Double x = Double.valueOf(mass.getText().toString());
                masses[findIndex(masses,name)][1] = x.toString();
                MainActivity.masses=masses;*/
               output.setText("Success!");

            }
        });
    }

    public int findIndex(String[][] list, String s)
    {
        for(int i = 0 ; i < list.length; i++)
        {
            if(list[i][0].equals(s))
                return i;
        }
        return 0;
    }
}
