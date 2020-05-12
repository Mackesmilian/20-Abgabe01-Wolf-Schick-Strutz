package at.fh.bsd;

import java.util.ArrayList;

/**
 * Class that represents a beer with the attributes isDark, wort, the liquid,
 * and liquid's attributes
 */
public class Beer extends Drink{
  public static ArrayList<Beer> lightBeers = new ArrayList<Beer>();
  private boolean isDark;
  private int wort;
  private Liquid liquid;

    /**
     * Constructor for beer, also creates a list of pale beers.
     *
     * @param liquid corresponding liquid for the beer
     * @param name   the beers name
     * @param isDark a bool whether the bear is pale or dark
     * @param wort   the beer's wort, aka strength in taste
     * @throws IllegalArgumentException when at.fh.bsd.Beer with alcohol content 0 is
     *                                  created
     */
    public Beer(Liquid liquid, String name, boolean isDark, int wort) throws IllegalArgumentException{
      super(name);
      this.liquid = liquid;
      this.isDark = isDark;
      this.wort = wort;
      if (!this.isAlcoholic()) {
          throw new IllegalArgumentException("Alcohol free beer is not beer!");
      }
      if (!this.isDark) {
          lightBeers.add(this);
      }
    }

    /**
     * @return String with the names of the beers in the List lightBeers
     */
    public static String printLightBeers() {
      String output = "";
      for (Beer i : lightBeers) {
          output += i.getName() + "\n";
      }
      return output;
    }

    /**
     * Getter for name
     *
     * @return returns a String for the beer's name
     */
    public String getName() {
      return super.name;
    }

    /**
     * Getter for the corresponding liquid
     *
     * @return Object at.fh.bsd.Liquid of the corresponding beer
     */
    public Liquid getLiquid() {
      return liquid;
    }

    /**
     * Sets a new liquid
     *
     * @param liquid New liquid to set
     */
    public void setLiquid(Liquid liquid) {
      this.liquid = liquid;
    }

    /**
     * Gets the type of the beer, which is the liquid's name
     *
     * @return name of liquid
     */
    public String getType() {
      return liquid.getName();
    }

    /**
     * Setter for type, which is the name of the liquid
     *
     * @param type String representing the liquid's name/beer type
     */
    public void setType(String type) {
      liquid.setName(type);
    }

    /**
     * Checks if the beer is dark
     *
     * @return bool for whether the beer is dark or not
     */
    public boolean isDark() {
      return isDark;
    }

    /**
     * Setter for dark
     *
     * @param dark bool if the beer is set to dark
     */
    public void setDark(boolean dark) {
      isDark = dark;
    }

    /**
     * Getter for wort
     *
     * @return at.fh.bsd.Beer's wort
     */
    public int getWort() {
      return wort;
    }

    /**
     * Setter for wort
     *
     * @param wort int for the wort
     */
    public void setWort(int wort) {
      this.wort = wort;
    }

    /**
     * Gets the volume of the liquid
     *
     * @return int for liquid's volume
     */

    @Override
    public double getVolume() {
      return this.liquid.getVolume();
    }

    /**
     * Getter for the alcohol content
     * @return int representing alcohol content in volume percent
     */

    @Override
    public double getAlcoholPercent() {
      return this.liquid.getAlcoholPercent();
    }

    /**
     * Bool method to determine whether a beer is alcoholic or not
     * @return the liquids alcohol percentage as a double
     */
    @Override
    public boolean isAlcoholic() {
        return this.liquid.getAlcoholPercent() > 0;
    }
}
