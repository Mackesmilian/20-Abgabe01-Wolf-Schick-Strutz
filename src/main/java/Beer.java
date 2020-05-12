/**
 * Class that represents a beer with the attributes isDark, wort, the liquid,
 * and liquid's attributes
 */
public class Beer{

    /**
     * Constructor for beer, also creates a list of pale beers.
     *
     * @param liquid corresponding liquid for the beer
     * @param name   the beers name
     * @param isDark a bool whether the bear is pale or dark
     * @param wort   the beer's wort, aka strength in taste
     * @throws IllegalArgumentException when Beer with alcohol content 0 is
     *                                  created
     */
    public Beer(Liquid liquid, String name, boolean isDark, int wort) throws IllegalArgumentException{
    }

    /**
     * @return String with the names of the beers in the List lightBeers
     */
    public static String printLightBeers() {
    }

    /**
     * Getter for name
     *
     * @return returns a String for the beer's name
     */
    public String getName() {
    }

    /**
     * Getter for the corresponding liquid
     *
     * @return Object Liquid of the corresponding beer
     */
    public Liquid getLiquid() {
    }

    /**
     * Sets a new liquid
     *
     * @param liquid New liquid to set
     */
    public void setLiquid(Liquid liquid) {
    }

    /**
     * Gets the type of the beer, which is the liquid's name
     *
     * @return name of liquid
     */
    public String getType() {
    }

    /**
     * Setter for type, which is the name of the liquid
     *
     * @param type String representing the liquid's name/beer type
     */
    public void setType(String type) {
    }

    /**
     * Checks if the beer is dark
     *
     * @return bool for whether the beer is dark or not
     */
    public boolean isDark() {
    }

    /**
     * Setter for dark
     *
     * @param dark bool if the beer is set to dark
     */
    public void setDark(boolean dark) {
    }

    /**
     * Getter for wort
     *
     * @return Beer's wort
     */
    public int getWort() {
    }

    /**
     * Setter for wort
     *
     * @param wort int for the wort
     */
    public void setWort(int wort) {
    }

    /**
     * Gets the volume of the liquid
     *
     * @return int for liquid's volume
     */

    @Override
    public double getVolume() {
    }

    /**
     * Getter for the alcohol content
     * @return int representing alcohol content in volume percent
     */

    @Override
    public double getAlcoholPercent() {
    }

    /**
     * Bool method to determine whether a beer is alcoholic or not
     * @return the liquids alcohol percentage as a double
     */
    @Override
    public boolean isAlcoholic() {
    }
}
