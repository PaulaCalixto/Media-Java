import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0.0;
        int contador = 0;
        System.out.println("Digite um número: ");

        while (true) {
            double numero = scanner.nextDouble();
            if (numero == 0.0) {
                break;
            }
            soma += numero;
            contador++;

            System.out.println("Deseja inserir outro número? (1 para sim, 0 para calcular a média):");
            int continuar = scanner.nextInt();
            if (continuar == 0) {
                break;
            }
        }
        scanner.close();

        if (contador == 0) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            double media = soma / contador;
            System.out.println("A média é:" + media);
        }
    }
}