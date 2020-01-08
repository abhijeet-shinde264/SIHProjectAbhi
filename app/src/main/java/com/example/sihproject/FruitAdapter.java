package com.example.sihproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder>{
    public ArrayList<Fruits> fruits;
    private Context context;
    private LayoutInflater layoutInflater;

public FruitAdapter(ArrayList<Fruits> fruits,Context context){
this.fruits = fruits;
this.context =context;
this.layoutInflater =LayoutInflater.from(context);
}

    @NonNull
    @Override
    public FruitAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.single_fruits, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.ViewHolder holder, int position) {
        holder.recyclerView.setAdapter(new VegetablesAdapter(context,fruits.get(position).vegetables12));
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setHasFixedSize(true);
        holder.tvHeading.setText(fruits.get(position).name1);
    }


    @Override
    public int getItemCount() {
        return fruits.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        TextView tvHeading;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.rvChapters);
            tvHeading = (TextView) itemView.findViewById(R.id.tvSubjectName);
        }
    }
}
