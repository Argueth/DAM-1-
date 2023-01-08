import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class RestaTest {    

    @Test
    public void testGetDiferencia() {
        System.out.println("getDiferencia");
        double a = 2.0;
        double b = 1.0;
        Resta instance = new Resta();
        double expResult = 1.0;
        double result = instance.getDiferencia(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDecrementa() {
        System.out.println("decrementa");
        double a = 2.0;
        Resta instance = new Resta();
        double expResult = 1.0;
        double result = instance.decrementa(a);
        assertEquals(expResult, result, 0);
    }
    
}
