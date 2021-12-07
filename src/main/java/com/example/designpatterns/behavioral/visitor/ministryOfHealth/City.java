package com.example.designpatterns.behavioral.visitor.ministryOfHealth;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String name;
    private List<Hospital> hospitalList;

    public City(String name) {
        this.name = name;
        hospitalList = new ArrayList<>();
    }

    public String accept(Visitor visitor){
        return visitor.visitCity(this);
    }

    public void hospitalAdd(Hospital hospital){
        hospitalList.add(hospital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setPatientList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
}
