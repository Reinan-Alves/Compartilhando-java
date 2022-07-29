package desafiodatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EstudosSobreDatas {
	
	
	/*
	 * Para o desenvolvimento deste resumo foi utilizado como refer�ncia o seguinte artigo:
	 * https://www.devmedia.com.br/como-manipular-datas-com-o-java-8/34135
	 */

	public static void main(String[] args) {
		
		

		// Padr�o de Formata��o
		DateTimeFormatter formatacaoDeData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// Passando uma data Por parametro
		LocalDate dataRecebida = LocalDate.of(2010, 3, 7);
		System.out.println("Data recebida atrav�s de parametro com o LocalDate: " + dataRecebida);

		System.out.println();

		// Capturando a data local
		LocalDate dataLocal = LocalDate.now();
		// Impress�o da data Formatada
		System.out.println("Data atual no formato dd/mm/aaaa: " + dataLocal.format(formatacaoDeData));
		System.out.println();

		// Separando Dia,M�s e ano em Variaveis

		int diaDaSemanaNumero = dataLocal.getDayOfWeek().ordinal();
		String diaDaSemanaNome = dataLocal.getDayOfWeek().name();
		int diaDoMes = dataLocal.getDayOfMonth();
		int mesNumero = dataLocal.getMonthValue();
		String mesNome = dataLocal.getMonth().name();
		int ano = dataLocal.getYear();

		System.out.println("N�mero que representa o dia da semana: " + diaDaSemanaNumero);
		System.out.println("Nome que representa o dia da semana: " + diaDaSemanaNome);
		System.out.println("N�mero que representa o dia do m�s: " + diaDoMes);
		System.out.println("N�mero que representa o m�s: " + mesNumero);
		System.out.println("Nome do M�s:  " + mesNome);
		System.out.println("Ano: " + ano);

		System.out.println();

		// Compara��o entre datas

		System.out.println("A data recebida igual a data atual? " + dataRecebida.isEqual(dataLocal));
		System.out.println("A data recebida � posterior a data atual? " + dataRecebida.isAfter(dataLocal));
		System.out.println("A data recebida � anterior a data atual? " + dataRecebida.isBefore(dataLocal));

		System.out.println();

		Period periodo = Period.between(dataRecebida, dataLocal);
		System.out.println("Diferen�a entre a data recebida e data atual: " + periodo.getYears() + " Anos "
				+ periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");


		System.out.println();
		System.out.println("Adi��o de (+5) na data atual:");
		System.out.println();

		// Adicionando dias
		System.out.println("Adicionando dias: " + dataLocal.plusDays(5).format(formatacaoDeData));
		// Adicionando meses
		System.out.println("Adicionando meses: " + dataLocal.plusMonths(5).format(formatacaoDeData));
		// Adicionando anos
		System.out.println("Adicionando anos: " + dataLocal.plusYears(5).format(formatacaoDeData));

		System.out.println();
		System.out.println("Subtra��o de (-5) na data atual:");
		System.out.println();

		// Adicionando dias
		System.out.println("Subtraindo dias: " + dataLocal.minusDays(5).format(formatacaoDeData));
		// Adicionando meses
		System.out.println("Subtraindo meses: " + dataLocal.minusMonths(5).format(formatacaoDeData));
		// Adicionando anos
		System.out.println("Subtraindo anos: " + dataLocal.minusYears(5).format(formatacaoDeData));

		System.out.println();

		
		
		
		
		// trabalhando com horas
		
		
		

		// Capturando
		LocalDateTime dataHoraLocal = LocalDateTime.now();
		// imprimindo hora Local
		System.out.println("Data e Hora Padr�o Sistema: " + dataHoraLocal);

		// *NOTA: OS MEDOTOS UTILIZADOS PARA MANIPULA��O DE DATA, PODEM SER USADOS PARA
		// MANIPULAR HORA

		// Formata��o
		DateTimeFormatter formatacaoDeDataEHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		// Impress�o Formatada

		System.out.println("Data e hora formatada: " + dataHoraLocal.format(formatacaoDeDataEHora));

		// Impress�o da Hora de maneira separada em Segundos/minutos/hora
		
		
		System.out.println("Retornado os segundos: " + dataHoraLocal.getSecond());
		System.out.println("Retornado os minutos: " + dataHoraLocal.getMinute());
		System.out.println("Retornado as horas: " + dataHoraLocal.getHour());
		
		// Adi��o de tempo 
		System.out.println();
		System.out.println("Adicionando tempo na data atual:");
		System.out.println();

		System.out.println("Data e hora formatada: " + dataHoraLocal.format(formatacaoDeDataEHora));
		
		// Adicionando Segundos
		System.out.println("Adicionando 20 segundos: "+ dataHoraLocal.plusSeconds(20).format(formatacaoDeDataEHora));
		// Adicionando Minutos
		System.out.println("Adicionando 10 minutos: " + dataHoraLocal.plusMinutes(10).format(formatacaoDeDataEHora));
		// Adicionando Horas
		System.out.println("Adicionando 2 Horas: " + dataHoraLocal.plusHours(2).format(formatacaoDeDataEHora));

		System.out.println();
		System.out.println("Subtraindo tempo da data atual:");
		System.out.println();

		System.out.println("Data e hora formatada: " + dataHoraLocal.format(formatacaoDeDataEHora));
		
		// Subtraindo Segundos
		System.out.println("Subtraindo 20 segundos: " + dataHoraLocal.minusSeconds(20).format(formatacaoDeDataEHora));
		// Subtraindo Minutos
		System.out.println("Subtraindo 10 minutos: " + dataHoraLocal.minusMinutes(10).format(formatacaoDeDataEHora));
		// Subtraindo Horas
		System.out.println("Subtraindo 2 Horas: " + dataHoraLocal.minusHours(2).format(formatacaoDeDataEHora));
		
		
	}
	
	
}
