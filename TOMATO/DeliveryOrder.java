package TOMATO;

import java.util.ArrayList;

public class DeliveryOrder extends Order{

    String userAddress;

    public DeliveryOrder(User user, ArrayList<Menuitem> items, PaymentStrategy paymentStrategy) {
        super(user, items, paymentStrategy);
        this.userAddress = "";
    }

    @Override
    public String getOrderType() {
        
        return "Normal";
    }

    public String getUserAddress(String userAddress) {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
   

 
}
