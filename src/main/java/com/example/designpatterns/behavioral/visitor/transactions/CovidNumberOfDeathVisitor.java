package com.example.designpatterns.behavioral.visitor.transactions;

import com.example.designpatterns.behavioral.visitor.ministryOfHealth.*;

import java.util.List;

public class CovidNumberOfDeathVisitor implements Visitor {

    @Override
    public String visitHospital(Hospital hospital) {

        int numberOfPatients = calculateNumberOfPatients(hospital);

        return String.valueOf(numberOfPatients);
    }

    @Override
    public String visitCity(City city) {

        int numberOfPatients = calculateNumberOfPatients(city);

        return String.valueOf(numberOfPatients);
    }

    @Override
    public String visitCountry(Country country) {

        int numberOfPatients = calculateNumberOfPatients(country);

        return String.valueOf(numberOfPatients);
    }

    private int calculateNumberOfPatients(Country country) {

        List<City> cityList = country.getCityList();

        int numberOfPatients = 0;

        for (City city : cityList){
            int eachNumberOfPatients = calculateNumberOfPatients(city);

            numberOfPatients = numberOfPatients + eachNumberOfPatients;
        }
        return numberOfPatients;

    }

    private int calculateNumberOfPatients(City city) {

        List<Hospital> hospitalList = city.getHospitalList();

        int numberOfPatients = 0;

        for (Hospital hospital : hospitalList){
            int eachNumberOfPatients = calculateNumberOfPatients(hospital);

            numberOfPatients = numberOfPatients + eachNumberOfPatients;
        }
        return numberOfPatients;

    }

    private int calculateNumberOfPatients(Hospital hospital) {
        return CalculatePatientsUtil.calculateNumberOfPatients(hospital, EnumPatient.COVİD, EnumPatientCondition.OLUM);
    }
}
