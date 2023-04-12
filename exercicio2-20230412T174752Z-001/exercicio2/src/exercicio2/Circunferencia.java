package exercicio2;

public class Circunferencia {

	private int x;
	private int y;
	private int raio;
	
	static double PI = 3.1416;
	
	public Circunferencia() {
		this.x = 0;
		this.y = 0;
		this.raio = 0;
	}
	
	public Circunferencia(int x, int y, int raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	public boolean validaPonto(int xp, int yp) {
		boolean resultado = false;
		double raiopx = Math.sqrt(Math.pow((xp - this.x), 2) + (Math.pow((xp - y), 2)));
		if(raiopx < this.raio) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public double calculaArea() {
		return PI *(Math.pow(raio, 2)) ;
	}
	
	public double calculaPerimetro() {
		return 2 * PI * this.raio;
	}

	@Override
	public String toString() {
		return "Circunferencia [x=" + x + ", y=" + y + ", raio=" + raio + "]";
	}
	
}
