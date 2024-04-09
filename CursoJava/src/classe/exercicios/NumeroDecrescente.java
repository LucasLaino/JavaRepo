package classe.exercicios;

import java.util.Scanner;

public class NumeroDecrescente {

	/** Classe NumeroDecrescente que contem um método que recebe um número inteiro 
	 * e imprime, em ordem decrescente, o valor do número até 0.*/
	
	public static void imprimeDecrescente(int numero) {
		int lista;
		for (int i = 0; i < numero + 1; i++) {
			lista = numero - i;
			System.out.println(lista);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();

		imprimeDecrescente(numero);

		scanner.close();
	}
}