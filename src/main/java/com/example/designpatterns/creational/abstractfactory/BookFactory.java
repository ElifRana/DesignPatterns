package com.example.designpatterns.creational.abstractfactory;

import java.util.Date;

public interface BookFactory {
    Book getBook(int pageNumber, Date dateOfWriting, String auther, String name);
}
