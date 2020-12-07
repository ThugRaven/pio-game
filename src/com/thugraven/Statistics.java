package com.thugraven;

import java.util.HashMap;

public class Statistics {
    private HashMap<String, Integer> stats = new HashMap<>();

    public void updateScore(String name){
        int score = stats.getOrDefault(name, 0);
        score++;
        stats.put(name, score);
    }

    public void printStats(){
        if(stats.isEmpty()){
            System.out.println("No wins found!");
            return;
        }

        System.out.println("##### Statistics #####");
        // 1
//        for(String name: stats.keySet()){
//            System.out.println(name + ": " + stats.get(name));
//        }

        // 2
        stats.forEach((name, score) -> System.out.println(name + ": " + score));
        System.out.println("######################");
    }

    public void clearStats(){
        stats.clear();
    }
}
