package wyporzyczalnia;
import java.util.Date;

public class Plyty extends Utwor {
public Utwor Utwor;
    int wielkosc;

    public Plyty(){

        this.Utwor = new Utwor();
        Utwor.setAutor("sasa");
        Utwor.setCena(20);
        Utwor.setNr_wew(8);
        Utwor.setTyt("coscos");
        Utwor.dwyd = new Date();
        this.wielkosc = 7768678;
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