package com.example.designpatterns.creational.builder;

public class EstateAgent {
    public static void main(String[] args) {

        Home home1 = new Home();
        home1.setProvince("Trabzon");
        home1.setDistrict("Akcaabat");
        home1.setNeighbourhood("Sogutlu");
        home1.setNumberOfRooms(3);
        home1.setHasPool(true);
        home1.setBuildingLoam(2010);

        Home home2 = new Home("Istanbul", "Umraniye", "Tatlısu", 2008, 2, 3, 2, 0, true, false);

        printHome(home1);
        printHome(home2);
    }

    private static void printHome(Home home) {
        System.out.println(" House Added " + home);
    }
}
