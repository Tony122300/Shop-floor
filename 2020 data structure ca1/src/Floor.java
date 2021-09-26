import java.io.Serializable;

public class Floor implements Serializable {

    private int floorLvl;
    private String securityLvl;
    private int floorTemp;
    private AsileList asileList = new AsileList();
    private ShelfList shelfList = new ShelfList();
    private PalletList palletList = new PalletList();

    public Floor(int floorLvl, String securityLvl, int floorTemp){
        this.setFloorLvl(floorLvl);
        this.setSecurityLvl(securityLvl);
        this.setFloorTemp(floorTemp);
        this.setAsileList(asileList);
        this.setShelfList(shelfList);
        this.setPalletList(palletList);
    }

    public int getFloorLvl() {
        return floorLvl;
    }

    public String getSecurityLvl() {
        return securityLvl;
    }

    public int getFloorTemp() {
        return floorTemp;
    }

    public AsileList getAsileList() {
        return asileList;
    }

    public ShelfList getShelfList() {
        return shelfList;
    }

    public PalletList getPalletList() {
        return palletList;
    }

    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }

    public void setSecurityLvl(String securityLvl) {
        if((securityLvl.equals("Low")) || (securityLvl.equals("low"))) {
            this.securityLvl = "Low";
        }else if((securityLvl.equals("Medium")) || (securityLvl.equals("medium"))){
            this.securityLvl = "Medium";
        }else if ((securityLvl.equals("High")) || (securityLvl.equals("high"))){
            this.securityLvl = "High";
        }
    }

    public void setFloorTemp(int floorTemp) {
        int maxFloorTemp = 20;
        int minFloorTemp = 0;
        if(floorTemp >=20){
            this.floorTemp = maxFloorTemp;
        }else if (floorTemp <= minFloorTemp){
            this.floorTemp = minFloorTemp;
        }
    }

    public void setAsileList(AsileList asileList) {
        this.asileList = asileList;
    }

    public void setShelfList(ShelfList shelfList) {
        this.shelfList = shelfList;
    }

    public void setPalletList(PalletList palletList) {
        this.palletList = palletList;
    }

    public void addAsiles(Asile asile){
        AsileNode asileNode = new AsileNode(asile);
        asileList.addAisle(asileNode);
    }


    @Override
    public String toString() {
        return "Floor{" +
                "floorLvl=" + floorLvl +
                ", securityLvl='" + securityLvl + '\'' +
                ", floorTemp=" + floorTemp +
                '}';
    }
}
