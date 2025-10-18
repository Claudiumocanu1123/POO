public class Rectangle implements Shape{
    float latura;
    public Rectangle(float latura){
        this.latura = latura;
    }
    public float getLatura()
    {
        return latura;
    }
    public void setLatura(float latura)
    {
        this.latura = latura;
    }
    @Override
    public void accept(Visitor1 visitor1)
    {
        visitor1.visit(this);
    }
}
