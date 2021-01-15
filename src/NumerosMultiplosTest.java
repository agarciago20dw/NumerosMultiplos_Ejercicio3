import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosMultiplosTest {

	@Test
	public void testNNumerosDeN() {
		
		int num1 = 5;
		int num2 = 25;
		NumerosMultiplos n1 = new NumerosMultiplos (num1, num2);
		
		String resultadoReal = n1.nNumerosDeN();
		String resultadoEsperado = "5 10 15 20 25 ";
		assertEquals (resultadoReal, resultadoEsperado);
		
	}

}
