package com.example.designpatterns.structural.composite.example;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        Product soundSystem = new Product("Ses sistemi", BigDecimal.valueOf(5000));
        Product headphone = new Product("Kulaklık", BigDecimal.valueOf(1000));

        Packet technologyPacket = new Packet("Teknoloji Paketi");
        technologyPacket.getProductList().add(soundSystem);
        technologyPacket.getProductList().add(headphone);

        Product soccerBall = new Product("Futbol topu", BigDecimal.valueOf(100));

        Product i̇phone = new Product("İphone", BigDecimal.valueOf(1500));
        Stores stores = new Stores("Kumanya");
        stores.getProductList().add(i̇phone);

        Basket basket = new Basket("Sepetim");
        basket.getPriceableList().add(technologyPacket);
        basket.getPriceableList().add(soccerBall);
        basket.getPriceableList().add(stores);

        BigDecimal totalMoment = basket.totalAmountPayable();

        System.out.println("Odenecek Tutar = " + totalMoment + " TL");

    }
}
