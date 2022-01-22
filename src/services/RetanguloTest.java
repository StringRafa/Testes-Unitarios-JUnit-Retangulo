package services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RetanguloTest {

	private int altura, area, base;

	public RetanguloTest(int base, int altura, int area) {
		this.base = base;
		this.altura = altura;
		this.area = area;
	}

	@Parameters
	public static Collection<Object[]> parametros() {
		return Arrays.asList(new Object[][] { { 10, 20, 200 }, { 10, 30, 300 }, { 10, 40, 400 }, { 10, 50, 500 }, 
			{ 20, 50, 1000 }, { 30, 50, 1500 }, { 40, 50, 2000 }, { 50, 50, 2500 }, { 10, 50, 300 }, { 10, 50, 600 } });
	}
//																							/\				/\
//																							 Resultado errado
	@Test
	public void testArea() {
		Retangulo re = new Retangulo(base, altura);
		re.setTimeout(false);

		int resultado = re.calcularArea();
		assertEquals(area, resultado);
		System.out.println(resultado);
	}
}
