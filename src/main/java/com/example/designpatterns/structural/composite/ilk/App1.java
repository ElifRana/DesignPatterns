package com.example.designpatterns.structural.composite.ilk;

import java.math.BigDecimal;

public class App1 {
    public static void main(String[] args) {

        Product tomatoes = new Product("Domates", BigDecimal.TEN);
        Product paper = new Product("Biber", BigDecimal.ONE);
        Product melon = new Product("Kavun", BigDecimal.ONE);

        Packet vegetablePack = new Packet("Sebze Paketi");
        vegetablePack.getProductList().add(tomatoes);
        vegetablePack.getProductList().add(paper);
        vegetablePack.getProductList().add(melon);

        Product soundSystem = new Product("Ses sistemi", BigDecimal.valueOf(5000));
        Product headphone = new Product("Kulaklık", BigDecimal.valueOf(1000));

        Packet technologyPacket = new Packet("Teknoloji Paketi");
        technologyPacket.getProductList().add(soundSystem);
        technologyPacket.getProductList().add(headphone);

        Product soccerBall = new Product("Futbol topu", BigDecimal.valueOf(100));

       Basket basket = new Basket("Sepetim");
       basket.getPackageList().add(vegetablePack);
       basket.getPackageList().add(technologyPacket);
       basket.getProductList().add(soccerBall);

       BigDecimal totalMoment = basket.getTotalMoment();

        System.out.println("Odenecek Tutar = " + totalMoment + " TL");

    }
}
