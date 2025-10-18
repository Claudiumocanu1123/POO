package Task2;

public class Main {
    public static void main(String[] args) {

        House casa = new HouseBuilder("Bucuresti", 2, 5)
                .piscina(true)
                .build();
        System.out.println(casa);

    }
}
