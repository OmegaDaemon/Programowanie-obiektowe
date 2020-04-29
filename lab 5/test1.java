import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class zad1 {
    int a = 80;
    int b = 90;

    @Test
    void testSprawdzCzyLiczbySpelniajaWarunek() { assertTrue(this.a > 100 & this.b > 100); }

    @Test
    void testJesliJednaLiczbaNieSpelniaWarunkuPowiadomMnieOTym() { assertFalse(this.a < 100 || this.b < 100); }
}



