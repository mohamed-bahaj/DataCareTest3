package Model;


import java.sql.Date;

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
    private Date date;
    /**
     * Comment add to a care
     */
    private String comment; // év rés traitement

    /**
     * Default constructor define no argument
     */
    private String injection;
    private int idPerfusion;
    private int idAssistance;
    private int idWoundSurveillance;
    private int idTTDouleur;
    private int nurseInami;
    public CarePlan(){}

    public CarePlan(int id, Date date, String comment, String injection, int idPerfusion, int idAssistance, int idWoundSurveillance, int idTTDouleur, int nurseInami) {
        this.id = id;
        this.date = date;
        this.comment = comment;
        this.injection = injection;
        this.idPerfusion = idPerfusion;
        this.idAssistance = idAssistance;
        this.idWoundSurveillance = idWoundSurveillance;
        this.idTTDouleur = idTTDouleur;
        this.nurseInami = nurseInami;
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
    public Date getDate() { return date; }

    /**
     * Set date of a CarePlan
     * @param date new date of a CarePlan
     */
    public void setDate(Date date) { this.date = date; }

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

    public String getInjection() {
        return injection;
    }

    public void setInjection(String injection) {
        this.injection = injection;
    }

    public int getIdPerfusion() {
        return idPerfusion;
    }

    public void setIdPerfusion(int idPerfusion) {
        this.idPerfusion = idPerfusion;
    }

    public int getIdAssistance() {
        return idAssistance;
    }

    public void setIdAssistance(int idAssistance) {
        this.idAssistance = idAssistance;
    }

    public int getIdWoundSurveillance() {
        return idWoundSurveillance;
    }

    public void setIdWoundSurveillance(int idWoundSurveillance) {
        this.idWoundSurveillance = idWoundSurveillance;
    }

    public int getIdTTDouleur() {
        return idTTDouleur;
    }

    public void setIdTTDouleur(int idTTDouleur) {
        this.idTTDouleur = idTTDouleur;
    }

    public int getNurseInami() {
        return nurseInami;
    }

    public void setNurseInami(int nurseInami) {
        this.nurseInami = nurseInami;
    }
}
