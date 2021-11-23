package com.example.designpatterns.behavioral.mediator;

public interface Mediator {

    void addProducer(Producer producer);
    void addGreengrocer(Greengrocer greengrocer);

    void buyFromProducer(Producer producer);
    void sellToGreengrocer(Greengrocer greengrocer);

}
