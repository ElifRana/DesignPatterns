package com.example.designpatterns.behavioral.observer;

public class Parent implements Observer{

    private String name;

    public Parent(String name){
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        Thermometer thermometer = (Thermometer) observable;

        System.out.println(name + " dedi ki : Sıcaklık " + thermometer.getInstantTemperature()
        + " derece ");

    }
}
