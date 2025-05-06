package task3;

public class Polygon
{
    int n;
    Point[] points;

    public Polygon(int n) {
        this.n = n;
        this.points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(0, 0);
            points[i].afisare();
        }
    }
}


