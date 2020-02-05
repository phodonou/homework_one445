package com.mycompany.app;

public class Fly extends Creature implements Flyer {
    Fly(String name) {
        super(name);
    }

    @Override
    public void eat(Thing aThing) {
        if (!(aThing instanceof Creature)) {
            super.eat(aThing);
        } else {
            System.out.println(this + " won't eat a " + aThing);
        }
    }

    @Override
    public void fly() {
        System.out.println(this + " is buzzing around in flight");
    }

    @Override
    void move() {
        fly();
    }
}