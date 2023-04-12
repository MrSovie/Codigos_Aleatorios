package exercicio2;

import java.util.Scanner;

public class TesteMain {

	public static void main(String[] args) {
		Circunferencia c1 = new Circunferencia(6, 7, 5);

		boolean teste = c1.validaPonto(2, 2);
		System.out.println(teste);

		try (Scanner dados = new Scanner(System.in)) {
			System.out.println("Testando  Cincuferencia");
			System.out.println("Entre com os pontos x, y e o raio\nX: ");
			int x = dados.nextInt();
			System.out.println("Y: ");
			int y = dados.nextInt();
			System.out.println("Raio: ");
			int raio = dados.nextInt();
			Circunferencia c2 = new Circunferencia(x, y, raio);
			c2.calculaArea();
			c2.calculaPerimetro();
			System.out.println("Teste do valida ponto entre com os pontos x e y:");
			System.out.println("X: ");
			int vx = dados.nextInt();
			System.out.println("Y: ");
			int vy = dados.nextInt();
			System.out.println(c2.validaPonto(vx, vy));

			System.out.println("Testando  Retangulo");
			System.out.println("Entre com os pontos x, y, altura e largura\nX: ");
			x = dados.nextInt();
			System.out.println("Y: ");
			y = dados.nextInt();
			
			
			
			System.out.println("Altura: ");
			int altura = dados.nextInt();
			System.out.println("Largura: ");
			int largura = dados.nextInt();
			Retangulo r1 = new Retangulo(x, y, altura, largura);
			r1.calculaArea();
			r1.calculaPerimetro();
			r1.toString();
			System.out.println("Teste do valida retangulo ponto entre com os pontos x e y:");
			System.out.println("X: ");
			vx = dados.nextInt();
			System.out.println("Y: ");
			vy = dados.nextInt();
			System.out.println(r1.validaPonto(vx, vy));

			System.out.println("Entre com seu cpf\nNúmero: ");

			String numero = dados.next();

			System.out.println("Valida: ");

			String valida = dados.next();

			Cpf p1 = new Cpf(numero, valida);

			System.out.println(p1.validaCPF());
		}
	}
}
