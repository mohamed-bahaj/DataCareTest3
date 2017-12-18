package Model;

/**
 * Doctor contains informations to define a doctor
 */
public class Doctor {
    /**
     * Inami number of a doctor
     */
    private int inamiNumber;
    /**
     * Name of a doctor
     */
    private String name;
    /**
     * Surname of a doctor
     */
    private String surname;
    /**
     * Specialization of a doctor
     */
    private String specialisation;

    /**
     * Default constructor, defines no arguments
     */
    public Doctor(){}

    /**
     * Constructor defines all arguments of a doctor
     * @param inamiNumber initial Inami number of a doctor
     * @param name initial name of a doctor
     * @param surname initial surname of a doctor
     * @param specialisation initial specialization of a doctor
     */
    public Doctor(int inamiNumber, String name, String surname, String specialisation) {
        this.inamiNumber = inamiNumber;
        this.name = name;
        this.surname = surname;
        this.specialisation = specialisation;
    }

    /**
     * Get Inami number of a number
     * @return doctor Inami number
     */
    public int getInamiNumber() { return inamiNumber; }

    /**
     * Set Inami number
     * @param inamiNumber new Inami number
     */
    public void setInamiNumber(int inamiNumber) { this.inamiNumber = inamiNumber; }

    /**
     * Get name of a doctor
     * @return Doctor name
     */
    public String getName() { return name; }

    /**
     * Set name of a dcotor
     * @param name new name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Get surname of a doctor
     * @return Doctor name
     */
    public String getSurname() { return surname; }

    /**
     * Set surname of a doctor
     * @param surname New doctor name
     */
    public void setSurname(String surname) { this.surname = surname; }

    /**
     * Get specialization of a doctor
     * @return doctor specialization
     */
    public String getSpecialisation() { return specialisation; }

    /**
     * Set specialization of a doctor
     * @param specialisation New doctor specialization
     */
    public void setSpecialisation(String specialisation) { this.specialisation = specialisation; }
}
