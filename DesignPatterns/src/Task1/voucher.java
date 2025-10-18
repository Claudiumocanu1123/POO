package Task1;

public class voucher implements PaymentStrategy {
    public void pay() {
        System.out.println("Am platit cu Voucherul");
    }
    public double getPaymentMethod(Human human) {
        PaymentStrategy method = PaymentFactory.getRandomPaymentMethod();
        Transaction transaction = new Transaction(100,method);
        transaction.procesPayment(human);
        return 100.0;
    }


}
