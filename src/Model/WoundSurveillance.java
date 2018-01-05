package Model;

public class WoundSurveillance {
    private int id;
    private String site;
    private String type;
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

    public WoundSurveillance(int id, String site, String type, boolean rougeur, boolean fibrine, boolean necrose, boolean exsudats, boolean pus, boolean odeurs, boolean inflammation, boolean macerees, boolean oedematiees, boolean bourgeons, boolean epidermistion, int evnScore, String comment) {
        this.id = id;
        this.site = site;
        this.type = type;
        this.rougeur = rougeur;
        this.fibrine = fibrine;
        this.necrose = necrose;
        this.exsudats = exsudats;
        this.pus = pus;
        this.odeurs = odeurs;
        this.inflammation = inflammation;
        this.macerees = macerees;
        this.oedematiees = oedematiees;
        this.bourgeons = bourgeons;
        this.epidermistion = epidermistion;
        this.evnScore = evnScore;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getRougeur() {
        return rougeur;
    }

    public void setRougeur(boolean rougeur) {
        this.rougeur = rougeur;
    }

    public boolean getFibrine() {
        return fibrine;
    }

    public void setFibrine(boolean fibrine) {
        this.fibrine = fibrine;
    }

    public boolean getNecrose() {
        return necrose;
    }

    public void setNecrose(boolean necrose) {
        this.necrose = necrose;
    }

    public boolean getExsudats() {
        return exsudats;
    }

    public void setExsudats(boolean exsudats) {
        this.exsudats = exsudats;
    }

    public boolean getPus() {
        return pus;
    }

    public void setPus(boolean pus) {
        this.pus = pus;
    }

    public boolean getOdeurs() {
        return odeurs;
    }

    public void setOdeurs(boolean odeurs) {
        this.odeurs = odeurs;
    }

    public boolean getInflammation() {
        return inflammation;
    }

    public void setInflammation(boolean inflammation) {
        this.inflammation = inflammation;
    }

    public boolean getMacerees() {
        return macerees;
    }

    public void setMacerees(boolean macerees) {
        this.macerees = macerees;
    }

    public boolean getOedematiees() {
        return oedematiees;
    }

    public void setOedematiees(boolean oedematiees) {
        this.oedematiees = oedematiees;
    }

    public boolean getBourgeons() {
        return bourgeons;
    }

    public void setBourgeons(boolean bourgeons) {
        this.bourgeons = bourgeons;
    }

    public boolean getEpidermistion() {
        return epidermistion;
    }

    public void setEpidermistion(boolean epidermistion) {
        this.epidermistion = epidermistion;
    }

    public int getEvnScore() {
        return evnScore;
    }

    public void setEvnScore(int evnScore) {
        this.evnScore = evnScore;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
