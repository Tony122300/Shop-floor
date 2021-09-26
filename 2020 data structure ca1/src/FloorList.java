import java.io.Serializable;

public class FloorList implements Serializable {

    public FloorNode head;
    public FloorNode tail;

    public void reset(){
        head = null;
        tail = null;
    }

    public void addFloor(FloorNode floorNode){
        if(tail == null){
            head = floorNode;
            tail = floorNode;
        }else{
            tail.nextNode = new FloorNode(floorNode.getFloor());
        }
    }


    public void removeFloor( int floorLvl){
        FloorNode temp = head;
        if (temp == null) {
            return;
        }
        if (temp.getFloor().getFloorLvl() == floorLvl) {
            head = temp.nextNode;
            System.out.println("remove scucess");
            return;
        }
        while (temp.nextNode != null) {
            if (temp.nextNode.getFloor().getFloorLvl() == floorLvl){
                temp.nextNode = temp.nextNode.nextNode;
                System.out.println("remove scucess");
                return;
            }
            temp = temp.nextNode;
        }
        System.out.println("no found !!");
    }

    public void searchFloor(int floorLvl){
        FloorNode temp = head;
        if (temp == null) {
            return;
        }
        if (temp.getFloor().getFloorLvl() == floorLvl) {
            System.out.println(temp.getFloor().toString());
            return;
        }
        while (temp.nextNode != null) {
            if (temp.nextNode.getFloor().getFloorLvl() == floorLvl){
                System.out.println(temp.nextNode.getFloor().toString());
                return;
            }
            temp = temp.nextNode;
        }
    }
}
