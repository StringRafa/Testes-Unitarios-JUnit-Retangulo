package services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class RetanguloTest2 {

	@Ignore  //Ignora o teste
	void test() {
		Retangulo retangulo = new Retangulo(2, 2);
		int resultadoEsperadoArea = 4;
		int resultadoEsperadoPerimetro = 8;

		int resultadoArea = retangulo.calcularArea();

		int resultadoPerimetro = retangulo.calcularPerimetro();

		assertTrue(resultadoArea == resultadoEsperadoArea && resultadoPerimetro == resultadoEsperadoPerimetro);
	}

	@Test
	void testArea() {
		Retangulo retangulo = new Retangulo(2, 2);
		int resultadoEsperadoArea = 4;

		int resultadoArea = retangulo.calcularArea();

		assertEquals(resultadoEsperadoArea, resultadoArea);
	}

	@Test
	void testPerimetro() {
		Retangulo retangulo = new Retangulo(2, 2);

		int resultadoPerimetro = retangulo.calcularPerimetro();

		assertEquals(8, resultadoPerimetro);
	}
}
