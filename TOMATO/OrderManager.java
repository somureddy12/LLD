package TOMATO;

import java.util.ArrayList;

public class OrderManager {
    private static OrderManager instance = null;
    ArrayList<Order> orders = new ArrayList<Order>();

    private OrderManager() {}
    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }
    public String addOrder(Order o) {
        orders.add(o);
        return "Order added successfully.";
    }
    public String removeOrder(Order o) {
        orders.remove(o);
        return "Order removed successfully.";
    }
    public ArrayList<Order> getOrders() {
        return orders;
    }
    

}
