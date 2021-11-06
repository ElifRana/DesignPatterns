package com.example.designpatterns.structural.composite.example;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculation {

    public static BigDecimal getTotalProductPrice(List<Product> productList){

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : productList) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        return totalPrice;
    }

    public static BigDecimal getTotalPacketPrice(List<Packet> packetList){

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Packet packet : packetList) {
            totalPrice = totalPrice.add(packet.getPrice());
        }
        return totalPrice;
    }

}
