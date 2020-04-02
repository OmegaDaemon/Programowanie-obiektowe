package wyporzyczalnia;
import java.util.Date;

public class Filmy extends Utwor {

    int dlugosc;

    public Filmy(Date nr_wew, String autor, String wyd, int cena, String tyt, int minutki ){

        super(nr_wew, autor, wyd, cena, tyt);
        this.dlugosc = minutki;

    }
}