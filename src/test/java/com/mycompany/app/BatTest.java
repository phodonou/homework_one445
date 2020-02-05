package com.mycompany.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class BatTest {
    @Test
    public void canMoveCorrectly() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Bat bat = new Bat("Steve");
        bat.move();
        assertEquals(bat.toString() + " is swooping through the dark\n", outContent.toString());
    }

    @Test
    public void willEatCreatures() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Bat bat = new Bat("Steve");
        Fly fly = new Fly("Larry");
        bat.eat(fly);
        assertEquals(bat.toString() + " has just eaten a " + fly.toString() + "\n", outContent.toString());
    }

    @Test
    public void willNotEatNonCreatures() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Bat bat = new Bat("Steve");
        Thing thing = new Thing("Larry");
        bat.eat(thing);
        assertEquals(bat.toString() + " won't eat a " + thing.toString() + "\n", outContent.toString());
    }

}
