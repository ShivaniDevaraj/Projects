package com.example.regform;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    String gender;
    RadioButton r_male, r_female;
    Spinner sp_Branch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("MainActivity");

        //EditText
        final EditText mNameEt = findViewById(R.id.nameEt);
        final EditText mEmailEt = findViewById(R.id.emailEt);
        final EditText mPhoneEt = findViewById(R.id.phoneEt);
        final EditText mrollnoEt = findViewById(R.id.rollnoEt);
        final EditText mpassEt = findViewById(R.id.passEt);
        r_male = findViewById(R.id.Male);
        r_female = findViewById(R.id.Female);
        sp_Branch = findViewById(R.id.Branch);

        ArrayAdapter<CharSequence> district_Adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.Branch, android.R.layout.simple_spinner_item);
        sp_Branch.setAdapter(district_Adapter);


        //Button
        Button mSaveBtn = findViewById(R.id.saveBtn);

        //button click listener
        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from edit text
                String name = mNameEt.getText().toString();
                String rollno = mrollnoEt.getText().toString();
                String email = mEmailEt.getText().toString();
                String phone = mPhoneEt.getText().toString();
                String pass = mpassEt.getText().toString();

                if(r_male.isChecked())
                {
                    gender = r_male.getText().toString();
                }
                if(r_female.isChecked()){
                    gender = r_female.getText().toString();
                }

                String selectedBranch = sp_Branch.getSelectedItem().toString();



                //activity intent
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("ROLLNO", rollno);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PHONE", phone);
                intent.putExtra("PASSWORD", pass);
                intent.putExtra("GENDER", gender);
                intent.putExtra("BRANCH", selectedBranch);

                startActivity(intent);

            }
        });
    }
}




