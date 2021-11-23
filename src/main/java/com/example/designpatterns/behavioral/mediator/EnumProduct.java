package com.example.designpatterns.behavioral.mediator;

public enum EnumProduct {

    TOMATOES("Domates"),
    CUCUMBER("Salatalık");

    private String product;

    EnumProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}
