package Model;

public class Assistance {
    private int id;
    private boolean toilet;
    private boolean alimentation;
    private boolean medication;
    private boolean preparationMD;
    private boolean eliminations;
    private boolean anatomicProtections;
    private boolean frictions;
    private boolean sticking; // pansement

    public Assistance(){}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public boolean getToilet() { return toilet; }
    public void setToilet(boolean toilet) { this.toilet = toilet; }

    public boolean getAlimentation() { return alimentation; }
    public void setAlimentation(boolean alimentation) { this.alimentation = alimentation; }

    public boolean getMedication() { return medication; }
    public void setMedication(boolean medication) { this.medication = medication; }

    public boolean getPreparationMD() { return preparationMD; }
    public void setPreparationMD(boolean preparationMD) { this.preparationMD = preparationMD; }

    public boolean getEliminations() { return eliminations; }
    public void setEliminations(boolean eliminations) { this.eliminations = eliminations; }

    public boolean getAnatomicProtections() { return anatomicProtections; }
    public void setAnatomicProtections(boolean anatomicProtections) { this.anatomicProtections = anatomicProtections; }

    public boolean getFrictions() { return frictions; }
    public void setFrictions(boolean frictions) { this.frictions = frictions; }

    public boolean getSticking() { return sticking; }
    public void setSticking(boolean sticking) { this.sticking = sticking; }
}
