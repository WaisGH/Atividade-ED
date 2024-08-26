package Aula14;

import java.util.Random;
import java.util.Stack;

public class ManipulacaoPilha {
    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();

        
        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(9) + 1; 

            if (numero >= 1 && numero <= 3) {
                pilha1.push(numero);
            } else if (numero >= 4 && numero <= 6) {
                pilha2.push(numero);
            } else {
                pilha3.push(numero);
            }
        }

        System.out.println("Pilha 1 após fase 1: " + pilha1);
        System.out.println("Pilha 2 após fase 1: " + pilha2);
        System.out.println("Pilha 3 após fase 1: " + pilha3);

        for (int i = 0; i < 100; i++) {
            int escolhaPilha = random.nextInt(3) + 1;


            if (pilha1.isEmpty() || pilha2.isEmpty() || pilha3.isEmpty()) {
                break;
            }

          
            switch (escolhaPilha) {
                case 1:
                    if (!pilha2.isEmpty() && !pilha3.isEmpty()) {
                        int topoPilha2 = pilha2.pop();
                        int topoPilha3 = pilha3.pop();
                        pilha1.push(topoPilha3);
                        pilha1.push(topoPilha2);
                        System.out.println("Empilhando os números " + topoPilha2 + " e " + topoPilha3 + " na pilha 1");
                    }
                    break;
                case 2:
                    if (!pilha1.isEmpty() && !pilha3.isEmpty()) {
                        int topoPilha1 = pilha1.pop();
                        int topoPilha3 = pilha3.pop();
                        pilha2.push(topoPilha3);
                        pilha2.push(topoPilha1);
                        System.out.println("Empilhando os números " + topoPilha1 + " e " + topoPilha3 + " na pilha 2");
                    }
                    break;
                case 3:
                    if (!pilha1.isEmpty() && !pilha2.isEmpty()) {
                        int topoPilha1 = pilha1.pop();
                        int topoPilha2 = pilha2.pop();
                        pilha3.push(topoPilha2);
                        pilha3.push(topoPilha1);
                        System.out.println("Empilhando os números " + topoPilha1 + " e " + topoPilha2 + " na pilha 3");
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nPilha 1 final: " + pilha1);
        System.out.println("Pilha 2 final: " + pilha2);
        System.out.println("Pilha 3 final: " + pilha3);

        if (pilha1.isEmpty()) {
            System.out.println("\nO programa foi encerrado porque a pilha 1 está vazia.");
        } else if (pilha2.isEmpty()) {
            System.out.println("\nO programa foi encerrado porque a pilha 2 está vazia.");
        } else if (pilha3.isEmpty()) {
            System.out.println("\nO programa foi encerrado porque a pilha 3 está vazia.");
        } else {
            System.out.println("\nO programa foi encerrado porque o limite de 100 operações foi atingido.");
        }
    }
}

