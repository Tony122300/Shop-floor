import java.io.Serializable;

public class Asile implements Serializable {
    private char asileID;
    private int asileDimentions;


    public char getAsileID() {
        return asileID;
    }

    public int getAsileDimentions() {
        return asileDimentions;
    }


    public void setAsileID(char asileID) {
        this.asileID = asileID;
    }

    public void setAsileDimentions(int asileDimentions) {
        this.asileDimentions = asileDimentions;
    }

    public Asile(char asileID, int asileDimentions){
        this.setAsileID(asileID);
        this.setAsileDimentions(asileDimentions);

    }

    @Override
    public String toString() {
        return "Asile{" +
                "asileID=" + asileID +
                ", asileDimentions=" + asileDimentions +
                '}';
    }
}
