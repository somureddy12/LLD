package TOMATO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to TOMATO Food Delivery System!");

        Tomato app = new Tomato();

        User user1 = new User("Somu", "Bangalore");
        System.out.println("User created: " + user1.getUserName());

        ArrayList<Restaurent> res = app.getAllRestaurents(user1.getUserLocation());
        System.out.println("Available Restaurents: ");
        for (Restaurent r : res) {
            System.out.println("- " + r.getRestaurentName() + " at " + r.getRestaurentLocation());
        }   

        app.selectrestaurent(user1, res.get(0));
        System.out.println("Selected Restaurent: " + res.get(0).getRestaurentName());

        app.addToCart(user1, 1);
        app.addToCart(user1, 2);
        
        app.printUserCart(user1);
        Order order = app.checkOutNow(user1, "Delivery", new UPIPayment("123456789"));
        app.payForOrder(user1, order);

    }
}
