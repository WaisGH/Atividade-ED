//351

import java.util.Scanner;

public class Nomenumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }

        System.out.println("Digite um número de 1 a 5 para escolher uma pessoa:");
        int index = scanner.nextInt();

        if (index >= 1 && index <= 5) {
            System.out.println("O nome da pessoa " + index + " é " + names[index - 1]);
        } else {
            System.out.println("Número inválido. Deve ser entre 1 e 5.");
        }

        scanner.close();
    }
}