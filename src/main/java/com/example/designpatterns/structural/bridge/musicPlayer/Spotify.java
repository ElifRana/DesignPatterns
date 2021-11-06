package com.example.designpatterns.structural.bridge.musicPlayer;

import com.example.designpatterns.structural.bridge.Music;

public class Spotify implements MusicPlayer{

    @Override
    public String playMusic(Music music) {
        System.out.println("Spotify " + music + " sarkisini caliyor");
        return music.getVoice();
    }
}
