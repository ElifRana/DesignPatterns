package com.example.designpatterns.creational.abstractfactory;

import java.util.Date;

public class AdventureBook implements Book {

    private int pageNumber;
    private Date dateOfWriting;
    private String auther;
    private String name;

    public AdventureBook(int pageNumber, Date dateOfWriting, String auther, String name) {
        this.pageNumber = pageNumber;
        this.dateOfWriting = dateOfWriting;
        this.auther = auther;
        this.name = name;
    }

    @Override
    public String toString() {
        return "AdventureBook{" +
                "pageNumber=" + pageNumber +
                ", dateOfWriting=" + dateOfWriting +
                ", auther='" + auther + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int getPageNumber() {
        return 0;
    }

    @Override
    public Date getDateOfWriting() {
        return null;
    }

    @Override
    public String getAuther() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}