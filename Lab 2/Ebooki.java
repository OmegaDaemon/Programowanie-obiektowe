package wyporzyczalnia;
import java.util.Date;

public class Ebooki extends Utwor {

    int iloscstron;
    int wielkosc;

    public Ebooki(Date nr_wew, String aut, String wyd, int cena, String tyt, int ilstr, int wielkosc){

        super(nr_wew, aut, wyd, cena, tyt);
        this.iloscstron = ilstr;
        this.wielkosc = wielkosc;

    }

}