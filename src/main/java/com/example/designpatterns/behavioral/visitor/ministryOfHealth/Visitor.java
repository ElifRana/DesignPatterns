package com.example.designpatterns.behavioral.visitor.ministryOfHealth;

public interface Visitor {

    String visitHospital(Hospital hospital);
    String visitCity(City city);
    String visitCountry(Country country);

}
