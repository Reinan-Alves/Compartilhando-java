import java.util.Scanner;

public class TestandoReceberSalarioFabio {
	
	static Scanner scanner = new Scanner(System.in);
    static double[] salarios = new double[3];
    static double mediaSalarial = 0;
    static String opcao = "S";

    static boolean validarDados = true;

    public static void main(String[] args) {
        do {
            if (salarios[0] > 0) {
                recalcular();
            }
            receberDados();
            calcularMedia();

        } while (!opcao.equals("N"));
    }

    public static void receberDados() {
        double aux = 0.0;
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite o " + (i + 1) + "� sal�rio: ");
            aux = validacaoDeEntrada(scanner.next());
            //aux = scanner.nextDouble();
            salarios[i] = aux;
        }
    }

    public static double validacaoDeEntrada(String valor) {
        String aux = "";
        double resultado = 0.0;
        for(int i=0; i<valor.length();i++){
            if(valor.charAt(i) == ','){
                aux = aux + '.';
            }else{
                aux = aux + valor.charAt(i);
            }
        }
        resultado = Double.parseDouble(aux);
        return resultado;
    }


    public static void calcularMedia() {
        mediaSalarial = (salarios[0] + salarios[1] + salarios[2]) / 3;
        System.out.printf("A m�dia sal�rial � de R$%.2f\n\n", mediaSalarial);
    }

    public static void recalcular() {
        System.out.println("Deseja recalcular ? \nDigite a op��o desejada: ");
        System.out.println("S - Sim     N - N�o");
        opcao = scanner.next();

        if (opcao.equals("N") || opcao.equals("n")) {
            System.exit(0);
        }
    }

}
