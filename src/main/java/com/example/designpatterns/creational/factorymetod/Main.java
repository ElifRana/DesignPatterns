package com.example.designpatterns.creational.factorymetod;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Book fantasticBook = BookFactory.getBook(161, new Date(2000-04-03), "J. R. R. Tolkien", "FantasticBook");

        Book adventureBook = BookFactory.getBook(528, new Date(2000-04-03), "Dan Brown", "AdventureBook");

        System.out.println("Fantastik Kitap Özellikleri " + fantasticBook);
        System.out.println("Macera Kitap Özellikleri " + adventureBook);
    }
}
