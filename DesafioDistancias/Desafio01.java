package DesafioDistancias;
import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {

		/**
		 * Usuario informa ponto A(x,y) e B(x,y) 
		 * Calcular dist?ncia Sendo dist?ncia =
		 * raiz de ((bX - aX)? + (bY - aY)?)
		 * 
		 **/

		double eixoAx, eixoAy, eixoBx, eixoBy;
		double distancia;

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o posi??o A no eixo x: ");
		eixoAx = scan.nextDouble();

		System.out.print("Informe o posi??o A no eixo Y: ");
		eixoAy = scan.nextDouble();

		System.out.print("Informe o posi??o B no eixo X: ");
		eixoBx = scan.nextDouble();

		System.out.print("Informe o posi??o B no eixo Y: ");
		eixoBy = scan.nextDouble();

		distancia = Math.sqrt(Math.pow(eixoBx - eixoAx, 2) + Math.pow((eixoBy - eixoAy), 2));
		System.out.println(distancia);
		scan.close();
	}

}
