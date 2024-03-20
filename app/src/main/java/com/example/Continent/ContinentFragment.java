package com.example.Continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_3_4.CountryAdapter;
import com.example.hw_3_4.CountryFragment;
import com.example.hw_3_4.OnClick;
import com.example.hw_3_4.R;
import com.example.hw_3_4.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnClick {
    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter continentAdapter = new ContinentAdapter(list, this::onClick);
        binding.rvContinent.setAdapter(continentAdapter);
    }
    private void loadData(){
        list.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Eurasia_%28orthographic_projection%29.svg/1200px-Eurasia_%28orthographic_projection%29.svg.png","Eurasia"));
        list.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/African_Union_%28orthographic_projection%29.svg/1024px-African_Union_%28orthographic_projection%29.svg.png","Africa"));
        list.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Location_North_America.svg/1200px-Location_North_America.svg.png","North America"));
        list.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/South_America_%28orthographic_projection%29.svg/1024px-South_America_%28orthographic_projection%29.svg.png","South America"));

    }


    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("continentPosition", position);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace
                (R.id.container, countryFragment).addToBackStack(null).commit();
    }
}