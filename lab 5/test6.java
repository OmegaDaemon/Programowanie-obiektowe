package projekt;
import org.junit.Test;
import static org.junit.Assert.*;

public class test6 {
    private int [] tab = new int[] {1,2,3,4,5,6,7,8,9};
    zad6 odwrotna= new zad6(tab);

    @Test
    public void IsSameReferenceTest() { assertEquals("987654321",odwrotna.odwroc(tab)); }
}