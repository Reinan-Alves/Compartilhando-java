package desafiodatas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Testando {
	
		
		public static void main(String [] argrs) {
			adicionaDia();
			
			
			
		}
		public static LocalDateTime adicionaDia() {
			Long maisDias;
			Scanner scan = new Scanner(System.in); 
			System.out.println("informe dias a serem adicionados:");
			maisDias = scan.nextLong();
			LocalDateTime timeLocal = LocalDateTime.now(); 
			LocalDateTime diasAdicionados = timeLocal.plusDays(maisDias);
			scan.close();
			System.out.println(diasAdicionados);
			return diasAdicionados;
		}
		
		public static String formataData() {
			 DateTimeFormatter dataFormatada1 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
			 String dataFormatada2 = dataFormatada1.format(adicionaDia());
			 System.out.println("Data formatada: " + dataFormatada2);
			 return dataFormatada2;
			// String dataFormatada3 = exibiTempo().toString();
		}

}
