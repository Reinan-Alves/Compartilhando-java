package desafiodatas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("A aplicação informa a data e hora Local;");
		System.out.println("Usuário informa o tempo futuro ou anterior;");
		System.out.println("A aplicação retorna a data com base nas informações passadas;");
		System.out.println();
		
		 LocalDateTime dataHoraLocal = LocalDateTime.now();
		 String operador;
		 long ano,mes,dia,hora,minuto;
	
		Scanner entrada = new Scanner(System.in);

		DateTimeFormatter formatacaoDeDataEHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Data e hora local: " + dataHoraLocal.format(formatacaoDeDataEHora));
		System.out.println();

		do {
			System.out.print("Digite '+' para adicionar ou '-' para subtrair tempo em sua data: ");
			operador = entrada.nextLine();
			System.out.println();
			System.out.println("Digite valores inteiros para alterar ou '0' para manter o valor do campo");
			System.out.println();
			

		} while (!(operador.equals("+") || operador.equals("-")));
		
		String complementoDeTexto = operador.equals("+") ? "Adicionar" : "Subtrair";

		System.out.printf("%s anos :",complementoDeTexto);
		ano = entrada.nextLong();
		System.out.printf("\n%s meses :",complementoDeTexto);
		mes = entrada.nextLong();
		System.out.printf("\n%s dias :",complementoDeTexto);
		dia = entrada.nextLong();
		System.out.printf("\n%s horas :",complementoDeTexto);
		hora = entrada.nextLong();
		System.out.printf("\n%s minutos: ",complementoDeTexto);
		minuto = entrada.nextLong();
		System.out.println();

		if (operador.equals("+")) {
			System.out.println("Sua data e hora local: " + dataHoraLocal.format(formatacaoDeDataEHora));
			System.out.println("Sua data e hora futura: " + dataHoraLocal
					.plusYears(ano)
					.plusMonths(mes)
					.plusDays(dia)
					.plusHours(hora)
					.plusMinutes(minuto)
					.format(formatacaoDeDataEHora));

		}

		if (operador.equals("-")) {
			System.out.println("Sua data e hora local: " + dataHoraLocal.format(formatacaoDeDataEHora));
			System.out.println("Sua data e hora passada: " + dataHoraLocal
					.minusYears(ano)
					.minusMonths(ano)
					.minusDays(ano)
					.minusHours(ano)
					.minusMinutes(ano)
					.format(formatacaoDeDataEHora));
		}
		entrada.close();

	}
}
