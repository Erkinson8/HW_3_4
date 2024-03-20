package com.example.hw_3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_3_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private ArrayList<CountryModel> countryModels = new ArrayList<>();
    private int position;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("continentPosition", 0);
        checkPosition(position);
        CountryAdapter countryAdapter = new CountryAdapter(countryModels);
        binding.rvCountry.setAdapter(countryAdapter);
    }

    private void checkPosition(int position) {
        switch (position) {
            case 0:
                loadEurasia();
                break;
            case 1:
                loadAfrica();
                break;
            case 2:
                loadNorthAmerica();
                break;
            case 3:
                loadSouthAmerica();
                break;
        }
    }

    private void loadSouthAmerica() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/250px-Flag_of_Brazil.svg.png","Brazil"));
        countryModels.add(new CountryModel("https://img.freepik.com/free-vector/illustration-of-argentina-flag_53876-27120.jpg?size=626&ext=jpg&ga=GA1.1.1292351815.1709683200&semt=ais","Argentina"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/1200px-Flag_of_Chile.svg.png","Chili"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_of_Ecuador.svg/1200px-Flag_of_Ecuador.svg.png","Ecuador"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/800px-Flag_of_Colombia.svg.png","Colombia"));
    }

    private void loadNorthAmerica() {
        countryModels.add(new CountryModel("https://www.shutterstock.com/image-illustration/illustration-flag-canada-260nw-124331689.jpg", "Canada"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/US_flag_51_stars.svg/300px-US_flag_51_stars.svg.png", "USA"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/1200px-Flag_of_Mexico.svg.png", "Mexico"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Flag_of_Panama.svg/800px-Flag_of_Panama.svg.png", "Panama"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/250px-Flag_of_Cuba.svg.png", "Cuba"));
    }

    private void loadAfrica() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/1280px-Flag_of_Morocco.svg.png", "Morocco"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Flag_of_Ghana.svg/800px-Flag_of_Ghana.svg.png", "Ghana"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Variant_flag_of_the_GPRA_%281958-1962%29.svg/270px-Variant_flag_of_the_GPRA_%281958-1962%29.svg.png", "Algeria"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/800px-Flag_of_Egypt.svg.png", "Egypt"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Flag_of_South_Africa.svg/640px-Flag_of_South_Africa.svg.png", "South Africa"));
    }
        private void loadEurasia() {
            countryModels.add(new CountryModel("https://lh3.googleusercontent.com/proxy/RQMK6t-2zCOOo6w4qhyCCPZQRENLWXD1l5ebXyS0adHHTkqAGWHInOONlMpKEvZSK3qEwQRaBtzqVZXXGbirMARLFPWjBW0telcWtE1rRWO2", "Kyrgyzstan"));
            countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Flag_of_Russia.svg/250px-Flag_of_Russia.svg.png", "Russia"));
            countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/1200px-Flag_of_the_People%27s_Republic_of_China.svg.png", "China"));
            countryModels.add(new CountryModel("https://blazon.ru/wp-content/uploads/2019/01/148.jpg", "Poland"));
            countryModels.add(new CountryModel("https://www.samdu.uz/upload/cover-images/61312fa1aa6d3-61312fa1aa6d4-61312fa1aa6d5-61312fa1aa6d6.jpg", "Uzbekistan"));
        }
    }

