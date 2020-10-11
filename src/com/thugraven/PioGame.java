package com.thugraven;

import java.util.Random;

public class PioGame {

    public static void main(String[] args) {

        Random rand = new Random();
        int randNum;
        int playerNum;
        int count = 1;

        while(true){
            randNum = rand.nextInt(6) + 1;
            System.out.println("Picking a number...\nDice: " + randNum);

            playerNum = rand.nextInt(6) + 1;
            System.out.println("Player: " + playerNum);

            if(playerNum == randNum){
                System.out.println("You won! Tries: " + count);
                break;
            }
            else{
                System.out.println("You lost! Try again\n");
                count++;
            }

        }
    }
}
