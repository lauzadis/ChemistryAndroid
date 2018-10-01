package com.example.motbot.chemistry;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ImageButton gmail = (ImageButton)findViewById(R.id.gmail);
        ImageButton twitter = (ImageButton)findViewById(R.id.twitter);

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /*Intent sendMail = new Intent(Intent.ACTION_SEND);
                sendMail.putExtra(Intent.EXTRA_EMAIL,"matas.lauzadis@gmail.com");
                sendMail.putExtra(Intent.EXTRA_SUBJECT,"Chemistry App");
                sendMail.setType("message/rfc822");
                startActivity(Intent.createChooser(sendMail,"Choose an email client"));*/
               Uri uri = Uri.parse("mailto:\"matas.lauzadis@gmail.com\"");
               Intent sendMail = new Intent(Intent.ACTION_VIEW, uri);
               startActivity(sendMail);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://twitter.com/mataslauzadis");
                Intent twitterPage = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(twitterPage);
            }
        });
    }
}
