package com.thugraven;

public abstract class Player {
    private String name = "Guest";

    public Player(){

    }

    public Player(String name) {
        setName(name);
    }

    public final String getName(){
        return name;
    }

    public final void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Invalid  name!");
        }
    }

    public abstract int guess();
}
