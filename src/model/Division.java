package model;

/**
 * Creates Division objects that represent first level divisions where the customers live
 */
public class Division {

    private int id;
    private String name;
    private String country;

    /**
     * Class constructor
     * @param id the division ID
     * @param name the division name
     * @param country the associated country name
     */
    public Division(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    /**
     * Default class constructor
     */
    public Division() { }

    /**
     * Gets the division ID
     * @return the division ID
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the division ID
     * @param id the division ID
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Gets the division name
     * @return the division name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the division name
     * @param name the division name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the associated country name
     * @return the associated country name
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the associated country name
     * @param country the associated country name
     */
    public void setCountry(String country) {
        this.country = country;
    }

}
