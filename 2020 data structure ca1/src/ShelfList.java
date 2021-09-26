import java.io.Serializable;

public class ShelfList implements Serializable {
    ShelfNode head;
    ShelfNode tail;

    // to add shelfnode to the shelf
    public void addShelf(ShelfNode shelfNode) {
        if(tail == null){
            head = shelfNode;
            tail = shelfNode;
        }else{
            tail.nextNode = new ShelfNode(shelfNode.getShelf());
        }
    }

    public void removeShelf(int shelfNum){
        ShelfNode temp = head;
        if (temp == null) {
            return;
        }
        if (temp.getShelf().getShelfNum() == shelfNum) {
            head = temp.nextNode;
            System.out.println("remove scucess");
            return;
        }
        while (temp.nextNode != null) {
            if (temp.nextNode.getShelf().getShelfNum() == shelfNum){
                temp.nextNode = temp.nextNode.nextNode;
                System.out.println("remove scucess");
                return;
            }
            temp = temp.nextNode;
        }
        System.out.println("no found !!");
    }

    public void searchShelf(int shelfNum){
        ShelfNode temp = head;
        if (temp == null) {
            return;
        }
        if (temp.getShelf().getShelfNum() == shelfNum) {
            System.out.println(temp.getShelf().toString());
            return;
        }
        while (temp.nextNode != null) {
            if (temp.nextNode.getShelf().getShelfNum() == shelfNum){
                System.out.println(temp.nextNode.getShelf().toString());
                return;
            }
            temp = temp.nextNode;
        }
    }
    public void reset(){
        head = null;
        tail = null;
    }

}
