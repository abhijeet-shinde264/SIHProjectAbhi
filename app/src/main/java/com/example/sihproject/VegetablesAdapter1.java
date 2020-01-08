package com.example.sihproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

public class VegetablesAdapter1 extends RecyclerView.Adapter<VegetablesAdapter1.MyViewHolder1> {
    private Context context1;
    private ArrayList<Vegetables1> vegetables1;
    private LayoutInflater inflater1;

    public VegetablesAdapter1(Context context, ArrayList<Vegetables1> vegetables121) {
        this.context1 = context;
        this.vegetables1 = vegetables121;
        this.inflater1 =LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = inflater1.inflate(R.layout.single_vegis1,parent,false);
        return new MyViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder1 holder, int position) {
        Vegetables1 vegetables11 = vegetables1.get(position);
        holder.tvChapterName.setText(vegetables11.name1);
        Glide.with(context1)
                .load(vegetables11.imageUrl1)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .error(R.drawable.ic_add_to_photos_black_24dp)
                .into(holder.ivChapter);
    }


    @Override
    public int getItemCount() {
        return vegetables1.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder{
        public ImageView ivChapter;
        public TextView tvChapterName;
        public MyViewHolder1(@NonNull View itemView) {
            super(itemView);
            tvChapterName =  itemView.findViewById(R.id.name1);
            ivChapter =  itemView.findViewById(R.id.vigis1);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1 = new Intent(view.getContext(),Buyer_Portal.class);
                    view.getContext().startActivity(i1);
                }
            });
        }
    }
}
