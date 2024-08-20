//348
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        double[][] grades = new double[5][2];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            names[i] = scanner.nextLine();

            System.out.println("Digite a primeira nota do aluno " + (i + 1) + ":");
            grades[i][0] = scanner.nextDouble();

            System.out.println("Digite a segunda nota do aluno " + (i + 1) + ":");
            grades[i][1] = scanner.nextDouble();

            scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            double average = (grades[i][0] + grades[i][1]) / 2;
            System.out.println("Aluno: " + names[i] + ", Nota 1: " + grades[i][0] + ", Nota 2: " + grades[i][1] + ", Média: " + average);
        }

        scanner.close();
    }
}