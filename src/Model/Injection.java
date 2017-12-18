package Model;

/**
 * Injection defines type of injection, related to carePlan in a database
 */
public class Injection {
    /**
     * Type of injection
     */
    private String type;

    /**
     * Defautl constructor, defines no arguments
     */
    public Injection(){}

    /**
     * Constructior defines type of injection
     * @param type
     */
    public Injection(String type) {
        this.type = type;
    }

    /**
     * Get type of injection
     * @return injection type
     */
    public String getType() { return type; }

    /**
     * Set type of injection
     * @param type new injection type
     */
    public void setType(String type) { this.type = type; }
}
