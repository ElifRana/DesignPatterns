package com.example.designpatterns.creational.factorymetod;

import java.util.Date;

public class BookFactory {

    public static Book getBook(int pageNumber, Date dateOfWriting, String auther, String name) {

        Book book;

        if ("FantasticBook".equalsIgnoreCase(name)){
            book = new FantasticBook(pageNumber, dateOfWriting, auther, name);
        }else if("AdventureBook".equalsIgnoreCase(name)){
            book = new AdventureBook(pageNumber, dateOfWriting, auther, name);
        }else {
            throw new RuntimeException("Böyle bir kitap bulunamadı");
        }
        return book;
    }
}
