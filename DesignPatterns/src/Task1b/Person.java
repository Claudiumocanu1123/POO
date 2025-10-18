package Task1b;
/// observator.
public class Person implements BalanceObserver{
    int balance;
    String name;
    String prename;
   public Person(int balance,String name,String prename) {
       this.balance = balance;
       this.name = name;
       this.prename = prename;
   }
   public String toString()
   {
       return name + " " + prename + " " + "pleaca de aici saracule";
   }
   public void update(int balance) {
       if(balance < 100) {
           System.out.println(name + " " + prename + " ramai fara bani saracule");
       }
   }
   public boolean payBy(int amount) {
       if(balance >= amount) {
           balance = balance - amount;
           return true;
       }
       else
       {
           System.out.println(name +" " + prename + " ramai fara saracule");
           return false;
       }
   }
}
