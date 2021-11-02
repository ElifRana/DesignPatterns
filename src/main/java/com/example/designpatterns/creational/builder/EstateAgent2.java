package com.example.designpatterns.creational.builder;

public class EstateAgent2 {
    public static void main(String[] args) {

        Home home2 = HomeBuilder.startBuild("Istanbul", "Umraniye", "Tatlısu", 2008, 3)
                .build();
        Home home3 = HomeBuilder.startBuild("Istanbul", "Umraniye", "Tatlısu", 2008, 3)
                .build();

        printHome(home2);

    }

    private static void printHome(Home home) {
        System.out.println(" House Added " + home);
    }
}
