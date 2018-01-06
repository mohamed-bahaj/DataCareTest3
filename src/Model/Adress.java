package Model;

/**
 * Adress contains informations to define an adress
 */
public class Adress {
    /**
     * Id of an adress, used as a key in a data base
     */
    private int id;
    /**
     * Street of the residence
     */
    private String street;
    /**
     * Number of the residence
     */
    private int number;

    /**
     * Default constructor defines no argument
     */
    private String box;

    private int idVille;

    public Adress(){}

    public Adress(String street, int number, String box, int idVille) {

        //this.id = id;
        this.street = street;
        this.number = number;
        this.box = box;
        this.idVille = idVille;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }



    /**
     * Get adress id
     * @return adress id
     */
    public int getId() { return id; }

    /**
     * Set adress id
     * @param id New adress id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Get adress street
     * @return adress street
     */
    public String getStreet() { return street; }

    /**
     * Set adress street
     * @param street new adress street
     */
    public void setStreet(String street) { this.street = street; }

    /**
     * Get adress number
     * @return adress number
     */
    public int getNumber() { return number; }

    /**
     * Set adress number
     * @param number new adress number
     */
    public void setNumber(int number) { this.number = number; }
}
