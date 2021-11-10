package com.example.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class Executive implements CompanyInformation{


    @Override
    public BigDecimal getCiro() {
        return BigDecimal.valueOf(10000);
    }
}
