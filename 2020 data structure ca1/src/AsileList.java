import java.io.Serializable;

public class AsileList implements Serializable {
    AsileNode head;
    AsileNode tail;

    public void reset(){
        head = null;
        tail = null;
    }

    // to add asileNode to the AisleList
    public void addAisle(AsileNode asileNode) {
        if(tail == null){
            head = asileNode;
            tail = asileNode;
        }else{
            tail.nextNode = new AsileNode(asileNode.getAsile());
        }
    }

    public void removeAsile(char asileID){
        AsileNode temp = head;
        if (temp == null) {
            return;
        }
        if (temp.getAsile().getAsileID() == asileID) {
            head = temp.nextNode;
            System.out.println("remove scucess");
            return;
        }
        while (temp.nextNode != null) {
            if (temp.nextNode.getAsile().getAsileID() == asileID){
                temp.nextNode = temp.nextNode.nextNode;
                System.out.println("remove scucess");
                return;
            }
            temp = temp.nextNode;
        }
        System.out.println("no found !!");
    }

    public void searchAsile(char asileID){
        AsileNode temp = head;
        if (temp == null) {
            return;
        }
        if (temp.getAsile().getAsileID() == asileID) {
            System.out.println(temp.getAsile().toString());
            return;
        }
        while (temp.nextNode != null) {
            if (temp.nextNode.getAsile().getAsileID() == asileID){
                System.out.println(temp.nextNode.getAsile().toString());
                return;
            }
            temp = temp.nextNode;
        }
    }
}
