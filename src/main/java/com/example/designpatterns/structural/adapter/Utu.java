package com.example.designpatterns.structural.adapter;

public class Utu implements ElektrikliEvAletleri{

    private int volt;

    public Utu() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalıstır() {
        System.out.println("Utu calısıyor.");
        return volt;
    }
}
