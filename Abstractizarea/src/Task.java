import java.util.Random;
import java.util.ArrayList;
import java.util.List;
interface Task {
    void execute();
}

 class OutTask implements Task {
    String mesaj;
    public OutTask(String mesaj) {
        this.mesaj = mesaj;
    }
    public void execute(){
        System.out.println(mesaj);
    }

}

class RandomOutTask implements Task {
    int numar;
    private static final Random random = new Random(12345);
    public RandomOutTask() {
        this.numar = random.nextInt();
    }
    public void execute() {
        System.out.println("Random number is: " + numar);
    }
}
class CounterOutTask implements Task {
    int ct;
    public CounterOutTask() {
        ct++;
    }
    public void execute() {
        System.out.println("Counter number is: " + ct);
    }
}

// Exercitiul 2

interface Container
{
    Task pop();
    void push(Task a);
    int size();
    boolean isEmpty();
    void transferForm(Container c);
}
class Stack implements Container {
    private List<Task> tasks = new ArrayList<>();
    private int size;
    public Task pop() {
        if(isEmpty()) return null;
        size--;
        return tasks.remove(size);
    }
    public void push(Task a) {
        tasks.add(a);
    }
    public int size()
    {
        return tasks.size();
    }
    public boolean isEmpty()
    {
        return tasks.isEmpty();
    }
    public void transferForm(Container c)
    {
        while(!c.isEmpty()) {
            this.push(c.pop());
        }
    }
}
class Queue implements Container {
    private List<Task> tasks = new ArrayList<>();
    public Task pop(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return tasks.remove(0);
    }
    public void push(Task a) {
        tasks.add(a);
    }
    public int size() {
        return tasks.size();
    }
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
    public void transferForm(Container c)
    {
        while(!c.isEmpty()) {
            this.push(c.pop());
        }
    }
}

// Exercitiul 3;

interface Minus {
    void minus(float value);
}
interface Plus {
    void plus(float value);
}
interface Mult{
    void mult(float value);
}
interface Div {
    void div(float value);
}

class Operation implements Minus, Plus, Mult, Div {
    float number;
    public Operation(float initialValue)
    {
        this.number = initialValue;
    }
    public float getNumber()
    {
        return number;
    }
    public void minus(float value)
    {
        number = number - value;
    }
    public void plus(float value)
    {
        number = number + value;
    }
    public void mult(float value)
    {
        number = number * value;
    }
    public void div(float value)
    {
        if (value == 0) {
            System.out.println("Division by zero");
        }
        else
            number = number / value;
    }
}

// Exercitiul 4
 class Song {
    String name;
    int id;
    String composer;

    Song(String name,int id,String composer)
    {
        this.name = name;
        this.id = id;
        this.composer = composer;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getComposer()
    {
        return composer;
    }
    public void setComposer(String composer)
    {
        this.composer = composer;
    }
    public String toString()
    {
       return "Song [name=" + name + ", id=" + id + ", composer=" + composer;
    }

}
 abstract class Album {
    ArrayList<Song> songs = new ArrayList<>();
    abstract void addSong(Song song);
    public void removeSong(Song song)
    {
        songs.remove(song);
    }
    public String toString()
    {
        return "Album[ songs= " + songs + "]";
    }

 }
 class DangerousAlbum extends Album {
     private boolean isPrime(int n) {
         if (n <= 1) return false;
         for (int i = 2; i <= Math.sqrt(n); i++) {
             if (n % i == 0) return false;
         }
         return true;
     }
    void addSong(Song song)
    {
       if(isPrime(song.getId()))
           songs.add(song);

    }
 }
 class ThrillerAlbum extends Album {
    void addSong(Song song)
    {
        if(song.getComposer().equals("Michael Jackson") && isEven(song.getId()))
            songs.add(song);
    }
     private boolean isEven(int id) {
         return id % 2 == 0;
     }
 }
 class BadAlbum extends Album {
    private boolean isPalindrom(int id) {
         String original = Integer.toString(id);
         String reversed = new StringBuilder(original).reverse().toString();
         return original.equals(reversed);
     }

    void addSong(Song song)
    {
        if(song.getName().length() == 3 && isPalindrom(song.getId()))
            songs.add(song);
    }
 }