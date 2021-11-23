package com.example.designpatterns.behavioral.memento;

public class NotePad {

    private String text;

    public NotePad() {
        text = "";
    }

    public NotePad(String text) {
        this.text = text;
    }

    public void add(String textToBeAdded) {
        text = text + textToBeAdded;
    }

    public NotePadMemento save(){
        return new NotePadMemento(text);
    }

    public void turnBack(NotePadMemento memento){
        text = memento.getText();
    }

    public void print(){
        System.out.println(text);
    }
}
