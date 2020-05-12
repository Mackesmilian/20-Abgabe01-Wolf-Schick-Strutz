package at.fh.bsd;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class for Testing
 */
 public class TestSpirit {
     static Spirit laphroaig, havana, slivovic, zirbe, stroh, gin;

   /**
    * will execute operation before each test
    */
    @BeforeClass
    public static void setup() {
        laphroaig = new Spirit(true, "malt", "Laphroaig",
                new Liquid("whiskey", 0.1, 40));
        havana = new Spirit(true, "Sugar Cane", "Havana Club 23",
                new Liquid("rum", 0.1, 40));
        slivovic = new Spirit(false, "plum", "slivovic",
                new Liquid("slivovic", 0.1, 55));
        zirbe = new Spirit(true, "grain", "Zirbe",
                new Liquid("Zirbe", 0.1, 40));
        stroh = new Spirit(false, "Sugar Cane", "Stroh",
                new Liquid("Stroh 80", 0.1, 80));
        gin = new Spirit(false, "juniper", "Hendricks",
                new Liquid("Gin", 0.1, 40));
    }

    /**
     * Testing the Constructor:
     * the test will show if the Constructor creates the wanted attribute
     */
     @Test
     public void testConstructor() {
           Assertions.assertTrue(laphroaig.isDark());
           Assertions.assertFalse(slivovic.isDark());
           Assertions.assertEquals("malt", laphroaig.getMainIngredient());
           Assertions.assertEquals("Sugar Cane", havana.getMainIngredient());
           Assertions.assertEquals("slivovic", slivovic.getName());
           Assertions.assertEquals("Zirbe", zirbe.l.getName());
           Assertions.assertEquals("Stroh 80", stroh.l.getName());
           Assertions.assertEquals(0.1, stroh.getVolume());
           Assertions.assertEquals(40, zirbe.getAlcoholPercent());
     }

     /**
      * Here we test the list and the toString method at the same time
      * expected the two Spirits with an Alcoholpercent > 50
      */
      @Test
      public void testHardStuffToString() {
            Assertions.assertEquals("slivovic\nStroh\n", Spirit.hardStufftoString());
      }

      /**
       * tests the self implemented Exception
       * if alcoholpercent is < 40 Exception will be thrown
       */
       @Test
       public void checkIfSpirit() {
           assertThrows(IllegalArgumentException.class, () -> {
               Spirit likör = new Spirit(false, "sugar", "xuxu", new Liquid("sugarsyrup", 0.4,
                       25));
           });
       }

       /**
        * tests the setDark function
        * creating an object with isDark: false then check it.
        * set it to true and check it again
        */
        @Test
        public void testSetDark() {
            Spirit test = new Spirit(false, "testii", "testtest", (new Liquid("test",
                    0.1, 40)));
            Assertions.assertFalse(test.isDark());
            test.setDark(true);
            Assertions.assertTrue(test.isDark());
        }

        /**
         * tests the setter for MainIngredient
         * creating an test object, set it with the constructor
         * checks it, then setting the new MainIngredient and check it again.
         */
         @Test
         public void testSetMainIngredient() {
             Spirit test = new Spirit(false, "testii", "testtest", (new Liquid("test",
                     0.1, 40)));
             Assertions.assertEquals(test.getMainIngredient(), "testii");
             test.setMainIngredient("testii2");
             Assertions.assertEquals(test.getMainIngredient(), "testii2");
         }
       }
