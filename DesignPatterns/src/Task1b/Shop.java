package Task1b;
import java.util.List;
import java.util.ArrayList;

/// subiect
public class Shop implements TransactionPublisher{

    public void createTransaction(Person person, int amount) {
        boolean success = person.payBy(amount);
        if(success == false)
        {
            System.out.println("Error: Payment failed");
            person.update(person.balance);
        }
        if(success == true && person.balance < 100)
            person.update(person.balance);

    }
}
