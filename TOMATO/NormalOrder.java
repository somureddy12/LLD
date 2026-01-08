package TOMATO;

import java.util.ArrayList;

public class NormalOrder implements OrderFactory {

    @Override
    public Order createOrder(User user, Restaurent res, Cart cart, PaymentStrategy paymentStrategy,ArrayList<Menuitem> items, double totalAmount, String orderType) {
        Order order = null;

        if(orderType.equalsIgnoreCase("Delivery")){
            DeliveryOrder DeliveryOrder = new DeliveryOrder( user, items, paymentStrategy);
            DeliveryOrder.setUserAddress(user.getUserLocation());
            order = DeliveryOrder;
        }else{
            PickUpOrder pickUpOrder = new PickUpOrder( user, items, paymentStrategy);
            pickUpOrder.setRestaurentAddress(cart.getRestaurent().getRestaurentLocation());
            order = pickUpOrder;
        }
        order.setUser(user);
        order.setOrderedItems(items);
        order.setTotalAmount(totalAmount);
        order.setPaymentStrategy(paymentStrategy);
        // order.setSchedule(cart.getSchedule());
        order.setRestaurent(res);
        return order;
    }

    
    
}
