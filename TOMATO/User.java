package TOMATO;

public class User {
    public static int nextUserID = 1;
    String userId;
    String userName;
    String userLocation;
    Cart cart;

    public User(String name, String location) {
        this.userId = "U" + nextUserID++;
        this.userName = name;
        this.userLocation = location;
        this.cart = new Cart();
    }
    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserLocation() {
        return userLocation;
    }
    public void setUserName(String name) {
        this.userName = name;
    }
    public void setUserLocation(String location) {
        this.userLocation = location;
    }
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}

