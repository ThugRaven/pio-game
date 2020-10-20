package com.thugraven;

import java.util.Random;

public class Player {
    private Random dice = new Random();
    private String name = "Guest";

    public Player(){

    }

    public Player(String name) {
        setName(name);
    }

    public int guess(){
        return dice.nextInt(6) + 1;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Invalid  name!");
        }
    }

}
