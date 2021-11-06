package com.example.designpatterns.structural.composite.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    private String name;
    private List<Priceable> priceableList;

    public Basket(String name) {
        this.name = name;
        this.priceableList = new ArrayList<>();
    }

    public BigDecimal totalAmountPayable(){
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Priceable priceable : priceableList) {
            totalPrice = totalPrice.add(priceable.getPrice());
        }
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Priceable> getPriceableList() {
        return priceableList;
    }

    public void setPriceableList(List<Priceable> priceableList) {
        this.priceableList = priceableList;
    }
}
