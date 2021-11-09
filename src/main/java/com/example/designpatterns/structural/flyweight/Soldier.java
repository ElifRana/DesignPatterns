package com.example.designpatterns.structural.flyweight;

public abstract class Soldier {

    private EnumBulletSize bulletSize;

    public Soldier(EnumBulletSize bulletSize){
        this.bulletSize = bulletSize;
    }

    public void fire(){

     //   Bullet bullet = new Bullet(bulletSize);

        Bullet bullet = BulletFactory.produceBullet(bulletSize);
        bullet.withFire();
    }

    public void scan(){
        for (int i = 0; i < 5; i++){
            fire();
        }
    }

}
