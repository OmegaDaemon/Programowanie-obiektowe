package wyporzyczalnia;


public class Start{
    public static void main(String[] args) throws Exception {

        Wyporzyczalnia Publiczna = new Wyporzyczalnia();
        Audiobooki kkk = new Audiobooki();
       Ebooki hjhj = new Ebooki();
       Filmy abc = new Filmy();
      Ksiazki fantastyka = new Ksiazki();
       Plyty pop = new Plyty();

        Publiczna.add(fantastyka);
        Publiczna.add(pop);
        Publiczna.add(abc);
        Publiczna.add(kkk);
        Publiczna.add(hjhj);

        System.out.println("Zasoby wypożyczalni:");

        Publiczna.showWyporzyczalnia();

        Uzytkownik XYZ = new Uzytkownik("XYZ", "XYZ", "YXZ", 82);
        Publiczna.addUser(XYZ);
        Uzytkownik YXZ = new Uzytkownik("YXZ", "YXZ", "ZZZ", 72);
        Publiczna.addUser(YXZ);

        long d1 = Publiczna.wyp(XYZ.getID(), kkk.getID());
        XYZ.show();

        Publiczna.wyp(XYZ.getID(), kkk.getID());
        Thread.sleep(8000);

        long d2 = Publiczna.zwrot(XYZ.getID(), kkk.getID());
        Publiczna.Zaplata(d1, d2);

        System.out.println("dane zbiorów:");

       abc.info();
       fantastyka.info();
      pop.info();
        kkk.info();
    }
}