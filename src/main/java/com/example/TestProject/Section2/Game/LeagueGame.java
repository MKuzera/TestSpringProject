package com.example.TestProject.Section2.Game;

public class LeagueGame implements Game {

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
