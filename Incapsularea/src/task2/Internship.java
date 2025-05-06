package task2;
import java.util.Random;
public class Internship {
    private String name;
    private double minGrade;
    private Student[] students;
    public Internship(String name,double minGrade,Student[] students)
    {
        this.name = name;
        this.minGrade = minGrade;
        this.students = students;
    }
    public Student chooseCandidateRandomly()
    {
     Random r = new Random();
     return students[r.nextInt(students.length)];
    }
    public void chooseCandidatesForInterview()
    {
        for (int i = 0; i < students.length; i++)
        {
            if (students[i].getgrade() >= minGrade)
                System.out.println("Candidate " + students[i].getname() + " got a phone interviw at " + name);

        }
    }
}
