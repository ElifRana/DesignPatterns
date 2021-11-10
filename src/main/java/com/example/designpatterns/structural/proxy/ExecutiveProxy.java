package com.example.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class ExecutiveProxy implements CompanyInformation{

    private Executive executive;

    private String userName;
    private String password;

    public ExecutiveProxy(String userName, String password) {
        this.executive = new Executive();
        this.userName = userName;
        this.password = password;
    }

    private boolean isUserExecutive(){

        boolean isUserExecutive = false;

        boolean isUserValid = WorkerUtil.isUserValid(userName, password);

        if (isUserValid) {

            Worker worker = WorkerUtil.getWorkerByUserName(userName);

            isUserExecutive = worker.isExecutive();
        }
        return isUserExecutive;
    }

    @Override
    public BigDecimal getCiro() throws IllegalAccessException {

        boolean userExecutive = isUserExecutive();

        if (userExecutive){
            return executive.getCiro();
        }else {
            throw new IllegalAccessException();
        }
    }
}
