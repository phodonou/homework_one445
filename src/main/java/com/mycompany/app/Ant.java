package com.mycompany.app;

public class Ant extends Creature {
    Ant(String name){
        super(name);
    }

    @Override
    void move() {
        System.out.println(this + " is crawling around");
    }
}