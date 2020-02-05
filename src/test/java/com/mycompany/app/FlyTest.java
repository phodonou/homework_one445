package com.mycompany.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class FlyTest {
    @Test
    public void canMoveCorrectly() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Fly fly = new Fly("fly");
        fly.move();
        assertEquals(fly.toString() + " is buzzing around in flight\n", outContent.toString());
    }

    @Test
    public void willNotEatCreatures() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Bat bat = new Bat("Steve");
        Fly fly = new Fly("Larry");
        fly.eat(bat);
        assertEquals(fly.toString() + " won't eat a " + bat.toString() + "\n", outContent.toString());
    }

    @Test
    public void willEatNonCreatures() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Fly fly = new Fly("Larry");
        Thing thing = new Thing("Thingy");
        fly.eat(thing);
        assertEquals(fly.toString() + " has just eaten a " + thing.toString() + "\n", outContent.toString());
    }

}
