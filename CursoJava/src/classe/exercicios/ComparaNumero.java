package classe.exercicios;

import java.util.Scanner;

public class ComparaNumero {

	/**
	 * Classe ComparaNumero que contem um método que recebe dois
	 * números e indica se são iguais ou se são diferentes. Mostra o maior número e
	 * o menor número(nesta sequência).
	 */
	
	public static void compara(int a, int b) {
		if (a == b) {
			System.out.printf("O numero " + a + " é igual ao numero " + b);
		} else if (a > b) {
			System.out.printf("\nO numero " + a + " é o maior numero");
			System.out.printf("\nO numero " + b + " é o menor numero");
		} else {
			System.out.printf("\nO numero " + b + " é o maior numero");
			System.out.printf("\nO numero " + a + " é o menor numero");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = scanner.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();

		compara(num1, num2);

		scanner.close();
	}	
}