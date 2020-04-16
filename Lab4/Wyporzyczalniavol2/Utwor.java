package wyporzyczalnia;
import java.util.Date;
import java.util.UUID;

public class Utwor {

    int nr_wew;
    String autor;
    int wyd;
    int cena;
    String tyt;
    UUID ID;
    Date dwyd;
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

    public void wyp() {

        if (this.wyporzyczony) {

            System.out.println("Wyporzyczone:" + this.tyt);

        } else {

            this.wyporzyczony = true;
            this.dwyd = new Date();
        }
    }

    public void zwrot() {

        if (this.wyporzyczony) {

            this.wyporzyczony = false;

        } else {

            System.out.println("Zwrocona:" + this.tyt);

        }
    }

    public String gTYT() {
        return this.tyt;
    }

    public void info() {

        System.out.println("tytuł " + this.tyt + "\n" + "wydanie " + this.nr_wew + "\n" + "autor  " + this.autor + "\n" + "wydawca " + this.wyd + "\n" + "cena " + this.cena);

    }

}
