package com.example.designpatterns.behavioral.command;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        BigDecimal number1 = BigDecimal.TEN;
        BigDecimal number2 = BigDecimal.valueOf(2);

        BigDecimal collection = Calculator.process(new CollectionCommand(), number1, number2);
        BigDecimal extraction = Calculator.process(new ExtractionCommand(), number1, number2);
        BigDecimal impact = Calculator.process(new ImpactCommand(), number1, number2);
        BigDecimal divide = Calculator.process(new DivideCommand(), number1, number2);

        System.out.println("Toplam: " + collection);
        System.out.println("Fark: " + extraction);
        System.out.println("Çarpma: " + impact);
        System.out.println("Bölme: " + divide);

    }
}
