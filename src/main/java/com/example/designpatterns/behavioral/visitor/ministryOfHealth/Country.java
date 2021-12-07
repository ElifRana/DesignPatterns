package com.example.designpatterns.behavioral.visitor.ministryOfHealth;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private List<City> cityList;

    public Country(String name) {
        this.name = name;
        cityList = new ArrayList<>();
    }

    public String accept(Visitor visitor){
        return visitor.visitCountry(this);
    }

    public void cityAdd(City city){
        cityList.add(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}
