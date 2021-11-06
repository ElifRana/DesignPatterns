package com.example.designpatterns.structural.bridge.device;

import com.example.designpatterns.structural.bridge.Music;
import com.example.designpatterns.structural.bridge.audioDevice.AudioDevice;
import com.example.designpatterns.structural.bridge.musicPlayer.MusicPlayer;

public abstract class Computer {

    protected AudioDevice audioDevice;
    protected MusicPlayer musicPlayer;

    public Computer() {
    }

    public Computer(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        this.audioDevice = audioDevice;
        this.musicPlayer = musicPlayer;
    }

    public void playMusic(Music music){
       String voice = musicPlayer.playMusic(music);
       audioDevice.playVoice(voice);
    }
}
