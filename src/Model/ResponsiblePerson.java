package Model;


import java.sql.Date;

/**
 * ResponsiblePerson defines a responsible person of a patient if it is not himself
 */
public class ResponsiblePerson {
    /**
     * Id of a a responsiblePerson
     */
    private int id;
    /**
     * Name of a responsiblePerson
     */
    private String name;
    /**
     * Surname of a responsiblePerson
     */
    private String surname;
    /**
     * Birthday of a responsiblePerson
     */
    private Date birthday;

    private int idPatient;

    /**
     * Default constructor, defines no arguments
     */
    public ResponsiblePerson(){}

    public ResponsiblePerson(int id, String name, String surname, Date birthday, int idPatient) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.idPatient = idPatient;
    }

    /**
     * Get id of a responsiblePerson
     * @return responsiblePerson id
     */
    public int getId() { return id; }

    /**
     * Set id of a responsiblePerson
     * @param id new responsiblePersonid
     */
    public void setId(int id) { this.id = id; }

    /**
     * Get name of a responsiblePerson
     * @return responsiblePerson name
     */
    public String getName() { return name; }

    /**
     * Set name of a responsiblePerson
     * @param name new responsiblePerson name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Get surname of a responsiblePerson
     * @return responsiblePerson surname
     */
    public String getSurname() { return surname; }

    /**
     * Set surname of a responsiblePerson
     * @param surname new responsiblePerson surname
     */
    public void setSurname(String surname) { this.surname = surname; }

    /**
     * Get birthday of a responsiblePerson
     * @return responsiblePerson birthday
     */
    public Date getBirthday() { return birthday; }

    /**
     * Set birthday of a responsiblePerson
     * @param birthday new responsiblePerson birthday
     */
    public void setBirthday(Date birthday) { this.birthday = birthday; }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }
}
