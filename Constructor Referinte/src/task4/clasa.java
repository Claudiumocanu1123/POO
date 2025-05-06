package task4;

public class clasa {
    private String title;
    private String author;
    private int year;

    public clasa(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {

        return "titlul este: " +title + "\n author: " + author + "\n year: " + year;
    }
}