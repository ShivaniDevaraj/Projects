package com.example.implicitintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Address;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openURL(View view) {
        Uri u = Uri.parse("http://www.google.com");
        Intent i = new Intent(Intent.ACTION_VIEW, u);
        startActivity(i);
    }

    public void call(View view) {
        Uri a = Uri.parse("tel:1234567899");
        Intent i = new Intent(Intent.ACTION_DIAL, a);
        startActivity(i);
    }

    public void mylocation(View view) {

        //Uri gmmIntentUri = Uri.parse("geo:16.4649, 80.5078?q=<16.4649, <80.5078>");
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=restaurents");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");

        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }

    }
}