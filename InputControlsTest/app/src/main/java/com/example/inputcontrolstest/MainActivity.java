package com.example.inputcontrolstest;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
        EditText et_name, et_mobile, et_Email, et_password;
        TextView tv;
        RadioButton r_male, r_female;
        String gender;
        CheckBox ch_java, ch_android, ch_python;
        Spinner sp_district, sp_mandal;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                et_name = findViewById(R.id.Name);
                et_mobile = findViewById(R.id.Mobile);
                et_Email = findViewById(R.id.Email);
                et_password = findViewById(R.id.Password);
                r_male = findViewById(R.id.Male);
                r_female = findViewById(R.id.Female);
                ch_java = findViewById(R.id.java);
                ch_android = findViewById(R.id.android);
                ch_python = findViewById(R.id.python);
                tv = findViewById(R.id.result);
                sp_district = findViewById(R.id.districts);
                sp_mandal = findViewById(R.id.mandals);
                ArrayAdapter<CharSequence> district_Adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.district, android.R.layout.simple_spinner_item);
                sp_district.setAdapter(district_Adapter);

                sp_district.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                switch (position)
                                {
                                        case 0:
                                                ArrayAdapter<CharSequence> atp_mandals= ArrayAdapter.createFromResource(MainActivity.this, R.array.Anantapur_Mandal, android.R.layout.simple_spinner_item);
                                                sp_mandal.setAdapter(atp_mandals);
                                                break;

                                        case 1:
                                                ArrayAdapter<CharSequence> kt_mandals= ArrayAdapter.createFromResource(MainActivity.this, R.array.Krishna_Mandal, android.R.layout.simple_spinner_item);
                                                sp_mandal.setAdapter(kt_mandals);
                                                break;
                                }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                });

        }

public void submit(View view) {
        String name = et_name.getText().toString();
        String mobile = et_mobile.getText().toString();
        String Email = et_Email.getText().toString();
        String Password = et_password.getText().toString();
        if(r_male.isChecked())
        {
                gender = r_male.getText().toString();
        }
        if(r_female.isChecked()){
                gender = r_female.getText().toString();
        }

        StringBuilder builder= new StringBuilder();
        if(ch_java.isChecked())
        {
                builder.append(ch_java.getText().toString()+ ",");
        }
        if(ch_android.isChecked())
        {
                builder.append(ch_android.getText().toString()+",");
        }
        if(ch_python.isChecked())
        {
                builder.append(ch_python.getText().toString());
        }
        String selectedDistrict = sp_district.getSelectedItem().toString();
        String selectedMandal = sp_mandal.getSelectedItem().toString();


        tv.setText(name + "\n" + mobile + "\n" + Email + "\n" + Password + "\n" +gender + "\n" + builder + "\n" + selectedDistrict + "\n" + selectedMandal);
        }
}