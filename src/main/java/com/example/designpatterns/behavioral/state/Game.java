package com.example.designpatterns.behavioral.state;

public class Game {

    private Console console;

    public Game() {
        System.out.println("Oyun basladı");

        console = new Attack();
    }

    public void triangle(){
        console.triangleBass();
    }

    public void square(){
        console.squareBass();
    }

    public void round(){
        console.roundBass();
    }

    public void x(){
        console.xBass();
    }

    public void grabTheBall(){
        System.out.println("Top kapıldı. Hücuma çıkılıyor");
        console = new Attack();
    }

    public void gotTheBall(){
        System.out.println("Top kaptırıldı");
        console = new Defense();
    }
}
