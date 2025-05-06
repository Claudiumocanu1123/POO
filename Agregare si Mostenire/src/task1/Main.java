package task1;

public class Main {
    public static void main(String[] args) {
        Form[] forme = new Form[3];
        forme[0] = new Circle(5);
        forme[1] = new Triangle(2, 3);
        forme[2] = new Square(2);

        for (int i = 0; i < forme.length; i++)
        {
            System.out.println(forme[i].toString());

            if (forme[i] instanceof Circle) {
                ((Circle) forme[i]).printCircleDimensions();
            }
            if (forme[i] instanceof Triangle)
                ((Triangle) forme[i]).printTriangleDimensions();
            if (forme[i] instanceof Square)
                ((Square) forme[i]).printSquareDimensions();

            System.out.println("sug pula "+forme[i].getArea());
            System.out.println(" nu sug pula "+forme[i].printperimetru());
        }
    }

}
