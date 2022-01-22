package services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RetanguloTest2 {

//	@Ignore  //Ignora o teste
	@Test
	public void test() {
		Retangulo retangulo = new Retangulo(2, 2);
		int resultadoEsperadoArea = 4;
		int resultadoEsperadoPerimetro = 8;

		int resultadoArea = retangulo.calcularArea();

		int resultadoPerimetro = retangulo.calcularPerimetro();

		assertTrue(resultadoArea == resultadoEsperadoArea && resultadoPerimetro == resultadoEsperadoPerimetro);
	}

	@Test
	public void testArea() {
		Retangulo retangulo = new Retangulo(2, 2);
		retangulo.setTimeout(false);
		int resultadoEsperadoArea = 4;

		int resultadoArea = retangulo.calcularArea();

		assertEquals(resultadoEsperadoArea, resultadoArea);
	}

	@Test
	public void testPerimetro() {
		Retangulo retangulo = new Retangulo(2, 2);

		int resultadoPerimetro = retangulo.calcularPerimetro();

		assertEquals(8, resultadoPerimetro);
	}
}
