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
        if(name != null && name.matches("^[a-zA-Z0-9\\-_]{5,}$")){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name!");
        }
    }

    public abstract int guess();
}
