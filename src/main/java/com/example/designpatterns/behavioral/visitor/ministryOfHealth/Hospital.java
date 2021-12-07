package com.example.designpatterns.behavioral.visitor.ministryOfHealth;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String name;
    private List<Patient> patientList;

    public Hospital(String name) {
        this.name = name;
        patientList = new ArrayList<>();
    }

    public String accept(Visitor visitor){
        return visitor.visitHospital(this);
    }

    public void patientAdd(Patient patient){
        patientList.add(patient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
