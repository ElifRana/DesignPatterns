package com.example.designpatterns.behavioral.command;

import java.math.BigDecimal;

public class ExtractionCommand implements Process{

    @Override
    public BigDecimal process(BigDecimal number1, BigDecimal number2) {
        return  number1.subtract(number2);
    }

}
