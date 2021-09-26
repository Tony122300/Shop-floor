import java.util.Scanner;

public class MenuSystem {

    private Scanner input = new Scanner(System.in);
    public static FloorList floorList = new FloorList();
    public static AsileList asileList = new AsileList();
    public static ShelfList shelfList = new ShelfList();
    public static PalletList palletList = new PalletList();

    public static void main(String args[]) {
        load();
        MenuSystem app = new MenuSystem();
        app.runMenu();
    }

    private int mainMenu() {
        System.out.println("WareHouse Menu");
        System.out.println("---------");
        System.out.println("  1) Add Floor");
        System.out.println("  2) Add Asile");
        System.out.println("  3) Add Shelf");
        System.out.println("  4) Add Pallet");
        System.out.println("  --------------------");
        System.out.println("  5) List all Floors");
        System.out.println("  6) List all Asiles");
        System.out.println("  7) List all Shelves");
        System.out.println("  8) List all Pallets");
        System.out.println("  --------------------");
        System.out.println("  9) Smart add");
        System.out.println("  --------------------");
        System.out.println("  10) Search Floor");
        System.out.println("  11) View all");
        System.out.println("  --------------------");

        System.out.println("  12) Remove Floor");
        System.out.println("  13) Remove Asile");
        System.out.println("  14) Remove Shelf");
        System.out.println("  15) Remove Pallet");
        System.out.println("  16) Rest all");
        System.out.println("  --------------------");
        System.out.println("  17) Save");
        System.out.println("  18) Load");

        System.out.println("  --------------------");
        System.out.println(" 0) Exit");
        System.out.print("==>> ");
        int option = input.nextInt();
        return option;
    }

    private void runMenu() {
        int option = mainMenu();
        while (option != 0) {

            switch (option) {
                case 1:
                    addFloor();
                    break;
                case 2:
                    addAsile();
                    break;
                case 3:
                    addShelf();
                    break;
                case 4:
                    addPallet();
                    break;
                case 5:
                    listFloors();
                    break;
                case 6:
                    listAsiles();
                    break;
                case 7:
                    listShelves();
                    break;
                case 8:
                    listPallets();
                    break;
                case 9:
                    smartAdd();
                    break;
                case 10:
                    searchFloor();
                    break;
                case 11:
                    //   viewAll();
                    break;
                case 12:
                    removeFloor();
                    break;
                case 13:
                    removeAsiles();
                    break;
                case 14:
                    removeShelf();
                    break;
                case 15:
                    removePallet();
                    break;
                case 16:
                    reset();
                    break;
                case 17:
                    save();
                    break;
                case 18:
                    //load//
                    break;
                default:
                    System.out.println("Invalid option entered: " + option);
                    break;

            }
            System.out.println("\nPress continue");
            input.nextLine();
            option = mainMenu();
        }
        System.out.println("Exiting");
        System.exit(0);
    }

    private Floor addFloor() {
        System.out.println("Enter Floor Level");
        int floorLvl = input.nextInt();
        input.nextLine();
        System.out.println("Enter Floor Security Level (Low, Medium, High)");
        String securityLvl = input.nextLine();
        System.out.println("Enter Floor Temperature (0-20)");
        int floorTemp = input.nextInt();
        input.nextLine();
        Floor floor = new Floor(floorLvl, securityLvl, floorTemp);
        FloorNode floorNode = new FloorNode(floor);
        floorList.addFloor(floorNode);
        return floor;
    }

    private Asile addAsile() {
        System.out.println("Enter Asile ID");
        char asileID = (char) input.nextInt();
        input.nextLine();
        System.out.println("Enter asile dimentions");
        char asileDimentions = (char) input.nextInt();
        input.nextLine();
        Asile asile = new Asile(asileID, asileDimentions);
        AsileNode asileNode = new AsileNode(asile);
        asileList.addAisle(asileNode);
        return asile;
    }


    private Shelf addShelf() {
        System.out.println("Enter Shelf number");
        int shelfNum = input.nextInt();
        input.nextLine();
        Shelf shelf = new Shelf(shelfNum);
        ShelfNode shelfNode = new ShelfNode(shelf);
        shelfList.addShelf(shelfNode);
        return shelf;
    }

    private Pallet addPallet() {
        System.out.println("Enter item name");
        String itemName = input.nextLine();
        input.nextLine();
        System.out.println("Enter item description");
        String itemDescription = input.nextLine();
        System.out.println("Enter PalletID");
        int palletID = input.nextInt();
        input.nextLine();
        System.out.println("Enter the amount in kg");
        int amount = input.nextInt();
        input.nextLine();
        System.out.println("Enter the StorageTemp");
        int storageTemp = input.nextInt();
        input.nextLine();
        Pallet pallet = new Pallet(itemName, itemDescription, palletID, amount, storageTemp);
        PalletNode palletNode = new PalletNode(pallet);
        palletList.addPallet(palletNode);
        return pallet;
    }


    private void listFloors() {
        int count = 1;
        if (floorList.head != null) {
            FloorNode temp = floorList.head;
            while (temp != null) {
                System.out.println("Floor" + count + "\n" + temp.getFloor().toString());
                temp = temp.getNextNode();
                count++;
            }
            input.nextLine();
        } else {
            floorList.head = null;
            System.out.println("No floors in list");
        }
    }

    private void listAsiles() {
        int count = 1;
        if (asileList.head != null) {
            AsileNode temp = asileList.head;
            while (temp != null) {
                System.out.println("Asile" + count + "\n" + temp.getAsile().toString());
                temp = temp.getNextNode();
                count++;
            }
            input.nextLine();
        } else {
            asileList.head = null;
            System.out.println("No Asiles in list");
        }
    }

    private void listShelves() {
        int count = 1;
        if (shelfList.head != null) {
            ShelfNode temp = shelfList.head;
            while (temp != null) {
                System.out.println("Shelf" + count + "\n" + temp.getShelf().toString());
                temp = temp.getNextNode();
            }
            input.nextLine();
        } else {
            shelfList.head = null;
            System.out.println("No shelf in list");
        }
    }

    private void listPallets() {
        int count = 1;
        if (palletList.head != null) {
            PalletNode temp = palletList.head;
            while (temp != null) {
                System.out.println("Pallet" + count + "\n" + temp.getPallet().toString());
            }
            input.nextLine();
        } else {
            palletList.head = null;
            System.out.println("No pallet in list");
        }
    }

    private void smartAdd() {
    }
/*
    private void removeFloor() {
        System.out.println("Enter floor number");
        int floorLvl;
        floorLvl = input.nextInt();
        input.nextLine();

        }
    }

 */

    private void removeFloor() {
        System.out.println("Input the Remove Floor floorLvl");
        int floorLvl = input.nextInt();
        floorList.removeFloor(floorLvl);
    }
    private void removeAsiles() {
        System.out.println("Input the Remove Asile asileID");
        char asileID = (char) input.nextInt();
        asileList.removeAsile(asileID);
    }

    private void removeShelf() {
        System.out.println("Input the Remove Shelf shelfNum");
        int shelfNum = input.nextInt();
        shelfList.removeShelf(shelfNum);
    }

    private void removePallet() {
        System.out.println("Input the Remove Pallet palletID");
        int palletID = input.nextInt();
        palletList.removePallet(palletID);
    }
    private void searchFloor() {
        System.out.println("Input the Search Floor floorLvl");
        int floorLvl = input.nextInt();
        floorList.searchFloor(floorLvl);
        input.nextLine();
    }
    private void  save() {
        FileUtil.saveObjectByObjectOutput(floorList,"F://floorList.txt");
        FileUtil.saveObjectByObjectOutput(asileList,"F://asileList.txt");
        FileUtil.saveObjectByObjectOutput(shelfList,"F://shelfList.txt");
        FileUtil.saveObjectByObjectOutput(palletList,"F://palletList.txt");

    }
    private static void  load() {
        floorList = (FloorList) FileUtil.getObjectByObjectInput("F://floorList.txt");
        asileList = (AsileList) FileUtil.getObjectByObjectInput("F://asileList.txt");
        shelfList = (ShelfList) FileUtil.getObjectByObjectInput("F://shelfList.txt");
        palletList = (PalletList) FileUtil.getObjectByObjectInput("F://palletList.txt");
        if (floorList == null) {
            floorList = new FloorList();
        }
        if (asileList == null) {
            asileList = new AsileList();
        }
        if (shelfList == null) {
            shelfList = new ShelfList();
        }
        if (palletList == null) {
            palletList = new PalletList();
        }
    }
    private void reset(){
        asileList.reset();
        floorList.reset();
        palletList.reset();
        shelfList.reset();
    }
}
