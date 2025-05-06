package task1;

public class main_complex {
    public static void main(String[] args)
    {
        Complex z = new Complex();
        Complex z2 = new Complex(5,6);
        Complex z3 = z2;


        System.out.println("valoarea lui z2 este: " + z2.getreal() + "  i*" +z2.getimaginary());
        z2.showNumber();
        z2.setImaginary(0);
        z2.showNumber();



    }
}
