package wyporzyczalnia;
import java.util.Date;

public class Plyty extends Utwor {

    int wielkosc;

    public Plyty(Date nr_wew, String autor, String wyd, int cena, String tyt, int il_utw ){

        super(nr_wew, autor, wyd, cena, tyt);
        this.wielkosc = il_utw;

    }
}