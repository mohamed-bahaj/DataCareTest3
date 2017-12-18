package Model;

/**
 * Extern defines a person who assist a patient (different of a doctor because no Inami number)
 */
public class Extern {
    /**
     * Id of an extern
     */
    private int id;
    /**
     * Name of an extern
     */
    private String name;
    /**
     * Surname of an extern
     */
    private String surname;
    /**
     * Work of an extern
     */
    private String work;

    /**
     * Default constructor defines no argument
     */
    public Extern(){}

    /**
     * Constructor defines all arguments of an extern
     * @param id initial id of an extern
     * @param name initial name of an extern
     * @param surname initial surname of an extern
     * @param work initial work of an extern
     */
    public Extern(int id, String name, String surname, String work) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.work = work;
    }

    /**
     * Get id of an extern
     * @return extern id
     */
    public int getId() { return id; }

    /**
     * Set id of an extern
     * @param id new extern id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Get name of an extern
     * @return extern name
     */
    public String getName() { return name; }

    /**
     * Set name of an extern
     * @param name new extern name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Get surname of an extern
     * @return extern surname
     */
    public String getSurname() { return surname; }

    /**
     * Set surname of an extern
     * @param surname new extern surname
     */
    public void setSurname(String surname) { this.surname = surname; }

    /**
     * Get work of an extern
     * @return extern work
     */
    public String getWork() {return work; }

    /**
     * Set work of an extern
     * @param work new extern work
     */
    public void setWork(String work) { this.work = work; }
}
