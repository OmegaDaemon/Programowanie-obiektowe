import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class zad5 {

    String hi= "coscoscos";
    int a = (hi.length()/2);

    @Test
    void JesliPolowaJestWielkszaNiz10NieBedzieSpelnionyWarunek() { assertFalse(a>10); }

    @Test
    void JesliPolowaJestMniejszaNiz10WarunekBedzieSpelniony() { assertTrue(a<10); }

    @Test
    void testSprawdzCzyLiczbaSpelniajaWarunek2() { assertEquals(4, a); }
}
