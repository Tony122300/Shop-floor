import java.io.Serializable;

public class Pallet implements Serializable {
    private String itemName;
    private String itemDescription;
    private int palletID;
    private int amount;
    private int storageTemp;


    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getStorageTemp() {
        return storageTemp;
    }

    public int getPalletID() {
        return palletID;
    }

    public int getAmount() {
        return amount;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        int maxLength = 20;
        if(itemDescription.length() >= maxLength){
            itemDescription = itemDescription.substring(0,maxLength);
        }
        this.itemDescription = itemDescription;
    }

    public void setStorageTemp(int storageTemp) {
        this.storageTemp = storageTemp;
    }

    public void setPalletID(int palletID) {
        this.palletID = palletID;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Pallet(String itemName, String itemDescription, int palletID, int amount , int storageTemp) {
        this.setItemName(itemName);
        this.setItemDescription(itemDescription);
        this.setPalletID(palletID);
        this.setAmount(amount);
        this.setStorageTemp(storageTemp);
    }

    @Override
    public String toString() {
        return "Pallet{" +
                "itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", palletID=" + palletID +
                ", amount=" + amount +
                ", storageTemp=" + storageTemp +
                '}';
    }
}
