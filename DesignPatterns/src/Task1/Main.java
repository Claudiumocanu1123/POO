package Task1;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(new voucher());
        human.pay();
        human.setStrategy((new Iban()));
        human.pay();
        human.setStrategy((new Card()));
        human.pay();
        new voucher().getPaymentMethod(human);
    }
}
