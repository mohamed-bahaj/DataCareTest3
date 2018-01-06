package Model;

public class Patient_Nurse {
    private  int id;
    private int inamiNumber;

    public Patient_Nurse() { }

    public Patient_Nurse(int id, int inamiNumber) {
        this.id = id;
        this.inamiNumber = inamiNumber;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getInamiNumber() { return inamiNumber; }
    public void setInamiNumber(int inamiNumber) { this.inamiNumber = inamiNumber; }
}
