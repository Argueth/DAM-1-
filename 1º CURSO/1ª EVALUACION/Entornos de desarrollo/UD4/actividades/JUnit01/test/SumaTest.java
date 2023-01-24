
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SumaTest {
    
@Test
    public void testGetSuma() {
        System.out.println("getSuma");
        double a = 1.0;
        double b = 1.0;
        Suma instance = new Suma();
        double expResult = 2.0;
        double result = instance.getSuma(a, b);
        assertEquals(expResult, result);
    }

@Test
    public void testIncrementa() {
        System.out.println("incrementa");
        double a = 1.0;
        Suma instance = new Suma();
        double expResult = 2.0;
        double result = instance.incrementa(a);
        assertEquals(expResult, result);
    }
    
}
