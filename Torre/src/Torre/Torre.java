package Torre;

import java.util.Scanner;

public class Torre {
    
    private static long contadorMovimentos = 0;
    
    public static void resolverHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            contadorMovimentos++;
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }
        resolverHanoi(n - 1, origem, auxiliar, destino);
        contadorMovimentos++;
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        resolverHanoi(n - 1, auxiliar, destino, origem);
    }
    
    public static void calcularTempoEExecutar(int n) {
        contadorMovimentos = 0;

        resolverHanoi(n, 'A', 'C', 'B');

        long tempoEmMilissegundos = contadorMovimentos / 1000;

       
        long horas = tempoEmMilissegundos / 3600000;
        long minutos = (tempoEmMilissegundos % 3600000) / 60000;
        long segundos = (tempoEmMilissegundos % 60000) / 1000;
        long milissegundos = tempoEmMilissegundos % 1000;

        String tempoGasto = String.format("%02d:%02d:%02d:%03d", horas, minutos, segundos, milissegundos);

        System.out.println("Número de discos: " + n);
        System.out.println("Número de movimentos: " + contadorMovimentos);
        System.out.println("Tempo gasto: " + tempoGasto);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de discos: ");
        int n = scanner.nextInt();
        
        calcularTempoEExecutar(n);
        
        scanner.close();
    }
}
