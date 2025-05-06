package task3;

public class Point {
    float a;
    float b;

    public Point(float a,float b)
    {
        this.a = a;
        this.b = b;
    }
    public void changeCoords(float x, float y)
    {
        this.a = x;
        this.b = y;
    }
    public void afisare()
    {
        System.out.println("("+a+","+b+")");
    }

}
