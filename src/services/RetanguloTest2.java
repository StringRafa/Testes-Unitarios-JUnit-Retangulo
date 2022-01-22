package services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class RetanguloTest2 {

//	@Ignore  //Ignora o teste
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
