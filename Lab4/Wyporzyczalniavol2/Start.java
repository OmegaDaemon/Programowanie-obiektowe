package Wyporzyczalniavol2;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) throws Exception {

        Audiobooki kkk = new Audiobooki();
        Ebooki hjhj = new Ebooki();
        Filmy abc = new Filmy();
        Ksiazki fantastyka = new Ksiazki();
        Plyty pop = new Plyty();
        List<Object> Publiczna = new ArrayList<Object>();
        Publiczna.add(kkk);
        Publiczna.add(hjhj);
        Publiczna.add(abc);
        Publiczna.add(pop);
        Publiczna.add(fantastyka);

        List<Uzytkownik> Uzytkowniks = new ArrayList<>();
        Uzytkownik XYZ = new Uzytkownik();
        Uzytkowniks.add(XYZ);



        System.out.println("dane zbiorów:");

        hjhj.info();
        abc.info();
        fantastyka.info();
        pop.info();
        kkk.info();
    }

    }

