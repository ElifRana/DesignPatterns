package com.example.designpatterns.structural.flyweight;

public enum EnumBulletSize {

    THREE(3),
    FIVE(5),
    SEVEN(7);

    private int size;

    EnumBulletSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.valueOf(size) ;
    }

    public int getSize() {
        return size;
    }
}
