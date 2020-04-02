package wyporzyczalnia;
import java.util.Date;
import java.util.UUID;

public class Utwor {

    Date nr_wew;
    String autor;
    String wyd;
    int cena;
    String tyt;
    UUID ID;
    Date dwyd;
    boolean wyporzyczony;

    public Utwor(Date nr_wew, String autor, String wyd, int cena, String tyt) {

        this.nr_wew = nr_wew;
        this.autor = autor;
        this.wyd = wyd;
        this.cena = cena;
        this.tyt = tyt;
        this.ID = UUID.randomUUID();

    }

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

    public UUID getID() {
        return this.ID;
    }

    public String gTYT() {
        return this.tyt;
    }

    public void info() {

        System.out.println("tytuł " + this.tyt + "\n" + "wydanie " + this.nr_wew + "\n" + "autor  " + this.autor + "\n" + "wydawca " + this.wyd + "\n" + "cena " + this.cena);

    }

}
