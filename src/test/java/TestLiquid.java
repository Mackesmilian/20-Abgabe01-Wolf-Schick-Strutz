import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test class
 */
public class TestLiquid {
    /**
     * static variable test
     */
    static Liquid test;

    /**
     * will execute operation before each test
     */
    @BeforeClass
    public static void setup() {
        test = new Liquid("water", 1, 0);
    }

    /**
     * tests the setter for getVolume
     */
    @Test
    public void testVolume() {
        assertEquals(1, test.getVolume());
        test.setVolume(2);
        assertEquals(2, test.getVolume());
    }

    /**
     * tests the setter for AlcoholPercent
     */
    @Test
    public void testAlcoholPercent() {
        assertEquals(0, test.getAlcoholPercent());
        test.setAlcoholPercent(3);
        assertEquals(3, test.getAlcoholPercent());
    }
}
