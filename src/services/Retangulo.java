package services;

public class Retangulo {

	private int altura, base;
	private boolean timeout = false;

	public Retangulo() {

	}

	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int calcularArea() {
		if (timeout == true) {
			int x = 10;
			while (x > 0) {
				try {
					Thread.sleep(300);
					x--;
				} catch (InterruptedException e) {
				}
			}
		}

		return base * altura;
	}

	public int calcularPerimetro() {
		return base * 2 + altura * 2;
	}

	public int soma() {
		return base + altura;
	}

	public int multiplicacao() {
		return base * altura;
	}

	public int divisao() {
		return base / altura;
	}

	public int subtracao() {
		return base - altura;
	}

	public void setTimeout(boolean timeout) {
		this.timeout = timeout;
	}

}
