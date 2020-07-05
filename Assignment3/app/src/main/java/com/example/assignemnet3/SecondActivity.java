package com.example.assignemnet3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String s = getIntent().getStringExtra("mydata");
        TextView tv = findViewById(R.id.Welcome);
        tv.setText("Welcome To HomePage" );
    }
}

