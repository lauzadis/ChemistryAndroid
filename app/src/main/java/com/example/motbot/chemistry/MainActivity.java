package com.example.motbot.chemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String[][]masses = new String[125][2];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillArray(masses);
        final String[] elementNames = names();

        Button molsToGrams = (Button)findViewById(R.id.molsToGrams);
        Button gramsToMols = (Button) findViewById(R.id.gramsToMols);
        Button printArray = (Button) findViewById(R.id.printArray);
        Button modifyData = (Button) findViewById(R.id.modifyData);
        Button contact = (Button)findViewById(R.id.contact);


        molsToGrams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent molsToGramsSwitcher = new Intent(getApplicationContext(), molsToGrams.class);
                molsToGramsSwitcher.putExtra("com.example.motbot.chemistry",masses);
                molsToGramsSwitcher.putExtra("names",elementNames);
                startActivity(molsToGramsSwitcher);
            }
        });

        gramsToMols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gramsToMolsSwitcher = new Intent(getApplicationContext(), gramsToMols.class);
                gramsToMolsSwitcher.putExtra("com.example.motbot.chemistry",masses);
                gramsToMolsSwitcher.putExtra("names",elementNames);
                startActivity(gramsToMolsSwitcher);
            }
        });

        printArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arrayPrinter = new Intent(getApplicationContext(), arrayPrinter.class);
                arrayPrinter.putExtra("com.example.motbot.chemistry",masses);
                arrayPrinter.putExtra("names",elementNames);
                startActivity(arrayPrinter);
            }
        });

        modifyData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dataModify = new Intent(getApplicationContext(), dataModify.class);
                dataModify.putExtra("data",masses);
                dataModify.putExtra("names",elementNames);
                startActivity(dataModify);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactSwitch = new Intent(getApplicationContext(), contact.class);
                startActivity(contactSwitch);
            }
        });



    }


    public void fillArray(String[][] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list[i].length; j++)
            {
                list[i][j] = "";
            }
        }

        list[0][0] = "Placeholder"; list[0][1] = "Placeholder"; // placeholder "element"
        list[1][0] = "Hydrogen"; list[1][1] = "1.008";
        list[2][0] = "Helium"; list[2][1] = "4.0026";
        list[3][0] = "Lithium"; list[3][1] = "6.94";
        list[4][0] = "Beryllium"; list[4][1] = "9.0122";
        list[5][0] = "Boron"; list[5][1] = "10.81";
        list[6][0] = "Carbon"; list[6][1] = "12.01";
        list[7][0] = "Nitrogen"; list[7][1] = "14.007";
        list[8][0] = "Oxygen"; list[8][1] = "15.999";
        list[9][0] = "Fluorine"; list[9][1] = "18.998";
        list[10][0] = "Neon"; list[10][1] = "20.18";
        list[11][0] = "Sodium"; list[11][1] = "22.99";
        list[12][0] = "Magnesium"; list[12][1] = "24.305";
        list[13][0] = "Aluminum"; list[13][1] = "26.982";
        list[14][0] = "Silicon"; list[14][1] = "28.035";
        list[15][0] = "Phosphorus"; list[15][1] = "30.974";
        list[16][0] = "Sulfur"; list[16][1] = "32.06";
        list[17][0] = "Chlorine"; list[17][1] = "35.45";
        list[18][0] = "Argon"; list[18][1] = "39.948";
        list[19][0] = "Potassium"; list[19][1] = "39.098";
        list[20][0] = "Calcium"; list[20][1] = "40.078";
        list[21][0] = "Scandium"; list[21][1] = "44.956";
        list[22][0] = "Titanium"; list[22][1] = "47.867";
        list[23][0] = "Vanadium"; list[23][1] = "50.942";
        list[24][0] = "Chromium"; list[24][1] = "51.996";
        list[25][0] = "Manganese"; list[25][1] = "54.938";
        list[26][0] = "Iron"; list[26][1] = "55.845";
        list[27][0] = "Cobalt"; list[27][1] = "58.933";
        list[28][0] = "Nickel"; list[28][1] = "58.693";
        list[29][0] = "Copper"; list[29][1] = "63.546";
        list[30][0] = "Zinc"; list[30][1] = "65.38";
        list[31][0] = "Gallium"; list[31][1] = "69.723";
        list[32][0] = "Germanium"; list[32][1] = "72.63";
        list[33][0] = "Arsenic"; list[33][1] = "74.922";
        list[34][0] = "Selenium"; list[34][1] = "78.971";
        list[35][0] = "Bromine"; list[35][1] = "79.904";
        list[36][0] = "Krypton"; list[36][1] = "83.798";
        list[37][0] = "Rubidium"; list[37][1] = "85.468";
        list[38][0] = "Strontium"; list[38][1] = "87.62";
        list[39][0] = "Yttrium"; list[39][1] = "88.906";
        list[40][0] = "Zirconium"; list[40][1] = "91.224";
        list[41][0] = "Niobium"; list[41][1] = "92.906";
        list[42][0] = "Molybdenum"; list[42][1] = "95.95";
        list[43][0] = "Ruthenium"; list[43][1] = "101.07";
        list[44][0] = "Rhodium"; list[44][1] = "102.91";
        list[45][0] = "Palladium"; list[45][1] = "106.42";
        list[46][0] = "Silver "; list[46][1] = "107.87";
        list[47][0] = "Cadmium"; list[47][1] = "112.41";
        list[48][0] = "Indium"; list[48][1] = "114.82";
        list[49][0] = "Tin"; list[49][1] = "118.71";
        list[50][0] = "Antimony"; list[50][1] = "121.76";
        list[51][0] = "Tellurium"; list[51][1] = "127.6";
        list[52][0] = "Iodine"; list[52][1] = "126.9";
        list[53][0] = "Xenon"; list[53][1] = "131.29";
        list[54][0] = "Cesium"; list[54][1] = "132.91";
        list[55][0] = "Barium"; list[55][1] = "137.33";
        list[72][0] = "Hafnium"; list[72][1] = "178.49";
        list[73][0] = "Tantalum"; list[73][1] = "180.95";
        list[74][0] = "Tungsten"; list[74][1] = "183.84";
        list[75][0] = "Rhenium"; list[75][1] = "186.21";
        list[76][0] = "Osmium"; list[76][1] = "190.23";
        list[77][0] = "Iridium"; list[77][1] = "192.22";
        list[78][0] = "Platinum"; list[78][1] = "195.08";
        list[79][0] = "Gold"; list[79][1] = "196.97";
        list[80][0] = "Mercury"; list[80][1] = "200.59";
        list[81][0] = "Thallium"; list[81][1] = "204.38";
        list[82][0] = "Lead"; list[82][1] = "207.2";
        list[83][0] = "Bismuth"; list[83][1] = "208.98";
        list[84][0] = "Polonium"; list[84][1] = "209";
        list[85][0] = "Astatine"; list[85][1] = "210";
        list[86][0] = "Radon"; list[86][1] = "222";
        list[87][0] = "Francium"; list[87][1] = "223";
        list[88][0] = "Radium"; list[88][1] = "226";
    }

    public String[] names()
    {
        String[] elementNames = new String[masses.length];
        for(int i = 0; i < masses.length; i++)
        {
            elementNames[i] = masses[i][0];
        }
        return elementNames;
    }
}
