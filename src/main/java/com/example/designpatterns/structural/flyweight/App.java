package com.example.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Soldier> soldierList = new ArrayList<>();

        Captain captain = new Captain();
        soldierList.add(captain);

        for (int i = 0; i < 50; i++) {
            Man man = new Man();
            soldierList.add(man);
        }

        for (Soldier soldier : soldierList){
            soldier.fire();
        }

        for (Soldier soldier : soldierList){
            soldier.scan();
        }
    }
}
