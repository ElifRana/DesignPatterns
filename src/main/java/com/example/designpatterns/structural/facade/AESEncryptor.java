package com.example.designpatterns.structural.facade;

class AESEncryptor {

    public void encrypt(String text) {
        System.out.println("<AES>" + text + "</AES>");
    }
}
