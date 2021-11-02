package com.example.designpatterns.creational.builder;

public class Home {

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

    public Home() {
    }

    public Home(String province, String district, String neighbourhood, int buildingLoam, int numberOfRooms, int numberOfBathrooms, int numberOfToilets, int numberOfBalconies, boolean isDoublex, boolean hasPool) {
        this.province = province;
        this.district = district;
        this.neighbourhood = neighbourhood;
        this.buildingLoam = buildingLoam;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfToilets = numberOfToilets;
        this.numberOfBalconies = numberOfBalconies;
        this.isDoublex = isDoublex;
        this.hasPool = hasPool;
    }

    // zorunlu
    public Home(String province, String district, String neighbourhood, int buildingLoam, int numberOfRooms) {
        this.province = province;
        this.district = district;
        this.neighbourhood = neighbourhood;
        this.buildingLoam = buildingLoam;
        this.numberOfRooms = numberOfRooms;
    }

    //opsiyonel
    public Home(String province, String district, String neighbourhood, int buildingLoam, int numberOfRooms, int numberOfBathrooms) {
        this.province = province;
        this.district = district;
        this.neighbourhood = neighbourhood;
        this.buildingLoam = buildingLoam;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    public String toString() {
        return "Home{" +
                "province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", buildingLoam=" + buildingLoam +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfToilets=" + numberOfToilets +
                ", numberOfBalconies=" + numberOfBalconies +
                ", isDoublex=" + isDoublex +
                ", hasPool=" + hasPool +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public int getBuildingLoam() {
        return buildingLoam;
    }

    public void setBuildingLoam(int buildingLoam) {
        this.buildingLoam = buildingLoam;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public int getNumberOfBalconies() {
        return numberOfBalconies;
    }

    public void setNumberOfBalconies(int numberOfBalconies) {
        this.numberOfBalconies = numberOfBalconies;
    }

    public boolean isDoublex() {
        return isDoublex;
    }

    public void setDoublex(boolean doublex) {
        isDoublex = doublex;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }
}
