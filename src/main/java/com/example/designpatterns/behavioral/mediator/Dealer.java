package com.example.designpatterns.behavioral.mediator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Dealer implements Mediator{

    private List<Producer> producerList;
    private List<Greengrocer> greengrocerList;

    public Dealer() {
        this.producerList = new ArrayList<>();
        this.greengrocerList = new ArrayList<>();
    }

    @Override
    public void addProducer(Producer producer) {
        producerList.add(producer);
    }

    @Override
    public void addGreengrocer(Greengrocer greengrocer) {
        greengrocerList.add(greengrocer);
    }

    @Override
    public void buyFromProducer(Producer producer) {
        Greengrocer greengrocer = findAGreengrocer(producer.getProduct());

        makeASale(producer, greengrocer);

    }

    @Override
    public void sellToGreengrocer(Greengrocer greengrocer) {
        Producer producer = findAProducer(greengrocer.getProduct());

        makeASale(producer, greengrocer);
    }

    private Producer findAProducer(EnumProduct product) {

        Producer findAProducer = null;

        for (Producer producer : producerList) {
            if (product.equals(producer.getProduct())){
                BigDecimal producerPrice = producer.getPrice();

                if (findAProducer == null || findAProducer.getPrice().compareTo(producerPrice) > 0){
                    findAProducer = producer;
                }
            }
        }

        return findAProducer;
    }

    private Greengrocer findAGreengrocer(EnumProduct product) {
        Greengrocer findAGreengrocer = null;

        for (Greengrocer greengrocer : greengrocerList) {
            if (product.equals(greengrocer.getProduct())){
                BigDecimal producerPrice = greengrocer.getPrice();

                if (findAGreengrocer == null || findAGreengrocer.getPrice().compareTo(producerPrice) < 0){
                    findAGreengrocer = greengrocer;
                }
            }
        }

        return findAGreengrocer;
    }

    private void makeASale(Producer producer, Greengrocer greengrocer) {
        System.out.println(producer.getName() + " isimli üretici " +
                greengrocer.getName() + " isimli halciye ürün " +
                producer.getProduct().getProduct() + " sattı.");
    }
}
