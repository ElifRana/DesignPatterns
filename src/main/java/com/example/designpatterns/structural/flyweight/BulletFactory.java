package com.example.designpatterns.structural.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

public class BulletFactory {

    private static Map<EnumBulletSize, Bullet> map = new LinkedHashMap<>();

    public static Bullet produceBullet(EnumBulletSize bulletSize){

        Bullet bullet = map.get(bulletSize);

        if (bullet == null) {

            bullet = new Bullet(bulletSize);

            map.put(bulletSize, bullet);
        }
        return bullet;
    }
}
