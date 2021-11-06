package com.example.designpatterns.structural.adapter;

public class Buzdolabı implements ElektrikliEvAletleri{

    private int volt;

    public Buzdolabı() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalıstır() {
        System.out.println("Buzdolabı calısıyor.");
        return volt;
    }
}
