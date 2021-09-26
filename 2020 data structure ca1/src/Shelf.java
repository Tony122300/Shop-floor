import java.io.Serializable;

public class Shelf implements Serializable {
    private int shelfNum;
    private PalletList palletList;

    public Shelf(int shelfNum){
        this.setShelfNum(shelfNum);
    }
    public int getShelfNum() {
        return shelfNum;
    }

    public PalletList getPalletList() {
        return palletList;
    }

    public void setShelfNum(int shelfNum) {
        this.shelfNum = shelfNum;
    }

    public void setPalletList(PalletList palletList) {
        this.palletList = palletList;
    }


    public void addPallet(Pallet pallet){
        PalletNode palletNode = new PalletNode(pallet);
        palletList.addPallet(palletNode);
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "shelfNum=" + shelfNum +
                ", palletList=" + palletList +
                '}';
    }
}
