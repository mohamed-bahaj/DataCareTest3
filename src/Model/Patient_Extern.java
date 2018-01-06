package Model;

public class Patient_Extern {
    private int idPatient;
    private int idExtern;

    public Patient_Extern() { }

    public Patient_Extern(int idPatient, int idExtern) {
        this.idPatient = idPatient;
        this.idExtern = idExtern;
    }

    public int getIdPatient() { return idPatient; }
    public void setIdPatient(int idPatient) { this.idPatient = idPatient; }

    public int getIdExtern() { return idExtern; }
    public void setIdExtern(int idExtern) { this.idExtern = idExtern; }
}
