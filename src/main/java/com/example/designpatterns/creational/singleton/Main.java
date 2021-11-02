package com.example.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("Elif");
        Singleton singleton1 = Singleton.getInstance("Rana");

        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
