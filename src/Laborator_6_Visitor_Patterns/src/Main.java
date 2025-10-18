import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager manager;
        List<Employee> employees = new LinkedList<Employee>();
        employees.add(new Employee("Alice", 20));
        employees.add(manager = new Manager("bob", 30));
        manager.setBonus(50);
        Visitor v = new RevenueVisitor();
        for (Employee e : employees) {
            e.acept(v);
        Circle circle;
        Dot dot;
        Rectangle rect;
        List<Shape> shapes = new LinkedList<Shape>();
        shapes.add(new Circle(20));
        shapes.add(new Dot(10,20));
        shapes.add(new Rectangle(80));
        Visitor1 forme = new ValoareForme();
        for (Shape s : shapes) {
            s.accept(forme);
        }




        }
    }
}