public class ValoareForme implements Visitor1 {
    public void visit(Circle c)
    {
        System.out.println("Valoare grade cerc " + c.getRadius());
    }
    public void visit(Rectangle r){
        System.out.println("Valoare latura triunghi este "+ r.getLatura());
    }
    public void visit(Dot dot){
        System.out.println("Valoare x si y pentru punct este" + dot.getX() + " " + dot.getY());
    }
}
