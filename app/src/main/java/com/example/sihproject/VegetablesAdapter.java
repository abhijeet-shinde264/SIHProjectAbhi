package com.example.sihproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

public class VegetablesAdapter extends RecyclerView.Adapter<VegetablesAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Vegetables> vegetables;
    private LayoutInflater inflater;

   /* public VegetablesAdapter(Context context, ArrayList<Vegetables> vegetables, LayoutInflater inflater) {
        this.context = context;
        this.vegetables = vegetables;
        this.inflater = inflater;
    }*/

    public VegetablesAdapter(Context context, ArrayList<Vegetables> vegetables12) {
        this.context = context;
        this.vegetables = vegetables12;
        this.inflater =LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = inflater.inflate(R.layout.single_vegis, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       Vegetables vegetables1 = vegetables.get(position);
        holder.tvChapterName.setText(vegetables1.name);
        //Picasso.get().load(chapter.imageUrl).into(holder.ivChapter);
        Glide.with(context)
                .load(vegetables1.imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .error(R.drawable.ic_add_to_photos_black_24dp)
                .into(holder.ivChapter);
    }


    @Override
    public int getItemCount() {
        return vegetables.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivChapter;
        public TextView tvChapterName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvChapterName =  itemView.findViewById(R.id.name);
            ivChapter =  itemView.findViewById(R.id.vigis);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), Farmer_Portal.class);
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}
