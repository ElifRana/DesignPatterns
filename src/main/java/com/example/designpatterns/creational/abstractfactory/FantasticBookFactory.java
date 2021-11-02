package com.example.designpatterns.creational.abstractfactory;

import java.util.Date;

public class FantasticBookFactory implements BookFactory{
    @Override
    public Book getBook(int pageNumber, Date dateOfWriting, String auther, String name) {
        return new FantasticBook(pageNumber, dateOfWriting, auther, name);
    }
}
