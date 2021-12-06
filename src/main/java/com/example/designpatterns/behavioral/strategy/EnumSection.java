package com.example.designpatterns.behavioral.strategy;

public enum EnumSection {

    SOZEL("Sözel"),
    SAYISAL("Sayısal"),
    ESITAGIRLIK("Eşit Ağırlık")
    ;

    private String section;

    EnumSection(String section) {
        this.section =section;
    }

    @Override
    public String toString() {
        return section;
    }
}
