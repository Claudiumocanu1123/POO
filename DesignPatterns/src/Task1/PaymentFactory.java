package Task1;


import java.util.Random;

public class PaymentFactory {
    public static PaymentStrategy getRandomPaymentMethod() {
        Random random = new Random();
        int choice = random.nextInt(3); // 0, 1, 2

        switch (choice) {
            case 0: return new Card();
            case 1: return new Iban();
            case 2: return new voucher();
            default: return new Card();
        }
    }
}
