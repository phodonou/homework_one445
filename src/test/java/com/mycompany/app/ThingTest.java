package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThingTest {
    @Test
    public void toStringFirstNameOnly() {
        Thing thing1 = new Thing("thing1");
        assertEquals("thing1 ", thing1.toString());
    }

    @Test
    public void toStringFirstAndLastName() {
        Ant ant = new Ant("Julie");
        assertEquals("Julie Ant", ant.toString());
    }
}
