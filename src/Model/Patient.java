package Model;


import java.sql.Date;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    private Date birthday;
    private int phoneNumber;
    private boolean typeCare;  // plaies ou diabète
    private String medicalBackGround;
    private String diet;
    private String familySituation;
    private String dependance;
    private int idAdress;

    public Patient(){}

    public Patient(int id, String name, String surname, boolean gender, Date birthday, int phoneNumber, boolean typeCare, String medicalBackGround, String diet, String familySituation, String dependance, int idAdress) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.typeCare = typeCare;
        this.medicalBackGround = medicalBackGround;
        this.diet = diet;
        this.familySituation = familySituation;
        this.dependance = dependance;
        this.idAdress = idAdress;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public Date getBirthday() { return birthday; }
    public void setBirthday(Date birthday) { this.birthday = birthday; }

    public int getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

    public boolean getTypeCare() { return typeCare; }
    public void setTypeCare(boolean typeCare) { this.typeCare = typeCare; }

    public String getMedicalBackGround() { return medicalBackGround; }
    public void setMedicalBackGround(String medicalBackGround) { this.medicalBackGround = medicalBackGround; }

    public String getDiet() { return diet; }
    public void setDiet(String diet) { this.diet = diet; }

    public String getFamilySituation() { return familySituation; }
    public void setFamilySituation(String familySituation) { this.familySituation = familySituation; }

    public String getDependance() { return dependance; }
    public void setDependance(String dependance) { this.dependance = dependance; }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isTypeCare() {
        return typeCare;
    }

    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }
}
