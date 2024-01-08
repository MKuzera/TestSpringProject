package com.example.TestProject.Section3.GameLogic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    Game game;
    public GameRunner(@Qualifier("MagicGameQualifier") Game game){
        this.game = game;

    }
    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
