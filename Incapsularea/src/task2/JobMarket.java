package task2;

public class JobMarket {
    public static void main(String[] args){

        Student gigel =   new Student("Gigel", 3.8);
        Student mirel =  new Student("Dorel", 10);
        Student marcel=  new Student("Marcel", 10);
        Student clapome = new Student("Clapone", 10);
        Student[] students = {gigel,mirel,marcel,clapome};


           Internship google =  new Internship("google", 9.2,students);
           Internship amazon = new Internship("amazaon", 8.0,students);
           Internship microsoft = new Internship("microsoft", 9.8,students);
           Internship facebook = new Internship("facebook",5.0,students);
           microsoft.chooseCandidatesForInterview();
     Student mario = new Student("Mario", 9.8);
     Student ANDRO = mario; //new Student("Mario", 9.8);
     if(mario.equals(ANDRO))
         System.out.println("codul nu merge");







    }
}
