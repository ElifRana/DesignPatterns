package com.example.designpatterns.creational.abstractfactory;

import java.util.Date;

public class AdventureBookFactory implements BookFactory{

    @Override
    public Book getBook(int pageNumber, Date dateOfWriting, String auther, String name) {
        return new AdventureBook(pageNumber ,dateOfWriting ,auther ,name );
    }
}
