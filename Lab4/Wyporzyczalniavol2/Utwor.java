package Wyporzyczalniavol2;
import java.util.Date;
import java.util.UUID;

public class Utwor {
    public int nr_wew;
    public String autor;
    public  int wyd;
    public int cena;
    public String tyt;
    public UUID ID;
    public Date dwyd;
    boolean wyporzyczony;


    public String getAutor(){ return autor; }
    public void setAutor(String autor){ this.autor = autor; }
    public int getNr_wew(){ return nr_wew; }
    public void setNr_wew(int nr_wew){ this.nr_wew = nr_wew; }
    public int getWyd(){ return wyd; }
    public void setWyd(int wyd){ this.wyd = wyd; }
    public String getTyt() { return tyt; }
    public void setTyt(String tyt){ this.tyt = tyt; }
    public int getCena(){ return cena; }
    public void setCena(int cena){ this.cena = cena; }
    public void setID() { this.ID = UUID.randomUUID(); }
    public UUID getID() { return this.ID; }




}
