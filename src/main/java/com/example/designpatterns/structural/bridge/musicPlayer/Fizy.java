package com.example.designpatterns.structural.bridge.musicPlayer;

import com.example.designpatterns.structural.bridge.Music;

public class Fizy implements MusicPlayer{

    @Override
    public String playMusic(Music music) {
        System.out.println("Fizy " + music + "sarkısını caliyor");

        return music.getVoice();
    }
}
