public class Employee {
    private String name;
    private double salary;
    private int age;


    public Employee(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculateBonus() {
        double bonus = salary * 0.05;
        return bonus;
    }
    public int validateEmployee() {
        if(salary < 0)
            System.out.println( "Salary cannot be negative");
        if(age < 0)
            System.out.println( "Age cannot be negative");
        return age;
    }
    public void showDetails() {
        System.out.println("Employee details: ");
    }
    public int compareSalary(Employee e1)
    {
        if(this.salary > e1.getSalary())
            return 1;
        else if(this.salary == e1.getSalary())
            return 0;
        return -1;
    }

    public String toString(){
        return "Name: " + name + "Salary: " + salary + "Age: " + age;
    }
}


 class Manager extends Employee {
    private int nrangajati;

   public Manager() {
       super(21,"Claudiu",1000);
   }
   public Manager(int nrangajati){
       super(21,"Mario",100000);
       this.nrangajati = nrangajati;
   }

   public int getNrangajati() {
       return nrangajati;
   }
   public void setNrangajati(int nrangajati) {
       this.nrangajati = nrangajati;
   }

   public double calculateBonus() {
       double bonus = super.getSalary() * 0.2;
       return bonus;
   }

   public void showDetails(){
       System.out.println("Employee details: Manager of" + nrangajati + " employees" );
   }

   public int validateEmployee(){
       if(nrangajati < 1 )
           System.out.println( "`Number of employees managed must be 1 or greater.`.");
       return nrangajati;
   }
   public double calculatebonus(double bonus)
     {
         bonus = super.getSalary() * 0.2 + bonus * nrangajati;
         return bonus;
     }
   public String toString() {
       return "Name" +super.getName() + "Salary" + super.getSalary() + "Age" + super.getAge();
   }

}

class Developer extends Employee{
    private int nrproiecte;
    public Developer() {
        super(31,"Cardonic",1000000);
    }
    public Developer(int nrproiecte) {
        super(100,"ALEXANDRU",1);
        this.nrproiecte = nrproiecte;
    }

    public int getNrproiecte() {
        return nrproiecte;
    }

    public void setNrproiecte(int nrproiecte) {
        this.nrproiecte = nrproiecte;
    }

    public double calculateBonus() {
        double bonus = super.getSalary() * 0.15;
        return bonus;
    }

    public void showDetails(){
        System.out.println("Employee details: Developer with" + nrproiecte + "proiects");
    }
    public int validateEmployee(Employee e1){
        if(nrproiecte < 1 )
            System.out.println("Number of projects must be 1 or greater ");
        return nrproiecte;
    }
    public double calculatebonus(double bonus){
        bonus = super.getSalary() * 0.2 + bonus * nrproiecte;
        return bonus;
    }
    public String toString() {
        return "Name" +super.getName() + "Salary" + super.getSalary() + "Age" + super.getAge();
    }
}
