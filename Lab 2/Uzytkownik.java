package wyporzyczalnia;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Uzytkownik {

    private Dane d;

    public Uzytkownik(String imie, String nazw, String adres, int wiek){

        this.d = new Dane();
        d.imie = imie;
        d.nazwisko = nazw;
        d.adres = adres;
        d.wiek = wiek;
        d.dat_zap = new Date();
        d.ID = UUID.randomUUID();
        d.wyporzyczone = new ArrayList<>();

    }

    public void wypo(UUID x){
        d.wyporzyczone.add(x);
    }

    public void zwrot(UUID x){
        d.wyporzyczone.remove(x);
    }

    public UUID getID() {
        return d.ID;
    }

    public void show(){

        System.out.println(d.wyporzyczone);

    }
}