package com.example.designpatterns.behavioral.state;

public class Attack implements Console{

    @Override
    public void squareBass() {
        System.out.println("Şut çakiliyor");
    }

    @Override
    public void triangleBass() {
        System.out.println("Ara pası veriliyor");
    }

    @Override
    public void roundBass() {
        System.out.println("Orta açılıyor");
    }

    @Override
    public void xBass() {
        System.out.println("Kısa pas veriliyor");
    }
}
