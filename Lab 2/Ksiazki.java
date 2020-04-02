package wyporzyczalnia;
import java.util.Date;

public class Ksiazki extends Utwor {

    int iloscstron;

    public Ksiazki(Date nr_wew, String autor, String wyd, int cena, String tyt, int il_str ){

        super(nr_wew, autor, wyd, cena, tyt);
        this.iloscstron = il_str;

    }
}

