package com.example.motbot.chemistry;

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
        String[][]masses = (String[][])getIntent().getExtras().get("data");
        String[]names = (String[])getIntent().getExtras().get("names");


        final AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names);
        actv.setAdapter(adapter);
        actv.setThreshold(1);

        EditText mass = (EditText)findViewById(R.id.mass);
        Button storeData = (Button)findViewById(R.id.storeData);


        storeData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = (TextView)findViewById(R.id.output);
                result.setText("Success!");
            }
        });




    }
}
