import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    String surname;
    long id;
    double averageGrade;
    public Student(String name, String surname,long id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }
   public String toString(){
        return name + " " + surname + " " + id + " " + averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public long getId() {
        return id;
    }

    public int compareTo(Student o) {
      if(this.averageGrade == o.averageGrade)
      {
          if (surname.equals(o.surname)) {
              return name.compareTo(o.name);
          } else {
              return surname.compareTo(o.surname);
          }
      }
      else
          return Double.compare(averageGrade, o.averageGrade);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(averageGrade, student.averageGrade) == 0 && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, averageGrade);
    }
}



