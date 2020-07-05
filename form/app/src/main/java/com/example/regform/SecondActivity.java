package com.example.regform;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


    public class SecondActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            //actionbar title
            ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle("DetailsActivity");

            //intent to get data
            Intent intent = getIntent();
            String name = intent.getStringExtra("NAME");
            String rollno = intent.getStringExtra("ROLLNO");
            String email = intent.getStringExtra("EMAIL");
            String pass = intent.getStringExtra("PASSWORD");
            String phone = intent.getStringExtra("PHONE");
            String gender = intent.getStringExtra("GENDER");
            String Branch = intent.getStringExtra("BRANCH");



            //TextView
            TextView mResultTv = findViewById(R.id.resultTv);

            //setText
            mResultTv.setText("Name: " + name + "\nRollNo: "+rollno + "\nEmail: " + email + "\nPassword: "+pass + "\nPhone: " + phone+ "\nGender: "+gender+ "\nBranch: "+Branch);

        }
    }
