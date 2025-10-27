import java.util.HashSet;

public class EvenHashSet extends HashSet<Integer> {
    @Override
    public boolean add(Integer number) {
        if (number % 2 == 0) {
            return super.add(number);
        } else {
            System.out.println("numarul este impar");
            return false;
        }
    }
}
