package wyporzyczalnia;
import java.util.Date;

public class Audiobooki extends Utwor {

    int dlugosc;
    int wielkosc;

    public Audiobooki(Date nr_wew, String autor, String wyd, int cena, String tyt, int minutki, int wielkosc) {

        super(nr_wew, autor, wyd, cena, tyt);
        this.dlugosc = minutki;
        this.wielkosc = wielkosc;

    }
}