package projekt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class test2 {

        private int[] sekwencja = new int[] {1,2,3};
        private zad2 test2 = new zad2(sekwencja);

        @Test
        void ZwrocPrawdeJezeliSekwencjaJestZawarta() { assertTrue(test2.sprawdzamsekwencje(new int[]{1,2,3,4,5,6,7,8,9})); }

        @Test
        void ZwrocFalszJezeliSekwencjiNieMa() { assertFalse(test2.sprawdzamsekwencje(new int[]{8,9,6,4,5,2})); }

        @Test
        void BrakSekwencji() { assertFalse(test2.sprawdzamsekwencje(new int[]{9,9,9,9,9})); }

    }

