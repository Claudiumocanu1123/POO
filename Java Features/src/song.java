import java.util.Arrays;
import java.util.stream.Stream;

public class song {
    String numeCompozitor;
    String numeMelodie;
    int durata;
    String genMuzical;

    public song(String numeCompozitor, String numeMelodie, int durata, String genMuzical) {
        this.numeCompozitor = numeCompozitor;
        this.numeMelodie = numeMelodie;
        this.durata = durata;
        this.genMuzical = genMuzical;
    }

    public String getNumeCompozitor() {
        return numeCompozitor;
    }

    public String getNumeMelodie() {
        return numeMelodie;
    }

    public void setNumeCompozitor(String numeCompozitor) {
        this.numeCompozitor = numeCompozitor;
    }

    public void setNumeMelodie(String numeMelodie) {
        this.numeMelodie = numeMelodie;
    }

    public String toString() {
        return numeCompozitor + " " + numeMelodie + " " + durata;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    String[] myArray = new String[]{" Alex Velea", "Smiley", "Rava", "Ian", "Oscar"};
    Stream<String> myStream = Arrays.stream(myArray);


}
