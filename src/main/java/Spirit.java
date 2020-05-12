import java.util.ArrayList;

public class Spirit extends SimpleDrink {
    private boolean isDark;
    private String mainIngredient;
    private static ArrayList<Spirit> hardStuff = new ArrayList<>();

    /**
     * Constructor for Spirit
     * @param isDark bool for whether the spirit is dark or not
     * @param mainIngredient the spirit's main ingredient
     * @param name the spirit's name
     * @param l the corresponding liquid for each spirit
     * @throws IllegalArgumentException is thrown when a spirit with less than 40%
     * alcohol content is created
     */
    Spirit(boolean isDark, String mainIngredient, String name, Liquid l) throws IllegalArgumentException{
        super(name, l);
        if(l.getAlcoholPercent() < 40){
            throw new IllegalArgumentException("This is not a spirit!");
        }
        this.isDark = isDark;
        this.mainIngredient = mainIngredient;
        if(this.l.getAlcoholPercent() > 50){
            hardStuff.add(this);
        }
    }

    /**
     * Prints all the spirits with more then 50% alcohol content, from i to
     * the end of the hardStuff list and puts a newline behind each spirits
     * name
     *
     * @return return all the spirits with more then 50% alcohol content
     */
    public static String hardStufftoString(){
        String output = "";
        for (Spirit i : hardStuff) {
            output += i.name;
            output += "\n";
        }
        return output;
    }

    /**
     * Getter method for the color of the spirit
     *
     * @return returns true if the drink is dark and false if the drink isn't
     */
    public boolean isDark() {
        return isDark;
    }

    /**
     * Setter method for the color of the spirit
     *
     * @param dark is the boolean that comes with the function call, true is
     *             dark false isn't dark
     */
    public void setDark(boolean dark) {
        isDark = dark;
    }

    /**
     * Getter method for the name of the main ingredient in the spirit
     *
     * @return returns the name of the main ingredient of the spirit
     */
    public String getMainIngredient() {
        return mainIngredient;
    }

    /**
     * Setter method for the main ingredient in the spirit
     *
     * @param mainIngredient the name (as String) of the main ingredient in the
     *                       spirit
     */
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    /**
     * getter for the name
     * @return String representing the spirit's name
     */
    public String getName(){
        return super.name;
    }
}
}