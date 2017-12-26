package Model;

/**
 * Perfusion contains informations to define a perfusion, related to carePlan in a database
 */
public class Perfusion {
    /**
     * Id of a perfusion
     */
    private int id;
    /**
     * Type of a perfusion
     */
    private String type;
    /**
     * Quantity of medication delivered
     */
    private float quantity;
    /**
     * Duration of a perfusion
     */
    private float time;

    /**
     * Default constructor, defines no arguments
     */
    public Perfusion(){}

    /**
     * Constructor defines all arguments of a perfusion
     * @param id initial id of a perfusion
     * @param type initial type of a perfusion
     * @param quantity initial quantity of a perfusion
     * @param time initial time of a perfusion
     */
    public Perfusion(int id, String type, float quantity, float time) {
        this.id = id;
        this.type = type;
        this.quantity = quantity;
        this.time = time;
    }

    /**
     * Get id of a perfusion
     * @return perfusion id
     */
    public int getId() { return id; }

    /**
     * Set id of a perfusion
     * @param id new perfusion id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Get type of a perfusion
     * @return perfusion type
     */
    public String getType() { return type; }

    /**
     * Set type of a perfusion
     * @param type new perfusion type
     */
    public void setType(String type) { this.type = type; }

    /**
     * Get quantity of a perfusion
     * @return perfusion quantity
     */
    public float getQuantity() { return quantity; }

    /**
     * Set quantity of a perfusion
     * @param quantity new perfusion quantity
     */
    public void setQuantity(float quantity) { this.quantity = quantity; }

    /**
     * Get time of a perfusion
     * @return perfusion time
     */
    public float getTime() { return time; }

    /**
     * Set time of a perfusion
     * @param time new perfusion time
     */
    public void setTime(float time) { this.time = time; }
}
