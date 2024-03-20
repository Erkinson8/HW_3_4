package com.example.Continent;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.hw_3_4.databinding.ItemContinentBinding;

public class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding itemContinentBinding;

    public ContinentViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.itemContinentBinding = binding;
    }

    public void bind(ContinentModel model) {
        itemContinentBinding.tvContinent.setText(model.getContinentName());
       Glide.with(itemContinentBinding.imgContinent).load(model.getImgContinent()).into(itemContinentBinding.imgContinent);

    }
}
