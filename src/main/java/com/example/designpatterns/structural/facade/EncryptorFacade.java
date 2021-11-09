package com.example.designpatterns.structural.facade;

public class EncryptorFacade {

    private AESEncryptor aesEncryptor = new AESEncryptor();

    private MD5Encryptor md5Encryptor = new MD5Encryptor();

    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encryptor(String text, EncTpye encTpye) {

        switch (encTpye) {
            case AES:
                aesEncryptor.encrypt(text);
                break;
            case MD5:
                md5Encryptor.encrypt(text, "KEY");
                break;
            case SHA:
                shaEncryptor.encrypt(text, "KEY", true);
                break;
            default: throw new IllegalArgumentException(encTpye.toString());
        }

    }

    public enum EncTpye {
        SHA,
        MD5,
        AES

    }
}
