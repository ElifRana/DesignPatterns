package com.example.designpatterns.structural.adapter;

public class TelefonEEAdater implements ElektrikliEvAletleri{

   private Telefon telefon;

    public TelefonEEAdater(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalıstır() {
        return telefon.sarjEt();
    }
}
