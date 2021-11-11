package com.example.designpatterns.behavioral.chainOfResponsibility;

public class App {
    public static void main(String[] args) {

        ShippingCompany sbmCargo = SbmCargo.getShippingCompany();

        sbmCargo.shipIt(EnumIl.KARS);

        System.out.println("\n--------------\n");

        sbmCargo.shipIt(EnumIl.ANTALYA);
    }
}
