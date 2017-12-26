package Model;

public class Certificate {
    private int number;
    private boolean typeCare;
    private int startingDate;
    private int duration;
    private int time;

    public Certificate(){}

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public boolean getTypeCare() { return typeCare; }
    public void setTypeCare(boolean typeCare) { this.typeCare = typeCare; }
    public int getStartingDate() { return startingDate; }
    public void setStartingDate(int startingDate) { this.startingDate = startingDate; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public int getTime() { return time; }
    public void setTime(int time) { this.time = time; }
}
