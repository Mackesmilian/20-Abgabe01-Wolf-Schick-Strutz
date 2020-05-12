import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBeer {
    static Beer goesser, corona, guiness;

    /**
     * Setup method to create specific objects to test on
     */
    @BeforeClass
    public static void setup(){
        goesser = new Beer(new Liquid("lager", 0.5, 6),
                "goesser", false, 12);
        corona = new Beer(new Liquid("lager", 0.5, 4),
                "corona", false, 9);
        guiness = new Beer(new Liquid("draught", 0.5, 7),
                "guiness", true, 16);
    }

    /**
     * A method to see if the List was created correctly and if the print
     * method of Beer works correctly
     */
    @Test
    public void testList(){
        assertEquals("goesser\ncorona\n", Beer.printLightBeers());
    }

    /**
     * Check if our own exception throws correctly, in this case you should
     * not be able to make a new beer with no alcohol
     */
    @Test
    public void checkException(){
        assertThrows(IllegalArgumentException.class,()->{
            Beer nonAlc = new Beer(new Liquid("lager", 0.5, 0),
                    "NullKommaJosef", false, 0);
        });
    }

    /**
     * Create the beers with the constructor and fetch those expected
     * outcomes with the getter methods
     */
    @Test
    public void testConstr(){
        assertEquals("lager", corona.getType());
        assertEquals("lager", goesser.getLiquid().getName());
        assertEquals(0.5, goesser.getLiquid().getVolume());
        assertEquals(6, goesser.getLiquid().getAlcoholPercent());
        assertEquals(16, guiness.getWort());
        for (Beer i: Beer.lightBeers) {
            assertFalse(i.isDark());
        }
        assertTrue(guiness.isDark());
    }

    /**
     * Create a new beer and try to set the liquid of that specific beer to a
     * new one, the outcome should be the new setted liquid
     */
    @Test
    public void testSetLiquid(){
        Beer test = new Beer(new Liquid("test", 0.5, 6),
                "test", false, 12);
        Liquid lTest = new Liquid("new Name", 0.3, 5);
        test.setLiquid(lTest);
        assertEquals("new Name", test.getLiquid().getName());
        assertEquals(0.3, test.getVolume());
        assertEquals(5, test.getAlcoholPercent());
    }

    /**
     * Create a new beer then set a new type of this beer and compare if
     * the change happened
     */
    @Test
    public void testSetType(){
        Beer test = new Beer(new Liquid("test", 0.5, 6),
                "test", false, 12);
        assertEquals("test", test.getType());
        test.setType("Ale");
        assertEquals("Ale", test.getType());
    }

    /**
     * Create a new beer then set a new color of this beer and compare if
     * the change happened
     */
    @Test
    public void testSetDark(){
        Beer test = new Beer(new Liquid("test", 0.5, 6),
                "test", false, 12);
        assertFalse(test.isDark());
        test.setDark(true);
        assertTrue(test.isDark());
    }

    /**
     * Create a new beer then set a new wort of this beer and compare if
     * the change happened
     */
    @Test
    public void testSetWort(){
        Beer test = new Beer(new Liquid("test", 0.5, 6),
                "test", false, 12);
        assertEquals(12, test.getWort());
        test.setWort(25);
        assertEquals(25, test.getWort());
    }

}
