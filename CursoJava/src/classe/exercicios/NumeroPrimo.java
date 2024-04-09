package classe.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

	/** Função que recebe um número como argumento e retorna os números "Primos" até ele.*/
	
	private static boolean ePrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();

		for (int i = 2; i <= numero; i++) {
			if (ePrimo(i))
				System.out.println(i + " é primo.");
		}

		scanner.close();
	}
}