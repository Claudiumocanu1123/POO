package task1;

public class Complex {
   private int real;
   private int imaginary;
    public Complex(int real,int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex()
    {
        this(0,0);
    }
    public Complex(Complex c)
    {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }
    public int getreal()
    {
        return real;
    }
    public int getimaginary()
    {
        return imaginary;
    }
    public void setReal(int real)
    {
        this.real=real;
    }
    public void setImaginary(int imaginary)
    {
        this.imaginary=imaginary;
    }
    public void addWithComplex(Complex b)
    {
        this.real = this.real+b.real;
        this.imaginary = this.imaginary+b.imaginary;
    }
    public void showNumber()
    {
        if(imaginary > 0)
            System.out.println(real+"+i * " +imaginary);
        else if(imaginary < 0)
            System.out.println(real+ "-i *" +imaginary);
        else
            System.out.println(real);
    }




}
