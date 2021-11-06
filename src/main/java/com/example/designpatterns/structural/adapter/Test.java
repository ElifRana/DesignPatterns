package com.example.designpatterns.structural.adapter;

public class Test {
    public static void main(String[] args) {

        Priz priz = new Priz();

        Utu utu = new Utu();

        Buzdolabı buzdolabı = new Buzdolabı();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabı);

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        TelefonEEAdater adater = new TelefonEEAdater(samsungTelefon);

        priz.elektrikVer(adater);
    }
}
