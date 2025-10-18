public class Employee implements Visitable{

    String name;
    float salary;
    public Employee(String name,float salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }
    public float getSalary()
    {
        return salary;
    }
    public float getTotalrevenue()
    {
        return salary;
    }
    public void acept(Visitor v)
    {
        v.visit(this);
    }
}
