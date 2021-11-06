package com.example.designpatterns.structural.composite.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Stores implements Priceable{

    private String name;
    private List<Product> productList;
    private List<Packet> packetList;

    public Stores(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packetList = new ArrayList<>();
    }

    @Override
    public BigDecimal getPrice() {

        BigDecimal totalProductPrice = PriceCalculation.getTotalProductPrice(productList);
        BigDecimal totalPacketPrice = PriceCalculation.getTotalPacketPrice(packetList);

        BigDecimal totalPrice = totalProductPrice.add(totalPacketPrice);
        return totalPrice;
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

    public List<Packet> getPacketList() {
        return packetList;
    }

    public void setPacketList(List<Packet> packetList) {
        this.packetList = packetList;
    }
}
