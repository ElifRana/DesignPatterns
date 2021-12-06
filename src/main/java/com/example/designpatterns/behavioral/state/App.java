package com.example.designpatterns.behavioral.state;

public class App {

    public static void main(String[] args) {

        Game game = new Game();

        game.x();
        game.triangle();
        game.square();
        game.gotTheBall();

        game.x();
        game.square();
        game.grabTheBall();
    }

}
