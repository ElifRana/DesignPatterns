package com.example.designpatterns.structural.bridge.audioDevice;

public class Headphone implements AudioDevice{


    @Override
    public void playVoice(String voice) {
        System.out.println("Kulaklık ses caliyor " + voice);

    }
}
