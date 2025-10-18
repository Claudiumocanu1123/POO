package Task1;

public class Iban implements PaymentStrategy {
    public void pay() {
        System.out.println("Am platit folosind Ibanul");
    }
    public double getPaymentMethod(Human human) {
        PaymentStrategy method = PaymentFactory.getRandomPaymentMethod();
        Transaction transaction = new Transaction(100,method);
        transaction.procesPayment(human);
        return 100.0;
    }

}
