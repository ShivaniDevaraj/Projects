package com.example.assignment1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    TextView tv;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        tv=findViewById(R.id.textcount);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                a++;
                tv.setText(""+a);

            }
        });

         b2=findViewById(R.id.button2);
         tv=findViewById(R.id.textcount);
         b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Action
                    a--;
                    tv.setText(""+a);

                }

        });

        b3=findViewById(R.id.button3);
        tv=findViewById(R.id.textcount);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                a=0;
                tv.setText("0");

            }

        });

        if (savedInstanceState != null){
            String s = savedInstanceState.getString("shiv");
            tv.setText(s);

        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("shiv", tv.getText().toString());
    }

    public void display(View view) {
        Toast.makeText(this, "Your Count is: "+a, Toast.LENGTH_SHORT ).show();
    }
}