package Model;

public class Patient_Allergy {
    private int id;
    private String allergy;

    public Patient_Allergy() { }

    public Patient_Allergy(int id, String allergy) {
        this.id = id;
        this.allergy = allergy;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAllergy() { return allergy; }

    public void setAllergy(String allergy) { this.allergy = allergy; }
}
