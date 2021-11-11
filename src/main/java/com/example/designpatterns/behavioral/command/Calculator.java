package com.example.designpatterns.behavioral.command;

import java.math.BigDecimal;

public class Calculator {

    public static BigDecimal process(Process process, BigDecimal number1, BigDecimal number2) {

        return process.process(number1, number2);

    }
}