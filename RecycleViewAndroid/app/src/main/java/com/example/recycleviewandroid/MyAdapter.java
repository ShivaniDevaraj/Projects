package com.example.recycleviewandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int Images[];
    String CodeNames[], VersionsNo[], APILevel[], Dates[];
    Context ct;

    public MyAdapter(MainActivity mainActivity, int[] images, String[] codename, String[] version, String[] apilevels, String[] releasedate) {

        Images = images;
        CodeNames = codename;
        VersionsNo = version;
        APILevel = apilevels;
        Dates = releasedate;
        ct = mainActivity;

    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.products,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        holder.iv.setImageResource(Images[position]);
        holder.CN.setText(CodeNames[position]);
        holder.version.setText(VersionsNo[position]);
        holder.API.setText(APILevel[position]);
        holder.dates.setText(Dates[position]);

    }

    @Override
    public int getItemCount() {
        return Images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView CN,version,API,dates;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.image);
            cardView = itemView.findViewById(R.id.cardview);
            CN = itemView.findViewById(R.id.CodeName);
            version = itemView.findViewById(R.id.VersionNumber);
            API = itemView.findViewById(R.id.APILevel);
            dates = itemView.findViewById(R.id.ReleaseDate);

        }
    }
}