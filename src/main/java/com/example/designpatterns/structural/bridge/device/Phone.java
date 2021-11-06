package com.example.designpatterns.structural.bridge.device;

import com.example.designpatterns.structural.bridge.Music;
import com.example.designpatterns.structural.bridge.audioDevice.AudioDevice;
import com.example.designpatterns.structural.bridge.musicPlayer.MusicPlayer;

public class Phone extends Computer{

    public Phone(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        super(audioDevice, musicPlayer);
    }

    @Override
    public void playMusic(Music music) {
        System.out.println("Telefon muzik caliyor");
        super.playMusic(music);
    }
}
