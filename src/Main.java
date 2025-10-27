import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Afrasinei","Mario",10,10);
        Student s2 = new Student("Mocanu","Claudiu",8,6);
        Student s3 = new Student("Michelle","Daniel",7,8);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.toString());
        }

        ArrayList<Student> copyStudents = new ArrayList<>(students);
        PriorityQueue<Student> pq = new PriorityQueue<>(
                (a,b) -> Long.compare(a.getId(),b.getId())
        );
       pq.addAll(copyStudents);
       while (!pq.isEmpty()) {
          System.out.println( pq.poll());
       }

       Map<String,Student> studentMap = new HashMap<String,Student>();
       studentMap.put("romana",s1);
       studentMap.put("matematica",s2);
       studentMap.put("geografie",s3);
       System.out.println(studentMap);

       EvenHashSet evenHashSet = new EvenHashSet();
       EvenLinkedHashSet evenLinkedHashSet = new EvenLinkedHashSet();
       EvenTreeSet evenTreeSet = new EvenTreeSet();

       int[]  numbers ={10,2,5,7,4,2,1};
       for(int i=0;i<numbers.length;i++)
       {
           evenHashSet.add(numbers[i]);
           evenLinkedHashSet.add(numbers[i]);
           evenTreeSet.add(numbers[i]);
       }
       System.out.println(evenHashSet);
       System.out.println(evenLinkedHashSet);
       System.out.println(evenTreeSet);




        }
    }
