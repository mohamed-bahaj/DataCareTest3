package Model;

/**
 * City contains informations to define a city
 */
public class    City {
    /**
     * Id of a city, use as a key in a database
     */
    private int id;
    /**
     * Postal code of a city
     */
    private int postalCode;
    /**
     * Name of a city
     */
    private String name;

    private String country;

    /**
     * Default constructor, define no argument
     */
    public City(){}

    public City(int postalCode, String name, String country) {
        //this.id = id;
        this.postalCode = postalCode;
        this.name = name;
        this.country = country;
    }

    /**
     * Get id of a city
     * @return Id of a city
     */
    public int getId() { return id; }

    /**
     * Set id of a city
     * @param id New id of a city
     */
    public void setId(int id) { this.id = id; }

    /**
     * Get postalCode of a city
     * @return postalCode of a city
     */
    public int getPostalCode() { return postalCode; }

    /**
     * Set postalCode of a city
     * @param postalCode new postalCode
     */
    public void setPostalCode(int postalCode) { this.postalCode = postalCode; }

    /**
     * Get name of a city
     * @return name of a city
     */
    public String getName() { return name; }

    /**
     * Set name of a city
     * @param name new name of a city
     */
    public void setName(String name) { this.name = name; }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
