package com.example.designpatterns.structural.composite.ilk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    private String name;
    private List<Product> productList;
    private List<Packet> packetList;

    public Basket(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packetList = new ArrayList<>();
    }

    public BigDecimal getTotalMoment(){
        BigDecimal totalMoment = BigDecimal.ZERO;

        for (Product product : productList) {
            totalMoment = totalMoment.add(product.getPrice());
        }

        for (Packet packet : packetList) {
            List<Product> productList = packet.getProductList();

            for (Product product : productList) {
                totalMoment = totalMoment.add(product.getPrice());
            }
        }
        return totalMoment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Packet> getPackageList() {
        return packetList;
    }

    public void setPackageList(List<Packet> packetList) {
        this.packetList = packetList;
    }
}
