package TOMATO;

import java.util.ArrayList;

public class Cart {
    Restaurent restaurent;
    User user;
    ArrayList<Menuitem> items;
    double totalPrice;

    public Cart() {
        this.restaurent = null;
        this.user = null;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        
    }
    public void addToCart(Menuitem item) {
        this.items.add(item);
        this.totalPrice += item.getItemPrice();
    }
    public void removeFromCart(Menuitem item) {
        if (items.remove(item)) {
            totalPrice -= item.getItemPrice();
        }
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public ArrayList<Menuitem> getItems() {
        return items;   
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
    public void clearCart() {
        items.clear();
        totalPrice = 0.0;
    }

    public Restaurent getRestaurent() {
        return restaurent;
    }
    public void setRestaurent(Restaurent restaurent) {
        this.restaurent = restaurent;
    }
}

