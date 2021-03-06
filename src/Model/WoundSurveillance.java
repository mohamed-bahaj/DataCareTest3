package Model;

public class WoundSurveillance {
    private int id;
    private boolean rougeur;
    private boolean fibrine;
    private boolean necrose;
    private boolean exsudats;
    private boolean pus;
    private boolean odeurs;
    private boolean inflammation;
    private boolean macerees;
    private boolean oedematiees;
    private boolean bourgeons;
    private boolean epidermistion;
    private int evnScore;
    private String comment;

    public WoundSurveillance(){}

    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }

    public boolean getRougeur() { return rougeur; }
    public void setRougeur(boolean rougeur) { this.rougeur = rougeur; }

    public boolean getFibrine() { return fibrine; }
    public void setFibrine(boolean fibrine) { this.fibrine = fibrine; }

    public boolean getNecrose() { return necrose; }
    public void setNecrose(boolean necrose) { this.necrose = necrose; }

    public boolean getExsudats() { return exsudats; }
    public void setExsudats(boolean exsudats) { this.exsudats = exsudats; }

    public boolean getPus() { return pus; }
    public void setPus(boolean pus) { this.pus = pus; }

    public boolean getOdeurs() { return odeurs; }
    public void setOdeurs(boolean odeurs) { this.odeurs = odeurs; }

    public boolean getInflammation() { return inflammation; }
    public void setInflammation(boolean inflammation) { this.inflammation = inflammation; }

    public boolean getMacerees() { return macerees; }
    public void setMacerees(boolean macerees) { this.macerees = macerees; }

    public boolean getOedematiees() { return oedematiees; }
    public void setOedematiees(boolean oedematiees) { this.oedematiees = oedematiees; }

    public boolean getBourgeons() { return bourgeons; }
    public void setBourgeons(boolean bourgeons) { this.bourgeons = bourgeons; }

    public boolean getEpidermistion() { return epidermistion; }
    public void setEpidermistion(boolean epidermistion) { this.epidermistion = epidermistion; }

    public int getEvnScore() { return evnScore; }
    public void setEvnScore(int evnScore) { this.evnScore = evnScore; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
}
