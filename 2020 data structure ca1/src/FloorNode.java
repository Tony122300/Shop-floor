import java.io.Serializable;

public class FloorNode implements Serializable {
    Floor floor;
    FloorNode nextNode;

    // to put in floorNode by setting the floor
    public FloorNode(Floor floor){
        this.floor=floor;
    }

    // to get the and return user specific floor
    public Floor getFloor() {
        return floor;
    }

    public FloorNode getNextNode() {
        return nextNode;
    }
    // to set the and return user specific floor
    public void setFloor(Floor floor){
        this.floor=floor;
    }

    // to set the nextnode in the floor list
    public void setNextNode(FloorNode nextNode) {
        this.nextNode = nextNode;
    }


    @Override
    public String toString() {
        return "FloorNode{" +
                "floor=" + floor +
                ", nextNode=" + nextNode +
                '}';
    }
}
