package task1;

public class Form {
    private String color;
    public Form()
    {
        color = " white";
    }
    public Form(String color)
    {
        this.color = color;
    }
    public float getArea()
    {
        return 0;
    }
    public String toString()
    {
        return "This form has the color" + color;
    }
    public float printperimetru()
    {
        return 0;
    }

}
class Square extends Form
{
    float side;
    public Square()
    {

    }
    public Square(float side)
    {
        this.side = side;
    }
    public float getArea()
    {
        return side * side;
    }
    public String toString()
    {
       return super.toString();
    }
    public void printSquareDimensions()
    {
        System.out.println("Dimensiunile patratului sunt " + side);
    }
    public float printperimetru()
    {
        return 4*side;
    }
}



class Triangle extends Form
{
    float height;
    float base;
    public Triangle()
    {

    }
    public Triangle(float base,float height)
    {
        this.base = base;
        this.height = height;
    }
    public float getArea()
    {
        return (base * height) / 2;
    }
    public String toString()
    {
        return super.toString();
    }

    public boolean equals(float  base,float height)
    {
        return true;
    }
    public boolean equals(Object o)
    {
        if(o == this)
        {
            return true;
        }
        if(!(o instanceof Triangle))
        {
            return false;
        }
        return equals((Triangle)o);
    }
public void printTriangleDimensions()
{
    System.out.println("Triangle Dimensions " + base + " " + height);
}
    public float printperimetru()
    {
        return base+height;
    }

}
class Circle extends Form
{
    float radius;
    public Circle()
    {

    }
    public Circle(float radius)
    {
        this.radius = radius;
    }
    public float getArea()
    {
        return (radius * radius);
    }
    public String toString()
    {
        return super.toString();
    }
    public void printCircleDimensions()
    {
        System.out.println("Dimensiunile cercului " + radius);
    }
    public float printperimetru()
    {
        return 2*radius;
    }
}
