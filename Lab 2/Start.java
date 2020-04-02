package wyporzyczalnia;
import java.util.Date;

public class Start{
    public static void main(String[] args) throws Exception {

        Wyporzyczalnia Publiczna = new Wyporzyczalnia();

        Plyty pop = new Plyty(new Date(82, 11, 30), "Michael Jackson ", " Epic Records ", 10, "Thriller", 120);
        Ksiazki fantastyka = new Ksiazki(new Date(94, 00, 00), " Sapkowski ", " Astronomy Today ", 146, " Krew elfów ", 389);
        Filmy abc = new Filmy(new Date(46, 25, 27), "aaa", "bbb", 36, "abc", 10000);
        Audiobooki kkk = new Audiobooki(new Date(22, 43, 87), "DD", "FF", 100, "DD", 2, 3);
        Ebooki hjhj = new Ebooki(new Date(22, 43, 87), "DD", "FF", 100, "DD", 2,3);

        Publiczna.add(fantastyka);
        Publiczna.add(pop);
        Publiczna.add(abc);
        Publiczna.add(kkk);

        System.out.println("Zasoby wypożyczalni:");

        Publiczna.showWyporzyczalnia();

        Uzytkownik XYZ = new Uzytkownik("XYZ", "XYZ", "YXZ", 82);
        Publiczna.addUser(XYZ);
        Uzytkownik YXZ = new Uzytkownik("YXZ", "YXZ", "ZZZ", 72);
        Publiczna.addUser(YXZ);

        long d1 = Publiczna.wyp(XYZ.getID(), pop.getID());
        XYZ.show();

        Publiczna.wyp(XYZ.getID(), pop.getID());
        Thread.sleep(8000);

        long d2 = Publiczna.zwrot(XYZ.getID(), pop.getID());
        Publiczna.Zaplata(d1, d2);

        System.out.println("dane zbiorów:");

        abc.info();
        fantastyka.info();
        pop.info();
        kkk.info();
    }
}