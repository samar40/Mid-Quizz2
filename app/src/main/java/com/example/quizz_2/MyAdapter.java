package com.example.quizz_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList<Car> car;
    public MyAdapter(Context context, ArrayList<Car> list)
    {
        car = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView tvBname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBname= itemView.findViewById(R.id.tvBname);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvBname.setText(car.get(position).getBName());
        holder.itemView.setTag(car.get(position));

    }

    @Override
    public int getItemCount() {
        return car.size();
    }
}
