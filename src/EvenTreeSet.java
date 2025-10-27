import java.util.TreeSet;

public class EvenTreeSet extends TreeSet<Integer> {

    public boolean add(Integer number)
    {
        if(number %2 == 0)
        {
            return super.add(number);
        }
        else
        {
            System.out.println("numarul este impar");
            return false;
        }
    }
}
