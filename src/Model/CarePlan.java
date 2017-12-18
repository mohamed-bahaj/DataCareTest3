package Model;

/**
 *CarePlan define a care performed on a patient
 */
public class CarePlan {
    /**
     * Id CarePlan used as a key in a database
     */
    private int id;
    /**
     * Date of care
     */
    private int date;
    /**
     * Comment add to a care
     */
    private String comment; // év rés traitement

    /**
     * Default constructor define no argument
     */
    public CarePlan(){}

    /**
     * Constructor define all argument of a CarePlan
     * @param id
     * @param date
     * @param comment
     */
    public CarePlan(int id, int date, String comment) {
        this.id = id;
        this.date = date;
        this.comment = comment;
    }

    /**
     * Get id of a CarePlan
     * @return Id of the CarePlan
     */
    public int getId() { return id; }

    /**
     * Set Id of a CarePlan
     * @param id New id of a CarePlan
     */
    public void setId(int id) { this.id = id; }

    /**
     * Get date of a CarePlan
     * @return date of the CarePlan
     */
    public int getDate() { return date; }

    /**
     * Set date of a CarePlan
     * @param date new date of a CarePlan
     */
    public void setDate(int date) { this.date = date; }

    /**
     * Get comment of a CarePlan
     * @return comment of a CarePlan
     */
    public String getComment() { return comment; }

    /**
     * Set comment of a CarePlan
     * @param comment New comment of a Careplan
     */
    public void setComment(String comment) { this.comment = comment; }
}
