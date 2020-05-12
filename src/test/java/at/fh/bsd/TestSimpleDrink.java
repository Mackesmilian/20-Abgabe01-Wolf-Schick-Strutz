package at.fh.bsd;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test the remaining method of at.fh.bsd.SimpleDrink.java
 */
public class TestSimpleDrink {
    /**
     * Tests the isAlcoholic method of at.fh.bsd.SimpleDrink.java
     */
    @Test
    public void testIsAlcoholic(){
        SimpleDrink testi = new SimpleDrink("hallo max", new Liquid("hallo domi", 0.4, 1));
        Assertions.assertTrue(testi.isAlcoholic());
    }

}
