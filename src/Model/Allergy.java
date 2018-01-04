package Model;


/**
 * Allergy defines allergies or aggravating factors of a patient
 */
public class Allergy {
    /**
     * Name og allergy or aggravating factor
     */
    private String name;
    /**
     * Type, true means allergy and false means aggravating factor
     */
    private boolean type;

    /**
     * Default constructor defines no argument
     */
    public Allergy(){}

    /**
     * Constructor defines all arguments
     * @param name initial allergy/aggravating factor name
     * @param type initial type
     */
    public Allergy(String name, boolean type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Get allergy/aggravating factor name
     * @return Allergy/aggravating factor name
     */
    public String getName() { return name; }

    /**
     * Set new allergy/aggravating factor name
     * @param name New allergy/aggravating factor name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Get type, allergy or aggravating factor
     * @return type
     */
    public boolean getType() { return type; }

    /**
     * Set allergy/aggravating factor name type
     * @param type new type
     */
    public void setType(boolean type) { this.type = type; }
}
