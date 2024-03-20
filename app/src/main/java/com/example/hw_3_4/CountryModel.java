package com.example.hw_3_4;

public class CountryModel {
    private String imgCountry;
    private  String countryName;

    public CountryModel(String imgCountry, String countryName) {
        this.imgCountry = imgCountry;
        this.countryName = countryName;
    }

    public String getImgCountry() {
        return imgCountry;
    }

    public String getCountryName() {
        return countryName;
    }
}
