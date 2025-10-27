public class RevenueVisitor implements Visitor{
    public void visit(Employee employee) {
        System.out.println(employee.getName() + " " + employee.getSalary());
    }
    public void visit(Manager manager) {
        System.out.println(manager.getName()+" " + (manager.getSalary() + manager.getBonus()));
    }

}
