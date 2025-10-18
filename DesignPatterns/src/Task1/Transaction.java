package Task1;

public class Transaction {
    private double amount;
    private PaymentStrategy paymentStrategy;

    public Transaction(double amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }
    public void procesPayment(Human human) {
        System.out.println("Clientul efectueaza o plata de: " + amount);
        paymentStrategy.pay();
    }
}
