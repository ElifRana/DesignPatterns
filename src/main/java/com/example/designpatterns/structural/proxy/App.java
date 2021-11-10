package com.example.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        ExecutiveProxy executiveProxy = new ExecutiveProxy("Sena", "12345");
      //  ExecutiveProxy executiveProxy = new ExecutiveProxy("Sena", "12345");

        try {
            BigDecimal ciro = executiveProxy.getCiro();
            System.out.println("Şirket cirosu: " + ciro);
        } catch (IllegalAccessException e) {
            System.out.println("Hassas Bilgilere erişiminiz yoktur!");
        }

    }
}
