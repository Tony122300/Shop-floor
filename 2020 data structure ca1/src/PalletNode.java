import java.io.Serializable;

public class PalletNode implements Serializable {
    Pallet pallet;
    PalletNode nextNode;

    public PalletNode(Pallet pallet){
        this.pallet=pallet;
    }

    public Pallet getPallet() {
        return pallet;
    }

    public PalletNode getNextNode() {
        return nextNode;
    }

    public void setPallet(Pallet pallet) {
        this.pallet = pallet;
    }

    public void setNextNode(PalletNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "PalletNode{" +
                "pallet=" + pallet +
                ", nextNode=" + nextNode +
                '}';
    }
}
