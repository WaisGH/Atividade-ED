//346

import java.util.Scanner;

public class Espelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nMENU\n1 - Imprime o comprimento da frase\n2 - Imprime os dois primeiros e os dois últimos caracteres da frase\n3 - Imprime a frase espelhada\n4 - Termina o algoritmo");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Comprimento da frase: " + frase.length());
                    break;
                case 2:
                    if (frase.length() >= 4) {
                        System.out.println("Dois primeiros caracteres: " + frase.substring(0, 2));
                        System.out.println("Dois últimos caracteres: " + frase.substring(frase.length() - 2));
                    } else {
                        System.out.println("A frase precisa ter pelo menos 4 caracteres.");
                    }
                    break;
                case 3:
                    String fraseEspelhada = new StringBuilder(frase).reverse().toString();
                    System.out.println("Frase espelhada: " + fraseEspelhada);
                    break;
                case 4:
                    System.out.println("Terminando o algoritmo.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}