import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import services.Retangulo;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)// Ordenar os testes por nome
public class RetanguloTestJUnit {

	@Test(timeout = 200) //Teste de tempo de execução
	public void testAreaTimeout() {
		int base = 2, altura = 2;
		Retangulo re = new Retangulo(base, altura);
		re.setTimeout(true);
		
		int resultado = re.calcularArea();
		assertEquals(4, resultado);
		System.out.println(resultado);
	}
	
	@Test
	public void testArea() {
		int base = 2, altura = 2;
		Retangulo re = new Retangulo(base, altura);
		
		int resultado = re.calcularArea();
		assertEquals(4, resultado);
		System.out.println(resultado);
	}

	@Test
	public void testPerimetro() {
		int base = 5, altura = 2;
		Retangulo re = new Retangulo(base, altura);
		
		int resultado = re.calcularPerimetro();
		assertEquals(14, resultado);
		System.out.println(resultado);
	}
	
	@Test
	public void testSoma() {
		int base = 5, altura = 2;
		Retangulo re = new Retangulo(base, altura);
		
		int resultado = re.soma();
		assertEquals(7, resultado);
		System.out.println(resultado);
	}
	
	@Test
	public void testMultiplicacao() {
		int base = 5, altura = 2;
		Retangulo re = new Retangulo(base, altura);
		
		int resultado = re.multiplicacao();
		assertEquals(10, resultado);
		System.out.println(resultado);
	}
	
	@Test
	public void testDivisao() {
		int base = 6, altura = 2;
		Retangulo re = new Retangulo(base, altura);
		
		int resultado = re.divisao();
		assertEquals(3, resultado);
		System.out.println(resultado);
	}
	
	@Test
	public void testSubtracao() {
		int base = 6, altura = 2;
		Retangulo re = new Retangulo(base, altura);
		
		int resultado = re.subtracao();
		assertEquals(4, resultado);
		System.out.println(resultado);
	}
}
