package Model;

/**
 * Nurse class to define a nurse informations
 */
public class Nurse {

    /**
     * Inami number of the nurse
     */
    private int inami;
    /**
     * Name of the nurse
     */
    private String name;
    /**
     * Surname of the nurse
     */
    private String lastName;
    /**
     * Status in the company
     */
    private String status;
    /**
     * Email of the nurse
     */
    private String email;
    /**
     * Password of the nurse
     */
    private String password;

    /**
     * Constructor, define all arguments of the nurse
     * @param inami initial Inami
     * @param name initial name
     * @param lastName initial lastName
     * @param status initial status
     * @param email initial email
     * @param password initial password
     */
    public Nurse(int inami, String name, String lastName, String status, String email, String password) {
        this.inami = inami;
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.email = email;
        this.password = password;
    }

    /**
     * Default constructor define no argument
     */
    public Nurse() {
    }

    /**
     * Get nurse Inami number
     * @return nurse Inami number
     */
    public int getInami() {
        return inami;
    }
    /**
     * Set nurse Inami number
     * @param inami new nurse Inami number
     */
    public void setInami(int inami) {this.inami = inami;}

    /**
     * Get nurse name
     * @return nurse name
     */
    public String getName() {
        return name;
    }

    /**
     * Set nurse name
     * @param name new nurse name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get nurse lastName
     * @return nurse lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set nurse lastName
     * @param lastName new nurse lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get nurse status
     * @return nurse status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set nurse status
     * @param status new nurse status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Get nurse email
     * @return nurse email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set nurse email
     * @param email new nurse email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get nurse password
     * @return nurse password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set nurse password
     * @param password new nurse password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "inami=" + inami +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", statut='" + status + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}