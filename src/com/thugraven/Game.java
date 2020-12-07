package com.thugraven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {
    private List<Player> players = new ArrayList<>();
    private Random rand = new Random();
    private Statistics stats;

    public Game(Statistics stats){
        this.stats = stats;
    }

    public void addPlayer(Player player){
        if(!nameExists(player.getName())){
            players.add(player);
        }
        else{
            player.setName(findUniqueName(player.getName()));
            addPlayer(player);
            //throw new IllegalArgumentException("This name already exist!");
        }
    }

    public void removePlayer(String name){
        // 1
//        for(int i = 0; i < players.size(); i++){
//            if(players.get(i).getName().equals(name)){
//                players.remove(i);
//                break;
//            }
//        }

        // 2
//        for(Player player: players){
//            if(player.getName().equals(name)){
//                players.remove(player);
//                break;
//            }
//        }

        // 3
        Iterator<Player> it = players.iterator();
        while(it.hasNext()){
            if(it.next().getName().equals(name)){
                it.remove();
                break;
            }
        }

        // 4
//        players.removeIf(player -> player.getName().equals(name));
    }

    public void printPlayers(){
        for(Player player: players){
            System.out.println(player.getName());
        }
    }

    public boolean nameExists(String name){
        for(Player player: players){
            if(player.getName().equals(name)){
                //System.err.println(player.getName() + " == " + name);
                return true;
            }
        }
        return false;
    }

    public String findUniqueName(String name){
        return name + rand.nextInt(10) + 1; // range of 1 - 10
    }

    public void play(){
        if(players.isEmpty()){
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
                    stats.updateScore(player.getName());
                    stats.printStats();
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
