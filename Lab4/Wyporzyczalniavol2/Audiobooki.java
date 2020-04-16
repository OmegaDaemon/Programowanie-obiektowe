package wyporzyczalnia;
import java.util.Date;

public class Audiobooki extends Utwor {
public Utwor Utwor;
    int dlugosc;
    int wielkosc;

    public Audiobooki() {

        this.Utwor = new Utwor();
        Utwor.setAutor("sasa");
        Utwor.setCena(20);
        Utwor.setNr_wew(8);
        Utwor.setTyt("coscos");
        Utwor.dwyd = new Date();
        this.dlugosc = 999;
        this.wielkosc = 87;

    }
    public int getDwyd() {return Utwor.getWyd();}
    public String getTyt() { return Utwor.getTyt();}
    public int getNr_wew() { return Utwor.getNr_wew();}
    public int getCena() { return Utwor.getCena(); }
    public String getAutor() { return Utwor.getAutor(); }

    public void info() {
        Utwor.info();
        System.out.println( "Coś" );}
}