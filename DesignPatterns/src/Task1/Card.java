package Task1;

public class Card implements PaymentStrategy {
    public void pay() {
        System.out.println("Am platit folosind cardul");

    }
    public double getPaymentMethod(Human human) {
        PaymentStrategy method = PaymentFactory.getRandomPaymentMethod();
        Transaction transaction = new Transaction(100,method);
        transaction.procesPayment(human);
        return 100.0;
    }

}
