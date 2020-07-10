package com.example.recycleviewandroid;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.recycler);
        int images[] = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r};
        String codename[] = {"Alpha","Beta","Cupcake","Donut","Eclair","Froyo","Gingerbread","Honeycomb","Ice Cream Sandwich","Jelly Bean","KitKat","Lollipop","Marshmallow","Nougat","Oreo","Pie","Q or Android 10","R or Android 11"};
        String version[] = {"1.0","1.1","1.5","1.6","2.0 - 2.1","2.2 - 2.2.3","2.3 - 2.3.7","3.0 - 3.2.6","4.0 - 4.0.4","4.1 - 4.3.1","4.4 - 4.4.4","5.0 - 5.1.1","6.0 - 6.0.1","7.0 - 7.1.2","8.0 - 8.1","9.0","10.0","11.0"};
        String apilevels[] = {"1","2","3","4","5 - 7","8","9 - 10","11 - 13","14 - 15","16 - 18","19 - 20","21 - 22","23","24 - 25","26 - 27","28","29","30"};
        String releasedate[] = {"23, September, 2008","9, February, 2009","27, April, 2009","15, September, 2009","26, October, 2009","20, May, 2010","6, December, 2010","22, February, 2011","18, October, 2011","9, July, 2012","31, October, 2013","12, November, 2014","5, October, 2015","22, August, 2016","21, August, 2017","6, August, 2018","3, September, 2019","19, February, 2020"};

        rv.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(this,images,codename,version,apilevels,releasedate);
        rv.setAdapter(adapter);


    }
}