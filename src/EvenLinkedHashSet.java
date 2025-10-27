import java.util.LinkedHashSet;

public class EvenLinkedHashSet extends LinkedHashSet<Integer> {

    public boolean add(Integer number)
    {
        if(number%2 == 0)
        {
            return super.add(number);
        }
        else
        {
            System.out.println("numarul este imapr si nu va fi adaugat");
            return false;
        }

    }
}
