package wyporzyczalnia;
import java.util.Date;
import java.util.UUID;
import java.util.ArrayList;

public class Wyporzyczalnia {

    ArrayList<Utwor> zbior;
    ArrayList<Uzytkownik> listauzytkownikow;


    public void Zaplata(long date1, long date2) {

        long dni = date2 - date1;

        if (dni >= 30) {

            long owed = dni / 100;
            System.out.println("Trzeba zaplacic " + owed + "groszy");

        }
    }

    public Wyporzyczalnia(){

        this.zbior = new ArrayList<>();
        this.listauzytkownikow = new ArrayList<>();

    }

    public void add(Ksiazki x){
        zbior.add(x);
    }

    public void add(Plyty x){
        zbior.add(x);
    }

    public void add(Audiobooki x){
        zbior.add(x);
    }

    public void add(Filmy x){
        zbior.add(x);
    }

    public void addUser(Uzytkownik x){
        listauzytkownikow.add(x);
    }

    public void showWyporzyczalnia() {

        for (Utwor x: this.zbior) {

            System.out.println(x.gTYT());

        }
    }

    long wyp(UUID IDu, UUID IDb) {

        Uzytkownik user = this.listauzytkownikow.get(0);

        for (Uzytkownik x: this.listauzytkownikow) {

            if (x.getID() == IDu) {
                user = x;

            }
        }

        Utwor item = this.zbior.get(0);

        for (Utwor y: this.zbior){

            if (y.getID() == IDb){
                item = y;

            }
        }

        Date rentDate = new Date();
        long date1= rentDate.getTime();

        user.wypo(IDb);
        item.wyp();

        return date1;
    }

    long zwrot (UUID IDu, UUID IDb){

        Uzytkownik user = this.listauzytkownikow.get(0);

        for (Uzytkownik x: this.listauzytkownikow) {

            if (x.getID() == IDu) {
                user = x;

            }
        }
        Utwor item = this.zbior.get(0);

        for (Utwor y: this.zbior){

            if (y.getID() == IDb){
                item = y;

            }
        }
        Date returnDate = new Date();
        long date2= returnDate.getTime();

        user.zwrot(IDb);
        item.zwrot();
        return date2;
    }
}
