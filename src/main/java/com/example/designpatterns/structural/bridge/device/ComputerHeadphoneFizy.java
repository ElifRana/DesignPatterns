package com.example.designpatterns.structural.bridge.device;

import com.example.designpatterns.structural.bridge.Music;
import com.example.designpatterns.structural.bridge.audioDevice.Headphone;
import com.example.designpatterns.structural.bridge.musicPlayer.Fizy;

public class ComputerHeadphoneFizy extends Computer {

    public ComputerHeadphoneFizy() {
        audioDevice = new Headphone();
        musicPlayer = new Fizy();
    }

    @Override
    public void playMusic(Music music) {
        System.out.println("Bilgisayar calisti");
        super.playMusic(music);
    }
}
