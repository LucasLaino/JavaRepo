package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {

	/** Programa que lê o peso e a altura do usuário e imprime no console o IMC. */
	
	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso:");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a altura:");
		double altura = scanner.nextDouble();
		
		double imc = peso / ( altura * altura );
		
		System.out.print("IMC: " + imc);
		
		scanner.close();
	}
}
