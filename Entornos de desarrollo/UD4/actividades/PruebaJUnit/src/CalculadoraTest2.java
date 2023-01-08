import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest2 {

	@Test
	public void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	public void testSuma() {
		Calculadora calcu = new
		Calculadora(30, 5);
		int resultado = calcu.suma();
		assertEquals(35, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calcu = new Calculadora (30, 5);
		int resultado = calcu.resta();
		assertEquals(25, resultado);
	}

	@Test
	public void testMultiplican() {
		Calculadora calcu= new Calculadora (30, 5);
		int resultado = calcu.multiplican();
		assertEquals(150, resultado);
	}

	@Test
	public void testDividen() {
		Calculadora calcu = new Calculadora (30, 5);
		int resultado = calcu.dividen();
		assertEquals(6, resultado);
	}

}
