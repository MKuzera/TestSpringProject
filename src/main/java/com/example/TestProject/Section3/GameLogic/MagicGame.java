package com.example.TestProject.Section3.GameLogic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MagicGameQualifier")
public class MagicGame implements com.example.TestProject.Section3.GameLogic.Game {
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
