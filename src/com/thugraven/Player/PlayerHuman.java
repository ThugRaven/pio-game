package com.thugraven.Player;

import java.util.Scanner;

public class PlayerHuman extends Player{
    private Scanner scan = new Scanner(System.in);

    public PlayerHuman(){

    }

    public PlayerHuman(String name){
        super(name);
    }

    @Override
    public int guess(){
        System.out.println("Pick a number: ");
        return scan.nextInt();
    }
}
