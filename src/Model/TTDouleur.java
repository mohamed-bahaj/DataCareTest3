package Model;

public class TTDouleur {
    private int id;
    private boolean pousseSeringue;
    private int ecartPatch;
    private boolean sc;
    private boolean im;

    public TTDouleur(){}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public boolean getPousseSeringue() { return pousseSeringue; }
    public void setPousseSeringue(boolean pousseSeringue) { this.pousseSeringue = pousseSeringue; }

    public int getEcartPatch() { return ecartPatch; }
    public void setEcartPatch(int ecartPatch) { this.ecartPatch = ecartPatch; }

    public boolean getSc() { return sc; }
    public void setSc(boolean sc) { this.sc = sc; }

    public boolean getIm() { return im; }
    public void setIm(boolean im) { this.im = im; }
}
