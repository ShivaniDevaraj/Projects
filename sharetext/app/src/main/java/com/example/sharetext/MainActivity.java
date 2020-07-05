package com.example.sharetext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.UserName);

    }

    public void Share(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        String sms = et.getText().toString();
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,sms);
        startActivity(Intent.createChooser(i,"Share via"));
    }
}