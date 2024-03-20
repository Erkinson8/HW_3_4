package com.example.Continent;

public class ContinentModel {
    private  String imgContinent;
    private String continentName;

    public ContinentModel(String imgContinent, String continentName) {
        this.imgContinent = imgContinent;
        this.continentName = continentName;
    }

    public String getImgContinent() {
        return imgContinent;
    }

    public String getContinentName() {
        return continentName;
    }
}
