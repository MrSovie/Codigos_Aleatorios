package exercicio2;

public class Retangulo {

	private int x;
	private int y;
	private int largura;
	private int altura;

	public Retangulo() {
		this.x = 0;
		this.y = 0;
		this.largura = 0;
		this.altura = 0;
	}

	public Retangulo(int x, int y, int largura, int altura) {
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}

	public boolean validaPonto(int x, int y) {
		boolean resultado = false;

		if (x > this.x && x < (this.x + this.largura)) {
			if (y > this.y && y < (this.y + this.altura)) {
				resultado = true;
			}
		}
		return resultado;
	}

	public double calculaArea() {
		return (this.largura * this.largura);
	}
	
	public double calculaPerimetro() {
		return (this.altura * 2) + (this.largura * 2);
	}

	@Override
	public String toString() {
		return "Retangulo [x=" + x + ", y=" + y + ", largura=" + largura + ", altura=" + altura + "]";
	}
}
