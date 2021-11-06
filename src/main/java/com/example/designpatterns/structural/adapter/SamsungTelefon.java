package com.example.designpatterns.structural.adapter;

public class SamsungTelefon implements Telefon{

    private int calismaVoltajı;

    public SamsungTelefon(){
        calismaVoltajı = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung telefon calısıyor");
        return calismaVoltajı;
    }
}
