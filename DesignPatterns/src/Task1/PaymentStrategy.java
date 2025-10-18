package Task1;

public interface PaymentStrategy {
      public void pay();
      public abstract double getPaymentMethod(Human human);
}
