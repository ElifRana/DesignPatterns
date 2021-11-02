package com.example.designpatterns.creational.prototype;

public class Category implements Cloneable{

    private Long id;
    private String name;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    protected Category clone() throws CloneNotSupportedException {
        return (Category) super.clone();
    }
}
