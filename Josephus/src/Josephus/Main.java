package Josephus;

	import java.util.ArrayList;
	import java.util.Random;

	public class Main {

	    public static void main(String[] args) {
	        ArrayList<Pessoa> pessoas = new ArrayList<>();
	        pessoas.add(new Pessoa(1, "Alain", "123-4567", "Rua A, 123", "123.456.789-01"));
	        pessoas.add(new Pessoa(2, "Ren", "234-5678", "Rua B, 234", "234.567.890-12"));
	        pessoas.add(new Pessoa(3, "Venam", "345-6789", "Rua C, 345", "345.678.901-23"));
	        pessoas.add(new Pessoa(4, "Crescent", "456-7890", "Rua D, 456", "456.789.012-34"));
	        pessoas.add(new Pessoa(5, "Aelita", "567-8901", "Rua E, 567", "567.890.123-45"));
	        pessoas.add(new Pessoa(6, "Ryland", "678-9012", "Rua F, 678", "678.901.234-56"));
	        pessoas.add(new Pessoa(7, "Ana", "789-0123", "Rua G, 789", "789.012.345-67"));
	        pessoas.add(new Pessoa(8, "Aevis", "890-1234", "Rua H, 890", "890.123.456-78"));
	        pessoas.add(new Pessoa(9, "Aevia", "901-2345", "Rua I, 901", "901.234.567-89"));
	        pessoas.add(new Pessoa(10, "Axel", "012-3456", "Rua J, 012", "012.345.678-90"));
	        pessoas.add(new Pessoa(11, "Ariana", "112-3456", "Rua K, 112", "112.345.678-91"));
	        pessoas.add(new Pessoa(12, "Aero", "212-3456", "Rua L, 212", "212.345.678-92"));
	        pessoas.add(new Pessoa(13, "Nim", "312-3456", "Rua M, 312", "312.345.678-93"));
	        pessoas.add(new Pessoa(14, "Valarie", "412-3456", "Rua N, 412", "412.345.678-94"));
	        pessoas.add(new Pessoa(15, "Adam", "512-3456", "Rua O, 512", "512.345.678-95"));
	        pessoas.add(new Pessoa(16, "Saki", "612-3456", "Rua P, 612", "612.345.678-96"));
	        pessoas.add(new Pessoa(17, "Kanon", "712-3456", "Rua Q, 712", "712.345.678-97"));
	        pessoas.add(new Pessoa(18, "Erin", "812-3456", "Rua R, 812", "812.345.678-98"));
	        pessoas.add(new Pessoa(19, "Reina", "912-3456", "Rua S, 912", "912.345.678-99"));
	        pessoas.add(new Pessoa(20, "Huey", "012-4567", "Rua T, 012", "012.456.789-00"));


	        Random random = new Random();
	        int m = random.nextInt(pessoas.size()) + 1;

	        System.out.println("Eliminando cada " + m + "-ésima pessoa");


	        int sobrevivente = josephus(pessoas.size(), m);
	        
	        Pessoa vencedor = pessoas.get(sobrevivente);
	        System.out.println("A pessoa sobrevivente é: " + vencedor);
	    }

	    private static int josephus(int n, int m) {
	        if (n == 1) {
	            return 0;
	        }
	        return (josephus(n - 1, m) + m) % n;
	    }
}
