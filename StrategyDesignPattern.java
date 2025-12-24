interface PaymentStrategy{
    public void pay();
}
class Googlepay implements PaymentStrategy{
    public void pay(){
        System.out.println("Paying with Google Pay UPI");
    }
}

class Debit implements PaymentStrategy{
    public void pay(){
        System.out.println("Paying with Debit card");
    }
}
class Credit implements PaymentStrategy{
    public void pay(){
        System.out.println("Paying with Credit card");
    }
}

class NoCost implements PaymentStrategy{
    public void pay(){
        System.out.println("Paying with NoCost EMI");
    }
}

class PaymentProcessor{
    private PaymentStrategy strategy;

    PaymentProcessor(PaymentStrategy strategy){
        this.strategy = strategy;
    }
    void ProcessPayments(){
        strategy.pay();
    }

}
public class StrategyDesignPattern {
    public static void main(String args[]){
        PaymentStrategy credit = new Googlepay();

        PaymentProcessor process = new PaymentProcessor(credit);
        process.ProcessPayments();
    }
}
