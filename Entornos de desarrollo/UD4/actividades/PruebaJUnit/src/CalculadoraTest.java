import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	public void testSuma() {
		Calculadora calcu = new
	Calculadora(20, 10);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calcu = new Calculadora (20, 10);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplican() {
		Calculadora calcu= new Calculadora (20, 10);
		int resultado = calcu.multiplican();
		assertEquals(200, resultado);
	}

	@Test
	public void testDividen() {
		Calculadora calcu = new Calculadora (20, 10);
		int resultado = calcu.dividen();
		assertEquals(2, resultado);
	}

}
