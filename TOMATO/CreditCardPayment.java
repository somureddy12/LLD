package TOMATO;

public class CreditCardPayment implements PaymentStrategy {
    String cardNumber;
    String cardHolderName;
    String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
    
}
