package com.example.designpatterns.behavioral.mediator;

import java.math.BigDecimal;

public class TomatoesProducer extends Producer{

    public TomatoesProducer(String name, BigDecimal price, Mediator mediator) {
        super(name, EnumProduct.TOMATOES, price, mediator);
    }
}
