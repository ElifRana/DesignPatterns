package com.example.designpatterns.behavioral.state;

public class Defense implements Console{

    @Override
    public void squareBass() {
        System.out.println("Müdahale ediliyor");
    }

    @Override
    public void triangleBass() {
        System.out.println("Kaleci açılıyor");
    }

    @Override
    public void roundBass() {
        System.out.println("Kayarak müdahale ediliyor");
    }

    @Override
    public void xBass() {
        System.out.println("Markaj uygulanır");
    }
}
