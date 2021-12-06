package com.example.designpatterns.behavioral.strategy;

public class App {
    public static void main(String[] args) {

        System.out.println("-----------------------");
        printSortOrder(EnumSection.SAYISAL);
        System.out.println("-----------------------");
        printSortOrder(EnumSection.ESITAGIRLIK);
        System.out.println("-----------------------");
        printSortOrder(EnumSection.SOZEL);
    }

    private static void printSortOrder(EnumSection section) {

        Student student = new Student(section);
        String priorityOrder = student.getPriorityOrder();
        System.out.println(priorityOrder);
    }

}
