package TOMATO;

public class Menuitem {
    private static int nextItemID = 1;
    int itemID;
    String itemName;
    double itemPrice;

    public Menuitem(String name, double price) {
        this.itemID = nextItemID++;
        this.itemName = name;
        this.itemPrice = price;
    }
    public int getItemID() {
        return itemID;
    }
    public String getItemName() {
        return itemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemName(String name) {
        this.itemName = name;
    }
    public void setItemPrice(double price) {
        this.itemPrice = price;
    }
    public String toString() {
        return "Menuitem [ID=" + itemID + ", Name=" + itemName + ", Price=" + itemPrice + "]";
    }

}
