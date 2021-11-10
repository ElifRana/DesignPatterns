package com.example.designpatterns.structural.proxy;

public class Worker {

    private String userName;
    private String password;
    private boolean isExecutive;

    public Worker(String userName, String password, boolean isExecutive) {
        this.userName = userName;
        this.password = password;
        this.isExecutive = isExecutive;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isExecutive() {
        return isExecutive;
    }

    public void setExecutive(boolean executive) {
        isExecutive = executive;
    }
}
