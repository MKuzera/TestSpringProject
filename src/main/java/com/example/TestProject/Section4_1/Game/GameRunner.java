package com.example.TestProject.Section4_1.Game;

public class GameRunner {
    Game game;
    public GameRunner(Game game){
        this.game = game;

    }
    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
