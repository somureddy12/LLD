package TOMATO;

public class UPIPayment implements PaymentStrategy {

    String mobileNumber;

    public UPIPayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI Payment from mobile number: " + mobileNumber);
    
    }
    
}
