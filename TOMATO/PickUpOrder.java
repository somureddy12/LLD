package TOMATO;

import java.util.ArrayList;

public class PickUpOrder extends Order{

    String restaurentAddress;
    public PickUpOrder(User user,  ArrayList<Menuitem> items, PaymentStrategy paymentStrategy) {
        super(user, items, paymentStrategy);
        this.restaurentAddress = "";
    }
    @Override
    public String getOrderType() {
        return "PickUp";
    }

    public void setRestaurentAddress(String restaurentAddress) {
        this.restaurentAddress = restaurentAddress;
    }
    public String getRestaurentAddress() {
        return restaurentAddress;
    }
}
