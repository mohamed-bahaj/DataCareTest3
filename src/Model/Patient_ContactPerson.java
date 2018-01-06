package Model;

public class Patient_ContactPerson {

    private int idPatient;
    private int phoneNumber;

    public Patient_ContactPerson() { }

    public Patient_ContactPerson(int idPatient, int phoneNumber) {
        this.idPatient = idPatient;
        this.phoneNumber = phoneNumber;
    }

    public int getIdPatient() { return idPatient; }
    public void setIdPatient(int idPatient) { this.idPatient = idPatient; }

    public int getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }
}
