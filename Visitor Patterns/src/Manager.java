
public class Manager extends Employee {
    float bonus;
    public Manager(String name, float salary) {
        super(name, salary);
        bonus = 0;
    }
    public float getBonus()
    {
        return bonus;
    }
    public void setBonus (float bonus)
    {
        this.bonus = bonus;
    }
    public float getTotalRevenue()
    {
        return salary+bonus;
    }
    public void acept(Visitor v)
    {
        v.visit(this);
    }

}
