package com.example.assignemnet3;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.UserName);
        et = findViewById(R.id.Password);
    }

    public void Login(View view) {
        String data = et.getText().toString();
        if (data.isEmpty()) {
            Toast.makeText(this, "Please Enter Your Credentials", Toast.LENGTH_LONG).show();
        }
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        i.putExtra("mydata", data);
        startActivity(i);

    }

    public void Register(View view) {
        Intent i = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(i);
    }
}

