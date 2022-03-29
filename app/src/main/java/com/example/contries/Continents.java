package com.example.contries;

public class Continents {
    private int flag;
    private String countryName;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Continents(int flag, String countryName) {
        this.flag = flag;
        this.countryName = countryName;
    }
}
