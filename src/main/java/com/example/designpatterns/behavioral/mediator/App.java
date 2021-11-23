package com.example.designpatterns.behavioral.mediator;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        Dealer dealer = new Dealer();

        TomatoesProducer producerRana = new TomatoesProducer("Rana", BigDecimal.valueOf(4), dealer);
        TomatoesProducer producerElif = new TomatoesProducer("Elif", BigDecimal.valueOf(3), dealer);

        TomatoesGreengrocer greengrocerTaha = new TomatoesGreengrocer("Taha", BigDecimal.valueOf(5), dealer);
        TomatoesGreengrocer greengrocerSena = new TomatoesGreengrocer("Sena", BigDecimal.valueOf(7), dealer);

        dealer.addProducer(producerRana);
        dealer.addProducer(producerElif);

        dealer.addGreengrocer(greengrocerTaha);
        dealer.addGreengrocer(greengrocerSena);

        producerRana.sellProduct();
        greengrocerSena.buyProduct();


    }
}
