package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoFarenheitCelcius {

	/** Programa que lê a temperatura em Fahrenheit e converte para Celsius. */
	
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
	
		System.out.print("Valor em Celsius: " + conversao);
		
		scanner.close();
	}
}
