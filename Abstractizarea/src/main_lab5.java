import java.util.Random;

public class main_lab5 {
    public static void main(String[] args) {

        OutTask a = new OutTask("fa laba");
        a.execute();
        RandomOutTask b = new RandomOutTask();
        b.execute();
        CounterOutTask c = new CounterOutTask();
        c.execute();
        Operation P = new Operation(10);
        Operation M = new Operation(10);
        Operation I = new Operation(10);
        Operation D = new Operation(10);

        M.plus(47);
        P.minus(23);
        D.div(0);
        System.out.println(M.getNumber());
        System.out.println(P.getNumber());
        System.out.println(D.getNumber());

        Song m1 = new Song("mam",22,"Michael Jackson");
        Song m2 = new Song("tat", 3,"Ianis");
        Album myAlbum = new DangerousAlbum();
        myAlbum.addSong(m1);
        myAlbum.addSong(m2);
        System.out.println("Albumul meu: " + myAlbum);
        Album myAlbum2 = new ThrillerAlbum();
        myAlbum2.addSong(m1);
        myAlbum2.addSong(m2);
        System.out.println("Albumul meu: " + myAlbum2);
        Album myAlbum3 = new BadAlbum();
        myAlbum3.addSong(m1);
        myAlbum3.addSong(m2);
        System.out.println("Albumul meu: " + myAlbum3);







    }
}
