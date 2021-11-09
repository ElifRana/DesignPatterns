package com.example.designpatterns.structural.flyweight;

public class Bullet {

    private EnumBulletSize bulletSize;

    public Bullet(EnumBulletSize bulletSize) {
        this.bulletSize = bulletSize;

        System.out.println(bulletSize.getSize() + "mm mermi oluştu");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void withFire(){
        System.out.println("Tak");
    }

}
