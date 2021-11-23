package com.example.designpatterns.behavioral.memento;

public class NotePadMemento {

    private String text;

    public NotePadMemento() {
    }

    public NotePadMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
