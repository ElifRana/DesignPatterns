package com.example.designpatterns.creational.singleton;

// ilgili nesneden bir tane oluşturmak istiyorsak singleton kullanılır.
public final class Singleton {

    private static Singleton instance;

    private String value;

    private Singleton (String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if (instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }

}
