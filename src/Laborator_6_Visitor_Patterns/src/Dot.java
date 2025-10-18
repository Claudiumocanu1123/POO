public class Dot implements Shape{

    int x;
    int y;
    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
   public  int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
   public void setY(int y){
        this.y = y;
    }
    @Override
    public void accept(Visitor1 visitor1)
    {
        visitor1.visit(this);
    }

}
