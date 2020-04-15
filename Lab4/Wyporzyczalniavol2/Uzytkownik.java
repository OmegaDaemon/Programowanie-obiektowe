package Wyporzyczalniavol2;
import java.util.Date;
import java.util.UUID;
import java.util.ArrayList;
public class Uzytkownik {

    private Dane uzytkownik;
    public Date dat_zap;
    public UUID ID;
    ArrayList<UUID> wyporzyczone;

    public Uzytkownik(){

        this.uzytkownik = new Dane();
        uzytkownik.setImie("Jacek");
        uzytkownik.setNazwisko("Placek");
        uzytkownik.setAdres("warszawa");
        uzytkownik.setWiek(67);
        this.dat_zap = new Date();
        this.ID = UUID.randomUUID();
       this.wyporzyczone = new ArrayList<>();

    }

    public String getAdres() { return uzytkownik.adres;}
    public String getImie() { return uzytkownik.imie;}
    public int getWiek() { return uzytkownik.wiek;}
    public String getNazwisko() { return uzytkownik.nazwisko; }

    public void wyp(UUID x){
        this.wyporzyczone.add(x);
    }
    public void zwrot(UUID x){
        this.wyporzyczone.remove(x);
    }
    public void show(){ System.out.println(this.wyporzyczone); }
    public UUID getID() {
        return this.ID;
    }
}