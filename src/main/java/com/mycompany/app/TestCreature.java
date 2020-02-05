package com.mycompany.app;

public class TestCreature {
    public static final int CREATURE_COUNT = 4;
    public static final int THING_COUNT = 6;

    public static void main(String[] args) {
        Creature[] creatures = { new Ant("Mary"), new Bat("Joe"), new Fly("Julie"), new Tiger("Dan"), };
        Thing[] things = new Thing[THING_COUNT];

        // add the first two things
        Thing thing1 = new Thing("Thing1");
        Thing thing2 = new Ant("Ant_Thing2");
        things[0] = thing1;
        things[1] = thing2;

        // add creature instances
        int thingsIndex = 2;
        for (int i = 0; i < creatures.length; i++) {
            things[thingsIndex] = creatures[i];
            thingsIndex += 1;
        }

        //print objects
        System.out.println("Things: \n");
        for (int i = 0; i < things.length; i++) {
            System.out.println(things[i]);
        }
        System.out.println();

        System.out.println("Creatures: \n");
        for (int i = 0; i < creatures.length; i++) {
            System.out.println(creatures[i]);
        }
        System.out.println();

        System.out.println("Move: \n");
        for (int i = 0; i < creatures.length; i++) {
            creatures[i].move();
        }
        System.out.println();

        System.out.println("Before Eating: \n");
        for (int i = 0; i < creatures.length; i++) {
            creatures[i].whatDidYouEat();
        }
        System.out.println();

        System.out.println("Eating: \n");
        for (int i = 0; i < creatures.length; i++) {
            creatures[i].eat( new Thing("thing") );
        }
        System.out.println();

        System.out.println("Eating: \n");
        for (int i = 0; i < creatures.length; i++) {
            creatures[i].eat( new Fly("fly") );
        }
        System.out.println();

        System.out.println("Before Eating and Eating: \n");
        for (int i = 0; i < creatures.length; i++) {
            creatures[i].eat( new Fly("fly") );
            creatures[i].whatDidYouEat();
        }
        System.out.println();
    }
}