package com.example.designpatterns.behavioral.chainOfResponsibility;

public abstract class ShippingCompany {

    private EnumIl enumIl;
    private ShippingCompany lastShippingCompany;

    public ShippingCompany(EnumIl enumIl) {
        this.enumIl = enumIl;
    }

    public EnumIl getEnumIl() {
        return enumIl;
    }

    public ShippingCompany getLastShippingCompany() {
        return lastShippingCompany;
    }

    public ShippingCompany setLastShippingCompany(ShippingCompany lastShippingCompany) {
        this.lastShippingCompany = lastShippingCompany;
        return this;
    }

    public void shipIt(EnumIl il){
        printIncomingInformation(il);

        if (getEnumIl().equals(il)) {

            printDeliveryInformation(il);

        } else if (getLastShippingCompany() != null) {

            getLastShippingCompany().shipIt(il);

        } else {

            printOutOfServiceArea(il);
        }
    }

    private void printOutOfServiceArea(EnumIl il) {
        System.out.println(il.getIl() + " Hizmet alanının dışındadır.");

    }

    private void printDeliveryInformation(EnumIl il) {
        System.out.println(getEnumIl().getIl() + " şube teslim aldı.");

    }

    private void printIncomingInformation(EnumIl il) {

        System.out.println(il.getIl() + " iline gidecek kargo " + getEnumIl().getIl() + " şubesine geldi. ");

    }
}
