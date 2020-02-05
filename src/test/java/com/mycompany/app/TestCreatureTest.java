package com.mycompany.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestCreatureTest {
    @Test
    public void testMainPrintsThings() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] argsMain = {};
        TestCreature.main(argsMain);
        assertFalse("Printing stream is not empty", outContent.toString().isEmpty());
    }
}
