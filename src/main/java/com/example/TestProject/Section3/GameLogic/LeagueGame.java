package com.example.TestProject.Section3.GameLogic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class LeagueGame implements com.example.TestProject.Section3.GameLogic.Game {

    public LeagueGame(){};
    @Override
    public void up() {
        System.out.println("Up from League");
    }

    @Override
    public void down() {
        System.out.println("Down from League");
    }

    @Override
    public void left() {
        System.out.println("Left from League");
    }

    @Override
    public void right() {
        System.out.println("Right from League");
    }
}
