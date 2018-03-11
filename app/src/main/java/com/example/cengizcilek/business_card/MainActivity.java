package com.example.cengizcilek.business_card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the contact mail adreess is clicked.
     */

    public void contact(View view) {


        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"contact@skalafilm.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "İnformation Request ");
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }


    }

    /**
     * This method is called when any of the web adress or companypicture or companylogo is clicked.
     */

    public void openweb(View v) {
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.skalafilm.com"));
        startActivity(browserIntent);
    }
}
