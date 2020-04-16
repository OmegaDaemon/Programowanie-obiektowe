package wyporzyczalnia;
import java.util.Date;

public class Ebooki extends Utwor {
    public Utwor Utwor;
    int iloscstron;
    int wielkosc;

    public Ebooki(){

        this.Utwor = new Utwor();
        Utwor.setAutor("ssss");
        Utwor.setCena(25);
        Utwor.setNr_wew(9);
        Utwor.setTyt("????");
        Utwor.dwyd = new Date();
        this.wielkosc =888;
        this.iloscstron = 7384782;

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