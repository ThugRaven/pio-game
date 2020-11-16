package com.thugraven;

public class Game {
    private Player player = null;

    public Game(){

    }

    public void addPlayer(Player player){
        this.player = player;
    }

    public void play(){
        PlayerComp playerComp = new PlayerComp();
        int randNum;
        int playerNum;
        int count = 1;

        while(true){
            //randNum = rand.nextInt(6) + 1;
            randNum = playerComp.guess();
            System.out.println("Picking a number...\nDice: " + randNum);

            playerNum = player.guess();

            System.out.println("Player " + player.getName() + ": " + playerNum);

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
