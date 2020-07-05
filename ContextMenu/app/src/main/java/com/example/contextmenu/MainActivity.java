package com.example.contextmenu;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String Stores[]={"Store 1","Store 2","Store 3","store 4","Store 5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Stores);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId()==R.id.coupoun){
            Toast.makeText(getApplicationContext(),"Coupoun is selected",Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.cashback){
            Toast.makeText(getApplicationContext(),"Cashback is selected",Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.deals){
            Toast.makeText(getApplicationContext(),"Deals is selected",Toast.LENGTH_LONG).show();
        }
        return true;
    }
}