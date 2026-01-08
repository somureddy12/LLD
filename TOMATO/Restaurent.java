package TOMATO;

import java.util.ArrayList;

public class Restaurent {
    static int nextRestaurentID = 1;
    private int restaurentID;
    private String restaurentName;
    private String restaurentLocation;
    private ArrayList<Menuitem> menuItems;

    public Restaurent(String name, String location) {
        this.restaurentID = nextRestaurentID++;
        this.restaurentName = name;
        this.restaurentLocation = location;
        this.menuItems = new ArrayList<Menuitem>();
    }

    public int getRestaurentID() {
        return restaurentID;
    }
    public String getRestaurentName() {
        return restaurentName;
    }
    public String getRestaurentLocation() {
        return restaurentLocation;
    }
    public ArrayList<Menuitem> getMenuItems() {
        return menuItems;
    }
    public void addMenuItem(Menuitem item) {
        menuItems.add(item);
    }
    public void removeMenuItem(Menuitem item) {
        menuItems.remove(item);
    }
    

}
