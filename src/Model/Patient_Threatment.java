package Model;

public class Patient_Threatment {
    private int id;
    private String drug;

    public Patient_Threatment() { }

    public Patient_Threatment(int id, String drug) {
        this.id = id;
        this.drug = drug;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDrug() { return drug; }
    public void setDrug(String drug) { this.drug = drug; }
}
