package com.example.designpatterns.structural.adapter;

public class Priz {
    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri) {
        int volt = elektrikliEvAletleri.prizeTakVeCalıstır();
        System.out.println("Prizden " + volt + " volt alınıyor.");
    }
}
