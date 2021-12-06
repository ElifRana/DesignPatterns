package com.example.designpatterns.behavioral.observer;

import java.math.BigDecimal;

public class Thermometer extends Observable{

    private BigDecimal instantTemperature;
    private BigDecimal maxTemperature;
    private BigDecimal minTemperature;

    public Thermometer(BigDecimal maxTemperature, BigDecimal minTemperature) {
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.instantTemperature = BigDecimal.valueOf(24);
    }

    public BigDecimal getInstantTemperature() {
        return instantTemperature;
    }

    public void setInstantTemperature(BigDecimal instantTemperature) {
        this.instantTemperature = instantTemperature;

        System.out.println(instantTemperature);

        chechIt();
    }

    private void chechIt() {
        boolean soHot = instantTemperature.compareTo(maxTemperature) >= 0;
        boolean veryCold = instantTemperature.compareTo(minTemperature) <= 0;

        if (soHot || veryCold) {
            letMeKnow();
        }

    }
}
