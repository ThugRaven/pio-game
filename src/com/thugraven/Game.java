package com.thugraven;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();

    public Game(){

    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void play(){
        if(players.isEmpty()) {
            throw new IllegalStateException("You cannot start a game without any players!");
        }

        PlayerComp playerComp = new PlayerComp();
        int randNum;
        int playerNum;
        int count = 1;

        boolean loop;

        do{
            System.out.println("###############");
            //randNum = rand.nextInt(6) + 1;
            randNum = playerComp.guess();
            System.out.println("Picking a number...\nDice: " + randNum);

            loop = true;

            for(Player player: players){
                playerNum = player.guess();

                System.out.println("Player " + player.getName() + ": " + playerNum);

                if(playerNum == randNum){
                    System.out.println("You won! Tries: " + count);
                    loop = false;
                    break;
                }
                else{
                    System.out.println("You lost! Try again\n");
                    count++;
                }
            }
        }
        while(loop);
    }
}
