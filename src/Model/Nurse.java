package Model;

/**
 * Nurse class to define a nurse informations
 */
public class Nurse {
    /**
     * Inami number of the nurse
     */
    private int inamiNumber;
    /**
     * Name of the nurse
     */
    private String name;
    /**
     * Surname of the nurse
     */
    private String surname;
    /**
     * Status in the company
     */
    private String status;

    /**
     * Default constructor define no argument
     */
    public Nurse(){}

    /**
     * Constructor, define all arguments of the nurse
     * @param inamiNumber initial Inami number
     * @param name initial name
     * @param surname initial surname
     * @param status initial status
     */
    public Nurse(int inamiNumber, String name, String surname, String status) {
        this.inamiNumber = inamiNumber;
        this.name = name;
        this.surname = surname;
        this.status = status;
    }


    /**
     * Get nurse Inami number
     * @return nurse Inami number
     */
    public int getInamiNumber() { return inamiNumber; }

    /**
     * Set nurse Inami number
     * @param inamiNumber new nurse Inami number
     */
    public void setInamiNumber(int inamiNumber) { this.inamiNumber = inamiNumber; }

    /**
     * Get nurse name
     * @return nurse name
     */
    public String getName() { return name; }

    /**
     * Set nurse name
     * @param name new nurse name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Get nurse surname
     * @return nurse surname
     */
    public String getSurname() { return surname; }

    /**
     * set nurse surname
     * @param surname new nurse surname
     */
    public void setSurname(String surname) { this.surname = surname; }

    /**
     * Get nurse status
     * @return nurse status
     */
    public String getStatus() { return status; }

    /**
     * Set nurse status
     * @param status new nurse status
     */
    public void setStatus(String status) { this.status = status; }
}
