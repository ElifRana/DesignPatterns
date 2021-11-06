package com.example.designpatterns.structural.bridge;

import com.example.designpatterns.structural.bridge.audioDevice.Headphone;
import com.example.designpatterns.structural.bridge.device.ComputerHeadphoneFizy;
import com.example.designpatterns.structural.bridge.device.Phone;
import com.example.designpatterns.structural.bridge.musicPlayer.Fizy;
import com.example.designpatterns.structural.bridge.musicPlayer.Spotify;

public class App {
    public static void main(String[] args) {

        Music music = new Music("Can Bonomo - Islak ", "Sen nasılsın nasıl günler");

        ComputerHeadphoneFizy computerHeadphoneFizy = new ComputerHeadphoneFizy();
        computerHeadphoneFizy.playMusic(music);

        System.out.println("--------------------------");

        Phone phone = new Phone(new Headphone(), new Fizy());
        phone.playMusic(music);

        System.out.println("--------------------------");

        Phone phone1 = new Phone(new Headphone(), new Spotify());
        phone1.playMusic(music);
    }
}
