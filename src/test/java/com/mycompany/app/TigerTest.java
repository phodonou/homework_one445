package com.mycompany.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TigerTest {
    @Test
    public void canMoveCorrectly() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Tiger tiger = new Tiger("Dan");
        tiger.move();
        assertEquals(tiger.toString() + " has just pounced\n", outContent.toString());
    }
}
