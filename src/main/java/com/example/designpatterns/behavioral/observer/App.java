package com.example.designpatterns.behavioral.observer;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal minTemperature = BigDecimal.valueOf(23);
        BigDecimal maxTemperature = BigDecimal.valueOf(23);

        Thermometer thermometer = new Thermometer(minTemperature, maxTemperature);
        Parent mom = new Parent("Mom");
        Parent dad = new Parent("Dad");

        thermometer.add(mom);
        thermometer.add(dad);

        for (int i = thermometer.getInstantTemperature().intValue(); i <= 30; i++){
            thermometer.setInstantTemperature(BigDecimal.valueOf(i));
        }

        for (int i = thermometer.getInstantTemperature().intValue(); i >= 22; i--){
            thermometer.setInstantTemperature(BigDecimal.valueOf(i));
        }

    }
}
