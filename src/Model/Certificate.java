package Model;


import java.sql.Date;

public class Certificate {
    private int number;
    private boolean typeCare;
    private Date startingDate;
    private float duration;
    private float time;
    private Date datePrescription;
    private int doctorInami;
    private int idPatient;

    public Certificate(){}

    public Certificate(int number, boolean typeCare, Date startingDate, float duration, float time, Date datePrescription, int doctorInami, int idPatient) {
        this.number = number;
        this.typeCare = typeCare;
        this.startingDate = startingDate;
        this.duration = duration;
        this.time = time;
        this.datePrescription = datePrescription;
        this.doctorInami = doctorInami;
        this.idPatient = idPatient;
    }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public boolean getTypeCare() { return typeCare; }
    public void setTypeCare(boolean typeCare) { this.typeCare = typeCare; }
    public Date getStartingDate() { return startingDate; }
    public void setStartingDate(Date startingDate) { this.startingDate = startingDate; }
    public float getDuration() { return duration; }
    public void setDuration(float duration) { this.duration = duration; }
    public float getTime() { return time; }
    public void setTime(float time) { this.time = time; }

    public boolean isTypeCare() {
        return typeCare;
    }

    public Date getDatePrescription() {
        return datePrescription;
    }

    public void setDatePrescription(Date datePrescription) {
        this.datePrescription = datePrescription;
    }

    public int getDoctorInami() {
        return doctorInami;
    }

    public void setDoctorInami(int doctorInami) {
        this.doctorInami = doctorInami;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }
}
