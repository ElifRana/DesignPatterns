package com.example.designpatterns.behavioral.mediator;

import java.math.BigDecimal;

public abstract class Greengrocer {

    private String name;
    private EnumProduct product;
    private BigDecimal price;

    private Mediator mediator;

    public Greengrocer(String name, EnumProduct product, BigDecimal price, Mediator mediator) {
        this.name = name;
        this.product = product;
        this.price = price;
        this.mediator = mediator;
    }

    public void buyProduct(){
        mediator.sellToGreengrocer(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumProduct getProduct() {
        return product;
    }

    public void setProduct(EnumProduct product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
