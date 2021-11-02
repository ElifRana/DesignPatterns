package com.example.designpatterns.creational.abstractfactory;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AdventureBookFactory adventureBookFactory = new AdventureBookFactory();
        FantasticBookFactory fantasticBookFactory = new FantasticBookFactory();

        Book adventureBook = adventureBookFactory.getBook(161, new Date(2000-04-03), "J. R. R. Tolkien", "FantasticBook");
        Book fantasticBook = fantasticBookFactory.getBook(528, new Date(2000-04-03), "Dan Brown", "AdventureBook");

        System.out.println(adventureBook);
        System.out.println(fantasticBook);
    }
}
