package com.mycompany.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AntTest {
    @Test
    public void canMoveCorrectly() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Ant ant = new Ant("Bob");
        ant.move();
        assertEquals(ant.toString() + " is crawling around\n", outContent.toString());
    }
}
