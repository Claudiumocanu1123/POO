public class main_ref {
    public static void main(String[] args) {
        Employee e1  = new Employee (100,"mario",1000);
        Employee e2 = new Employee(21,"clapa",100);

        System.out.println(e2.calculateBonus());
        System.out.println(e2.validateEmployee());
        System.out.println(e1.compareSalary(e2));

        Manager m1 = new Manager();
        System.out.println(m1);
        Manager m2 = new Manager(50);
        System.out.println(m2);
        System.out.println(m1.calculateBonus());
        m2.showDetails();

    }
}
