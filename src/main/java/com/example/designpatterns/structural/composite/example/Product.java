package com.example.designpatterns.structural.composite.example;

import java.math.BigDecimal;

public class Product implements Priceable{

    private String name;
    private BigDecimal price;

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
