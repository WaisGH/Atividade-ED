package mil;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        Random rand = new Random();
        
        
        for (int i = 0; i < 1000; i++) {
            numbers[i] = rand.nextInt(19999) - 9999;
        }

        System.out.println("Números na ordem de geração:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

       
        ListaDupEnc list = new ListaDupEnc();

        
        for (int num : numbers) {
            list.Ordem(num);
        }

        System.out.println("Lista em ordem crescente:");
        list.Subindo();

        System.out.println("Lista em ordem decrescente:");
        list.Descendo();
    }
}