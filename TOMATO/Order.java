package TOMATO;

import java.util.ArrayList;

public abstract class Order {
    static int nextOrderID = 1;
    private int orderID;
    private User user;
    private Restaurent restaurent;
    private ArrayList<Menuitem> orderedItems;
    private double totalAmount;

    private PaymentStrategy paymentStrategy;
    private String schedule;

    public Order(User user, ArrayList<Menuitem> items, PaymentStrategy paymentStrategy) {
        this.orderID = nextOrderID++;
        this.user = user;
        this.orderedItems = items;
        this.paymentStrategy = paymentStrategy;
        this.totalAmount = calculateTotalAmount();
    }
    private double calculateTotalAmount() {
        double total = 0.0;
        for (Menuitem item : orderedItems) {
            total += item.getItemPrice();
        }
        return total;
    }
    public abstract String getOrderType();

    public int getOrderID() {
        return orderID;
    }
    public User getUser() {
        return user;
    }
    public ArrayList<Menuitem> getOrderedItems() {
        return orderedItems;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment() {
        paymentStrategy.pay(totalAmount);
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }
    public void setOrderedItems(ArrayList<Menuitem> orderedItems) {
        this.orderedItems = orderedItems;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String getSchedule() {
        return schedule;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Restaurent getRestaurent() {
        return restaurent;
    }
    public void setRestaurent(Restaurent restaurent) {
        this.restaurent = restaurent;
    }
    public String toString() {
        return "Order [ID=" + orderID + ", User=" + user.getUserName() + ", Total Amount=" + totalAmount + "]";
    }   
}
