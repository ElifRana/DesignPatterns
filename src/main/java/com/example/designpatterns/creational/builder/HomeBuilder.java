package com.example.designpatterns.creational.builder;

public class HomeBuilder {

    private String province; //il
    private String district; //ilce
    private String neighbourhood; //mahalle

    private int buildingLoam; //bina yılı
    private int numberOfRooms;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private int numberOfBalconies;

    private boolean isDoublex;
    private boolean hasPool;

    public static HomeBuilder startBuild(String province, String district, String neighbourhood, int buildingLoam, int numberOfRooms) {
        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.province = province;
        homeBuilder.district = district;
        homeBuilder.neighbourhood = neighbourhood;
        homeBuilder.buildingLoam = buildingLoam;
        homeBuilder.numberOfRooms = numberOfRooms;
        return new HomeBuilder();
    }

    public Home build() {
        Home home = new Home();

        home.setProvince(province);
        home.setDistrict(district);
        home.setNeighbourhood(neighbourhood);
        home.setBuildingLoam(buildingLoam);
        home.setNumberOfRooms(numberOfRooms);
        home.setNumberOfBathrooms(numberOfBathrooms);
        home.setNumberOfToilets(numberOfToilets);
        home.setNumberOfBalconies(numberOfBalconies);
        home.setNumberOfBalconies(numberOfBalconies);
        home.setDoublex(isDoublex);
        home.setHasPool(hasPool);

        return home;

    }

    public HomeBuilder setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
        return this;
    }

    public HomeBuilder setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
        return this;
    }

    public HomeBuilder setNumberOfBalconies(int numberOfBalconies) {
        this.numberOfBalconies = numberOfBalconies;
        return this;
    }

    public HomeBuilder setDoublex(boolean doublex) {
        isDoublex = doublex;
        return this;
    }

    public HomeBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
}
