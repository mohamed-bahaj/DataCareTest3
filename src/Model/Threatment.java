package Model;

/**
 * Threatment defines a medication taken by a patient
 */
public class Threatment {
    /**
     * Name of the medication
     */
    private String drug;

    /**
     * Default constructor defines no arguments
     */
    public Threatment(){}

    /**
     * Constructor defines name of medication
     * @param drug
     */
    public Threatment(String drug) {
        this.drug = drug;
    }

    /**
     * Get name of a threatment
     * @return threatment name
     */
    public String getDrug() { return drug; }

    /**
     * Set name of a threatment
     * @param drug new threatment name
     */
    public void setDrug(String drug) { this.drug = drug; }
}
