import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test the remaining method of SimpleDrink.java
 */
public class TestSimpleDrink {
    /**
     * Tests the isAlcoholic method of SimpleDrink.java
     */
    @Test
    public void testIsAlcoholic(){
        SimpleDrink testi = new SimpleDrink("hallo max", new Liquid("hallo domi", 0.4, 1));
        assertTrue(testi.isAlcoholic());
    }

}
