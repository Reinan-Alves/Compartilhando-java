

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		/*criar uma classe chamada desafio conversao
		pegar 3 string com metodo scanner
		para representar os 3 ultimos salarios de um funcionario
		calcular a media
		aceitar tanto "." como ","*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("informe valor do sal�rio");
		String ultimo_salario = scan.nextLine().replace(",", ".");
		System.out.println("informe valor do sal�rio");
		String penultimo_salario = scan.nextLine().replace(",", ".");;
		System.out.println("informe valor do sal�rio");
		String antepenultimo_salario = scan.nextLine().replace(",", ".");;
		
		
		double media = (Double.parseDouble(ultimo_salario) + 
				Double.parseDouble(penultimo_salario) +
				Double.parseDouble(antepenultimo_salario))/3;
		
		System.out.printf("Media dos ultimos sal�rios %2f: ", media);
		scan.close();
	}

}
