package wyporzyczalnia;
import java.util.Date;

public class Filmy extends Utwor {
    public Utwor Utwor;
    int dlugosc;

    public Filmy(){

        this.Utwor = new Utwor();
        Utwor.setAutor("sasa");
        Utwor.setCena(20);
        Utwor.setNr_wew(8);
        Utwor.setTyt("coscos");
        Utwor.dwyd = new Date();
        this.dlugosc = 32424;

    }

    public Date getDwyd() {return Utwor.dwyd;}
    public String getTyt() { return Utwor.getTyt(); }
    public int getNr_wew() { return Utwor.getNr_wew(); }
    public int getCena() { return Utwor.getCena(); }
    public String getAutor() { return Utwor.getAutor(); }

    public void info() {
        Utwor.info();
        System.out.println( "Coś" );}
}