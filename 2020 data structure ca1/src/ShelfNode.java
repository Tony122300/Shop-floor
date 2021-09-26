import java.io.Serializable;

public class ShelfNode implements Serializable {
    Shelf shelf;
    ShelfNode nextNode;

    public ShelfNode(Shelf shelf){
        this.shelf=shelf;
    }

    public Shelf getShelf(){
        return shelf;
    }

    public ShelfNode getNextNode() {
        return nextNode;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public void setNextNode(ShelfNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "ShelfNode{" +
                "shelf=" + shelf +
                ", nextNode=" + nextNode +
                '}';
    }
}
