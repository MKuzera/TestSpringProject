package com.example.TestProject.Section4_1.Game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GameConfiguration {

    @Bean
    public Game game(){
        var game = new LeagueGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(Game game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
