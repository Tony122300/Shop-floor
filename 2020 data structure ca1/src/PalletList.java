import java.io.Serializable;

public class PalletList implements Serializable {

    public PalletNode head;
    public PalletNode tail;

    public void reset(){
        head = null;
        tail = null;
    }

    // to add palletnode to the palletlist
    public void addPallet(PalletNode palletNode) {
        if(tail == null){
            head = palletNode;
            tail = palletNode;
        }else{
            tail.nextNode = new PalletNode(palletNode.getPallet());
        }
    }



    public void removePallet(int palletID){
        PalletNode temp = head;
        if (temp == null) {
            return;
        }
        if (temp.getPallet().getPalletID() == palletID) {
            head = temp.nextNode;
            System.out.println("remove scucess");
            return;
        }
        while (temp.nextNode != null) {
            if (temp.nextNode.getPallet().getPalletID() == palletID){
                temp.nextNode = temp.nextNode.nextNode;
                System.out.println("remove success");
                return;
            }
            temp = temp.nextNode;
        }
        System.out.println("no found !!");
    }

    public void searchPallet(int palletID){
        PalletNode temp = head;
        if (temp == null) {
            return;
        }
        if (temp.getPallet().getPalletID() == palletID) {
            System.out.println(temp.getPallet().toString());
            return;
        }
        while (temp.nextNode != null) {
            if (temp.nextNode.getPallet().getPalletID() == palletID){
                System.out.println(temp.nextNode.getPallet().toString());
                return;
            }
            temp = temp.nextNode;
        }
    }
}
