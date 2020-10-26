package com.thugraven;

import java.util.Random;

public class PlayerComp extends Player{
    private Random dice = new Random();

    public PlayerComp(){

    }

    public PlayerComp(String name){
        super(name);
    }

    @Override
    public int guess(){
        return dice.nextInt(6) + 1;
    }
}
