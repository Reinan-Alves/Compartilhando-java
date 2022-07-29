package refatoracaofabio;
import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {

		/**
		 * Usuario informa ponto A(x,y) e B(x,y) Calcular dist�ncia Sendo dist�ncia =
		 * raiz de ((bX - aX)� + (bY - aY)�)
		 * 
		 **/

		double xPontoA, yPontoA, xPontoB, yPontoB, pontoA, pontoB, resultado;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o eixo X do ponto A: ");
		xPontoA = scanner.nextDouble();
		
		System.out.print("Digite o eixo Y do ponto A: ");
		yPontoA = scanner.nextDouble();
		
		System.out.print("Digite o eixo X do ponto B: ");
		xPontoB = scanner.nextDouble();
		
		System.out.print("Digite o eixo Y do ponto A: ");
		yPontoB = scanner.nextDouble();
		scanner.close();
		
		calculoDistanciaEntrePontosCartesianos calculo = new calculoDistanciaEntrePontosCartesianos();
		
		pontoA = calculo.pontoA(xPontoA, yPontoA);
		pontoB = calculo.pontoB(xPontoB, yPontoB);
		
		resultado = calculo.distanciaEntreEixo(pontoA, pontoB);
		
		System.out.printf("O resultado � : %.2f", resultado);
		
	}

}
