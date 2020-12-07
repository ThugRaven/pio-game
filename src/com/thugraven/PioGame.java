package com.thugraven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class PioGame {

    public static void main(String[] args) {

//        Random rand = new Random();
//        Player player = new Player("Ziutek");
//        player.setName("Ziutek");

//        Statistics stats = new Statistics();
//        stats.updateScore("Janusz");
//        stats.updateScore("Janusz");
//        stats.updateScore("Janusz");
//        stats.updateScore("Maria");
//        stats.printStats();

//        stats.clearStats();
//        stats.printStats();

        Player player = new PlayerHuman();

//        try{
            player.setName("Ziutek");

            Game game = new Game(new Statistics());
//            game.addPlayer(player);
            game.addPlayer(new PlayerComp("Bot123"));
            game.addPlayer(new PlayerComp("Ziutek"));

            //game.removePlayer("Ziutek");

            game.printPlayers();
            for(int i = 0; i < 10; i++){
                game.play();
            }
//        }
//        catch(IllegalArgumentException e){
//            System.err.println(e.getMessage());
//        }
    }
}
