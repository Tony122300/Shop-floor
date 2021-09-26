import java.io.Serializable;

public class AsileNode implements Serializable {
    Asile asile;
    AsileNode nextNode;

    public AsileNode(Asile asile){
        this.asile = asile;
    }
    public Asile getAsile() {
        return asile;
    }

    public AsileNode getNextNode() {
        return nextNode;
    }

    public void setAsile(Asile asile) {
        this.asile = asile;
    }

    public void setNextNode(AsileNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "AsileNode{" +
                "asile=" + asile +
                ", nextNode=" + nextNode +
                '}';
    }
}
