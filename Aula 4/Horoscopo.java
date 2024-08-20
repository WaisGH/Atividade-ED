//360
import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite sua data de nascimento (ddmm) ou 9999 para sair:");
            int data = scanner.nextInt();

            if (data == 9999) {
                break;
            }

            int dia = data / 100;
            int mes = data % 100;

            if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                System.out.println("Aquário");
            } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                System.out.println("Peixes");
            } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                System.out.println("Áries");
            } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                System.out.println("Touro");
            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                System.out.println("Gêmeos");
            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                System.out.println("Câncer");
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                System.out.println("Leão");
            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                System.out.println("Virgem");
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                System.out.println("Libra");
            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                System.out.println("Escorpião");
            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                System.out.println("Sagitário");
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                System.out.println("Capricórnio");
            }
        }

        scanner.close();
    }
}