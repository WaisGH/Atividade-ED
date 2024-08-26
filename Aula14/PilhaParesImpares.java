package Aula14;

import java.util.Scanner;
import java.util.Stack;

public class PilhaParesImpares {
    public static void main(String[] args) {
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int numero;


        System.out.println("Digite números inteiros de -127 a 128 (0 para terminar):");
        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero >= -127 && numero <= 128) {
                if (numero % 2 == 0) {
                    pilhaPar.push(numero);
                } else {
                    pilhaImpar.push(numero);
                }
            } else {
                System.out.println("Número fora do intervalo permitido (-127 a 128). Tente novamente.");
            }
        }


        System.out.println("\nRemovendo elementos das pilhas:");
        while (!pilhaImpar.isEmpty() && !pilhaPar.isEmpty()) {
            if (!pilhaImpar.isEmpty()) {
                System.out.println("Removido da pilha impar: " + pilhaImpar.pop());
            }
            if (!pilhaPar.isEmpty()) {
                System.out.println("Removido da pilha par: " + pilhaPar.pop());
            }
        }

  
        if (!pilhaImpar.isEmpty()) {
            System.out.println("\npilha impar ainda possui elementos:");
            imprimirElementosRestantes(pilhaImpar);
        } else if (!pilhaPar.isEmpty()) {
            System.out.println("\npilha par ainda possui elementos:");
            imprimirElementosRestantes(pilhaPar);
        } else {
            System.out.println("\nNenhuma pilha possui elementos restantes.");
        }

        scanner.close();
    }


    private static void imprimirElementosRestantes(Stack<Integer> pilha) {
        System.out.println("Quantidade de elementos restantes: " + pilha.size());
        System.out.println("Elementos restantes: " + pilha);
    }
}
