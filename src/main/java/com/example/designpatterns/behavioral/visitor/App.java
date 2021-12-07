package com.example.designpatterns.behavioral.visitor;

import com.example.designpatterns.behavioral.visitor.ministryOfHealth.*;
import com.example.designpatterns.behavioral.visitor.transactions.CovidNumberOfDeathVisitor;
import com.example.designpatterns.behavioral.visitor.transactions.CovidNumberOfPatientsVisitor;

public class App {
    public static void main(String[] args) {

        Patient ahmet = new Patient("Ahmet", EnumPatient.COVİD, EnumPatientCondition.AGIR_HASTA);
        Patient fatma = new Patient("Fatma", EnumPatient.COVİD, EnumPatientCondition.OLUM);

        Hospital sigorta = new Hospital("Sigorta");

        sigorta.patientAdd(ahmet);
        sigorta.patientAdd(fatma);

        City trabzon = new City("Trabzon");
        trabzon.hospitalAdd(sigorta);

        Country turkiye = new Country("Türkiye");
        turkiye.cityAdd(trabzon);

        reportCountry(turkiye);
    }

    public static void reportCountry(Country country) {

        CovidNumberOfPatientsVisitor numberOfPatientsVisitor = new CovidNumberOfPatientsVisitor();
        String numberOfPatients = numberOfPatientsVisitor.visitCountry(country);

        CovidNumberOfDeathVisitor numberOfDeathVisitor = new CovidNumberOfDeathVisitor();
        String numberOfDeath = numberOfDeathVisitor.visitCountry(country);

        System.out.println("Hasta sayısı: " + numberOfPatients);
        System.out.println("Ölüm sayısı: " + numberOfDeath);

    }
}
