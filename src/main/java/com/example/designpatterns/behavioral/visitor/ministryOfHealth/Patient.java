package com.example.designpatterns.behavioral.visitor.ministryOfHealth;

public class Patient {

    private String name;
    private EnumPatient patient;
    private EnumPatientCondition enumPatientCondition;

    public Patient(String name, EnumPatient patient, EnumPatientCondition enumPatientCondition) {
        this.name = name;
        this.patient = patient;
        this.enumPatientCondition = enumPatientCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumPatient getPatient() {
        return patient;
    }

    public void setPatient(EnumPatient patient) {
        this.patient = patient;
    }

    public EnumPatientCondition getEnumPatientCondition() {
        return enumPatientCondition;
    }

    public void setEnumPatientCondition(EnumPatientCondition enumPatientCondition) {
        this.enumPatientCondition = enumPatientCondition;
    }
}
