package TOMATO;

public class NotificationService {
    public static void notify(Order order){
        System.out.println("Notification sent for Order ID: " + order.getOrderID() + " of type: " + order.getOrderType());
        System.out.println("User: " + order.getUser().getUserName());
        System.out.println("Total Amount: " + order.getTotalAmount());
        System.out.println("Thank you for using TOMATO!");
        System.out.println("-----------------------------------");
    
        
    }
}
