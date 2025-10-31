import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class PlayList {
    List<song> songs = new ArrayList<song>();
    List<song> songs1 = new ArrayList<>();

    @Override
    public String toString() {
        return songs.toString() + "\n" + songs1.toString();
    }

    public PlayList() {
        songs.add(s1);
        songs.add(s2);
        songs.add(s3);
        songs.add(s4);
        songs.add(s5);
        songs.add(s6);
        songs.add(s7);
        songs.add(s8);
        songs.add(s9);
        songs.add(s10);
        songs.add(s11);
        songs.add(s12);
        songs.add(s13);
        songs.add(s14);
        songs.add(s15);
        songs.add(s16);
        songs.add(s17);
        songs.add(s18);
        songs.add(s19);
        songs.add(s20);
    }

    public PlayList(String genMuzical) {
        songs1.add(s21);
        songs1.add(s22);
        songs1.add(s23);
        songs1.add(s24);
        songs1.add(s25);
        songs1.add(s26);
        songs1.add(s27);
        songs1.add(s28);
        songs1.add(s29);
        songs1.add(s30);
        songs1.add(s31);
        songs1.add(s32);
        songs1.add(s33);
        songs1.add(s34);
        songs1.add(s35);
        songs1.add(s36);
        songs1.add(s37);
        songs1.add(s38);
        songs1.add(s39);
        songs1.add(s40);
    }

    song s1 = new song("Ian", "Scuze mama", 200, "Pop");
    song s2 = new song("Smiley", "Indragostit", 210, "Jazz");
    song s3 = new song("Delia", "Da, mamă", 230, "Pop");
    song s4 = new song("Carla's Dreams", "Sub pielea mea", 215, "Pop");
    song s5 = new song("The Motans", "Versus", 205, "Alternative");
    song s6 = new song("Irina Rimes", "Ce s-a întâmplat cu noi", 198, "Pop");
    song s7 = new song("Ian", "Iubirea schimbă tot", 220, "Pop");
    song s8 = new song("Connect-R", "Vara nu dorm", 200, "Dance");
    song s9 = new song("Smiley", "Acasă", 240, "Pop");
    song s10 = new song("Puya", "Mă doare la bască", 190, "Rap");
    song s11 = new song("Inna", "Ruleta", 210, "Dance");
    song s12 = new song("Guess Who", "Tot mai sus", 230, "Hip-Hop");
    song s13 = new song("Voltaj", "De la capăt", 225, "Rock");
    song s14 = new song("Antonia", "Marabou", 200, "Pop");
    song s15 = new song("Lora", "Rămas bun", 215, "Pop");
    song s16 = new song("Alex Velea", "Minim doi", 205, "R&B");
    song s17 = new song("Feli", "Cine te crezi", 195, "Soul");
    song s18 = new song("3 Sud Est", "Emoții", 210, "Pop");
    song s19 = new song("JO", "Dorul", 208, "Pop");
    song s20 = new song("Vunk", "Așa, și?", 225, "Rock");

    song s21 = new song("Rihanna", "Diamonds", 230, "Pop");
    song s22 = new song("The Weeknd", "Blinding Lights", 200, "R&B");
    song s23 = new song("Dua Lipa", "Levitating", 220, "Pop");
    song s24 = new song("Imagine Dragons", "Believer", 210, "Rock");
    song s25 = new song("Billie Eilish", "Bad Guy", 195, "Pop");
    song s26 = new song("Ed Sheeran", "Shape of You", 240, "Pop");
    song s27 = new song("Post Malone", "Circles", 215, "Hip-Hop");
    song s28 = new song("Adele", "Hello", 225, "Soul");
    song s29 = new song("Coldplay", "Viva La Vida", 230, "Alternative");
    song s30 = new song("Shawn Mendes", "Stitches", 205, "Pop");
    song s31 = new song("Bruno Mars", "24K Magic", 210, "R&B");
    song s32 = new song("Maroon 5", "Memories", 220, "Pop");
    song s33 = new song("Selena Gomez", "Lose You to Love Me", 200, "Pop");
    song s34 = new song("Khalid", "Talk", 210, "R&B");
    song s35 = new song("Harry Styles", "Watermelon Sugar", 215, "Pop");
    song s36 = new song("Ariana Grande", "7 Rings", 200, "Pop");
    song s37 = new song("Sia", "Chandelier", 230, "Pop");
    song s38 = new song("Lewis Capaldi", "Someone You Loved", 225, "Pop");
    song s39 = new song("Doja Cat", "Say So", 205, "Pop");
    song s40 = new song("Demi Lovato", "Sorry Not Sorry", 220, "Pop");

    public static void main(String[] args) {
        PlayList pl = new PlayList();
        PlayList pl2 = new PlayList("Pop");

        System.out.println("Prima sarcina a laboratorului:\n");
        pl.songs.stream()
                .filter(playlist -> playlist.numeCompozitor.equals("Ian"))
                .forEach(playlist -> System.out.println(playlist));

        System.out.println("\nA doua sarcina a laboratorului:\n");
        pl.songs.stream()
                .peek(st -> st.setNumeMelodie(st.getNumeMelodie().toUpperCase()))
                .forEach(System.out::println);

        System.out.println("\nA treia sarcina a laboratorului:\n");
        int calculdurataPlaylist = pl.songs.stream()
                .mapToInt(song::getDurata)
                .sum();
        System.out.println(calculdurataPlaylist);

        System.out.println("\nA patra sarcina a laboratorului:\n");
        Map<String, List<song>> MuzicalGen = pl.songs.stream()
                .collect(Collectors.groupingBy(song::getGenMuzical));
        for (Map.Entry<String, List<song>> entry : MuzicalGen.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("\nA cincea sarcina a laboratorului:\n");
        List<List<PlayList>> listOfLists = List.of(List.of(pl), List.of(pl2));
        List<PlayList> singleList = listOfLists.stream().flatMap(List::stream).toList();
        System.out.println(singleList);

        System.out.println("\nA sasea sarcina a laboratorului:\n");
        pl2.songs1.stream()
                .peek(st -> st.setNumeCompozitor(st.numeCompozitor.toLowerCase()))
                .forEach(System.out::println);

        System.out.println("\nA saptea sarcina a laboratorului:\n");
        pl.songs.stream()
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("\nA opta sarcina a laboratorului:\n");
        pl.songs.stream()
                .filter(playlist -> playlist.durata > 215)
                .forEach(System.out::println);

        System.out.println("\nA noua sarcina a laboratorului:\n");
        pl.songs.stream()
                .sorted(Comparator.comparingInt(song::getDurata))
                .forEach(System.out::println);

        System.out.println("\nA zecea sarcina a laboratorului:\n");
        pl.songs.stream()
                .sorted(Comparator.comparing(song::getNumeCompozitor).reversed())
                .forEach(System.out::println);
    }
}
