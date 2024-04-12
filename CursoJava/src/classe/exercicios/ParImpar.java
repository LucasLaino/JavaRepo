package classe.exercicios;

public class ParImpar {

	/**
	 * Classe ParImpar que contem um método que imprime em tela a soma
	 * dos números pares de 0 a 30 e a multiplicação dos números ímpares de 0 a 30.
	 */
	
	public static void sumImparMultiPar() {
		long par = 0;
		int impar = 0;

		for (int i = 0; i < 30; i++) {
			if (i % 2 == 0) {
				if (i > 2) {
					par = par * i;
				} else {
					par = i;
				}
			} else {
				impar = impar + i;
			}
		}

		System.out.println(par);
		System.out.println(impar);
	}

	public static void main(String[] args) {
		sumImparMultiPar();
	}		
}