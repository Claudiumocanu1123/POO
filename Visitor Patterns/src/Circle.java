public class Circle implements Shape{
     float radius;
     public Circle(float radius)
     {
         this.radius = radius;
     }
     public float getRadius()
     {
         return radius;
     }
     public void setRadius(float radius)
     {
         this.radius = radius;
     }
     @Override
    public void accept(Visitor1 visitor1)
    {
        visitor1.visit(this);
    }

}
