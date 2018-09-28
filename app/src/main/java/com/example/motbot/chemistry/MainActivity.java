package com.example.motbot.chemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button molsToGrams = (Button)findViewById(R.id.molsToGrams);
        Button gramsToMols = (Button) findViewById(R.id.gramsToMols);
        Button printArray = (Button) findViewById(R.id.printArray);

        molsToGrams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent molsToGramsSwitcher = new Intent(getApplicationContext(), molsToGrams.class);
                startActivity(molsToGramsSwitcher);
            }
        });

        gramsToMols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gramsToMolsSwitcher = new Intent(getApplicationContext(), gramsToMols.class);
                startActivity(gramsToMolsSwitcher);
            }
        });

        printArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arrayPrinter = new Intent(getApplicationContext(), arrayPrinter.class);
                startActivity(arrayPrinter);
            }
        });


    }
}
