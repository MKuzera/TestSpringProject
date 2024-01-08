package com.example.TestProject.Section2.Game;

public class MagicGame implements Game {
    @Override
    public void up() {
        System.out.println("Up from Magic");
    }

    @Override
    public void down() {
        System.out.println("Down from Magic");
    }

    @Override
    public void left() {
        System.out.println("Left from Magic");
    }

    @Override
    public void right() {
        System.out.println("Right from Magic");
    }
}
