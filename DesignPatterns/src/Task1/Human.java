package Task1;

public class Human {
    private PaymentStrategy paymentStrategy;
    public Human(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay() {
        paymentStrategy.pay();
    }
}
