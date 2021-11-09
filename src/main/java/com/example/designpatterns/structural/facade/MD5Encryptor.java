package com.example.designpatterns.structural.facade;

class MD5Encryptor {

    public void encrypt(String text, String key) {
        System.out.println("<MD5>" + text + key + "</MD5>");
    }
}
