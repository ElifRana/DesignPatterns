package com.example.designpatterns.behavioral.mediator;

import java.math.BigDecimal;

public class TomatoesGreengrocer extends Greengrocer{

    public TomatoesGreengrocer(String name, BigDecimal price, Mediator mediator) {
        super(name, EnumProduct.TOMATOES, price, mediator);
    }
}
