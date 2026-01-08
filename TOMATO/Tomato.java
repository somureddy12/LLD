package TOMATO;

import java.util.ArrayList;

public class Tomato {
    public Tomato() {
        System.out.println("Welcome to TOMATO Food Delivery Service!");
        initializeSystem();
    }

    private void initializeSystem() {
        Restaurent restaurent1 = new Restaurent("Pasta Palace", "Bangalore");
        restaurent1.addMenuItem(new Menuitem("Dosa", 30.0));
        restaurent1.addMenuItem(new Menuitem("Idli", 20.0));
        restaurent1.addMenuItem(new Menuitem("Vada", 25.0));

        Restaurent restaurent2 = new Restaurent("Curry Corner", "456 Elm St");
        restaurent2.addMenuItem(new Menuitem("Chicken Curry", 150.0));
        restaurent2.addMenuItem(new Menuitem("Paneer Butter Masala", 120.0));
        restaurent2.addMenuItem(new Menuitem("Naan", 15.0));
        Restaurent restaurent3 = new Restaurent("Sushi Central", "789 Oak St");
        restaurent3.addMenuItem(new Menuitem("California Roll", 200.0));
        restaurent3.addMenuItem(new Menuitem("Spicy Tuna Roll", 220.0));
        restaurent3.addMenuItem(new Menuitem("Miso Soup", 80.0));

        RestaurentManager restaurentManager = RestaurentManager.getInstance();
        restaurentManager.addRestaurent(restaurent1);
        restaurentManager.addRestaurent(restaurent2);
        restaurentManager.addRestaurent(restaurent3);

        System.out.println("System initialized with sample restaurants and menu items.");
    }

    public ArrayList<Restaurent> getAllRestaurents(String location) {

        return RestaurentManager.getInstance().searchByLocation(location);
    }

    public void selectrestaurent(User user, Restaurent restaurent) {
        Cart cart = user.getCart();
        cart.setRestaurent(restaurent);
    }
    public void addToCart(User user, int itemCode){
        Restaurent restaurent = user.getCart().getRestaurent();
        if(restaurent == null){

            System.out.println("Please select a restaurant first.");
            return;
        }
        for(Menuitem item : restaurent.getMenuItems()){
            if(item.getItemID()== itemCode){
                user.getCart().addToCart(item);
                System.out.println(item.getItemName() + " added to cart.");
                return;
            }
        }

    }
    public Order checkOutNow(User user, String orderType, PaymentStrategy paymentStrategy) {
        return checkOut(user, orderType, paymentStrategy, new NormalOrder());
    }
    
    private Order checkOut(User user, String orderType, PaymentStrategy paymentStrategy, OrderFactory factory) {
        
        if(user.getCart().isEmpty()) {
            System.out.println("Cart is empty. Please add items to cart before checkout.");
            return null;
        }
        Cart cart = user.getCart();
        ArrayList<Menuitem> items = cart.getItems();
        double totalAmount = cart.getTotalPrice();
        Restaurent res = cart.getRestaurent();

        Order order = factory.createOrder(user, res, cart, paymentStrategy, items, totalAmount, orderType);
        OrderManager.getInstance().addOrder(order);
        return order;
    }
    void payForOrder(User user,Order order) {
        order.processPayment();
        NotificationService.notify(order);
        user.getCart().clearCart();
    }

    public void printUserCart(User user) {
        Cart cart = user.getCart();
        System.out.println("Cart Items for " + user.getUserName() + ":");
        for (Menuitem item : cart.getItems()) {
            System.out.println("- " + item.getItemName() + ": $" + item.getItemPrice());
        }
        System.out.println("Total Price: $" + cart.getTotalPrice());
    }
}
