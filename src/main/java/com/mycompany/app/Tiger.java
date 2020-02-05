package com.mycompany.app;

public class Tiger extends Creature{
    Tiger(String name){
        super(name);
    }

    @Override
    void move() {
        System.out.println(this + " has just pounced");
    }
}