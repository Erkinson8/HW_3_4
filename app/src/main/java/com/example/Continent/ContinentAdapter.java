package com.example.Continent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_4.OnClick;
import com.example.hw_3_4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder>{
    private ArrayList<ContinentModel> continentModel;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentModel, OnClick onClick) {
        this.continentModel = continentModel;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.
                from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
      holder.bind(continentModel.get(position));
      holder.itemView.setOnClickListener(v -> {
          onClick.onClick(position);
      });
    }

    @Override
    public int getItemCount() {
        return continentModel.size();
    }
}
