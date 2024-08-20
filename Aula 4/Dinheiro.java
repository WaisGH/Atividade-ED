//358
import java.util.Scanner;

public class Dinheiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLucroMenor10 = 0;
        int countLucroEntre10e20 = 0;
        int countLucroMaior20 = 0;
        double totalCompra = 0;
        double totalVenda = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Digite o preço de compra da mercadoria " + (i + 1) + ":");
            double precoCompra = scanner.nextDouble();

            System.out.println("Digite o preço de venda da mercadoria " + (i + 1) + ":");
            double precoVenda = scanner.nextDouble();

            double lucro = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucro < 10) {
                countLucroMenor10++;
            } else if (lucro <= 20) {
                countLucroEntre10e20++;
            } else {
                countLucroMaior20++;
            }

            totalCompra += precoCompra;
            totalVenda += precoVenda;
        }

        System.out.println("Quantidade de mercadorias que proporcionam:");
        System.out.println("Lucro < 10%: " + countLucroMenor10);
        System.out.println("10% <= Lucro <= 20%: " + countLucroEntre10e20);
        System.out.println("Lucro > 20%: " + countLucroMaior20);
        System.out.println("Valor total de compra: " + totalCompra);
        System.out.println("Valor total de venda: " + totalVenda);

        scanner.close();
    }
}