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

public class FruitAdapter1 extends RecyclerView.Adapter<FruitAdapter1.MyViewHolder12> {
    public ArrayList<Fruits1> fruits1;
    private Context context;
    private LayoutInflater layoutInflater;

    public FruitAdapter1(ArrayList<Fruits1> fruits1,Context context){
        this.fruits1 = fruits1;
        this.context =context;
        this.layoutInflater =LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder12 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.single_fruits1,parent,false);
        return new MyViewHolder12(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder12 holder, int position) {
       holder.recyclerView.setAdapter(new VegetablesAdapter1(context,fruits1.get(position).vegetables121));
       holder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
       holder.recyclerView.setHasFixedSize(true);
       holder.tvHeading.setText(fruits1.get(position).name11);
    }

    @Override
    public int getItemCount() {
        return fruits1.size();
    }

    public class MyViewHolder12 extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        TextView tvHeading;
        public MyViewHolder12(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.rvChapters1);
            tvHeading = (TextView) itemView.findViewById(R.id.tvSubjectName1);
        }
    }
}
