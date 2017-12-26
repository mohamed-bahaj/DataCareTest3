package Model;

/**
 * ContactPerson contains informations to define a contact person of a patient
 */
public class ContactPerson {
    /**
     * Phone number of a contactPerson
     */
    private int phonenumber;
    /**
     * Name of a contactPerson
     */
    private String name;
    /**
     * Surname of a contactPerson
     */
    private String surname;
    /**
     * Link between a patient and a contactPerson
     */
    private String link;

    /**
     * Default constructor defines no arguments
     */
    public ContactPerson(){}

    /**
     * Constructor defines all arguments of a contactPerson
     * @param phonenumber initial phoneNumber of a contactPerson
     * @param name initial name of a contactPerson
     * @param surname initial surname of a contactPerson
     * @param link initial link between a patient and a contactPerson
     */
    public ContactPerson(int phonenumber, String name, String surname, String link) {
        this.phonenumber = phonenumber;
        this.name = name;
        this.surname = surname;
        this.link = link;
    }

    /**
     * Get phone number of a contactPerson
     * @return contactPerson phone number
     */
    public int getPhonenumber() { return phonenumber; }

    /**
     * Set phone number of a contactPerson
     * @param phonenumber new contactPerson phone number
     */
    public void setPhonenumber(int phonenumber) { this.phonenumber = phonenumber; }

    /**
     * Get name of a contactPerson
     * @return contactPerson name
     */
    public String getName() { return name; }

    /**
     * Set name of a contactPerson
     * @param name new contactPerson name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Get surname of a contactPerson
     * @return contactPerson surname
     */
    public String getSurname() { return surname; }

    /**
     * Set surname of a contactPerson
     * @param surname new contactPerson surname
     */
    public void setSurname(String surname) { this.surname = surname; }

    /**
     * Get link between a patient and a contactPerson
     * @return link between patient and a contactPerson
     */
    public String getLink() { return link; }

    /**
     * Set link between patient and a contactPerson
     * @param link new link between patient and contactPerson
     */
    public void setLink(String link) {this.link = link; }
}
