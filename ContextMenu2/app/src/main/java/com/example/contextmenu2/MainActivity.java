package com.example.contextmenu2;
import androidx.appcompat.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        registerForContextMenu(button);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.notification :
                Toast.makeText(this,"Notification", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help :
                Toast.makeText(this,"Help",Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting :
                Toast.makeText(this,"Setting",Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout :
                Toast.makeText(this,"Logout",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }
        return super.onContextItemSelected(item);
    }
}


