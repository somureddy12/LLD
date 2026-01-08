package TOMATO;

import java.util.ArrayList;

public interface OrderFactory {

  Order createOrder(User user, Restaurent res, Cart cart, PaymentStrategy paymentStrategy,ArrayList<Menuitem> items, double totalAmount, String orderType);
} 
