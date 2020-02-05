package com.mycompany.app;

public abstract class Creature extends Thing {
    private Thing lastThingEat;

    Creature(String name) {
        super(name);
    }

    public void eat(Thing aThing) {
        lastThingEat = aThing;
        System.out.println(this + " has just eaten a " + aThing);
    }

    public void whatDidYouEat() {
        String whatDidIEat = lastThingEat == null ? this + " has had nothing to eat"
                : this + " has eaten a " + lastThingEat + "!";
        System.out.println(whatDidIEat);
    }

    abstract void move();
}