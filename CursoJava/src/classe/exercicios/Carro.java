package classe.exercicios;

public class Carro {
	
	/**
	 * Classe Carro com os seguintes atributos: Nome do fabricante,
	 * Modelo do carro, Ano do Carro. Essa classe possui um construtor. Altera
	 * os atributos para serem privados e possui os métodos get e set para cada
	 * atributo. Possui um método apresentar(), a qual imprimirá no console as
	 * informações do Carro.
	 */
	
	private String nomeFabricante;
	private String modeloDoCarro;
	private int anoDoCarro;

	public Carro(String nomeFabricante, String modeloDoCarro, int anoDoCarro) {
		this.setNomeFabricante(nomeFabricante);
		this.setModeloDoCarro(modeloDoCarro);
		this.setAnoDoCarro(anoDoCarro);
	}

	public void apresentar() {
		System.out.println("Nome da Fabricante: " + this.getNomeFabricante());
		System.out.println("Modelo do Carro: " + this.getModeloDoCarro());
		System.out.println("Ano do Carro: " + this.getAnoDoCarro());
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}

	public String getModeloDoCarro() {
		return modeloDoCarro;
	}

	public void setModeloDoCarro(String modeloDoCarro) {
		this.modeloDoCarro = modeloDoCarro;
	}

	public int getAnoDoCarro() {
		return anoDoCarro;
	}

	public void setAnoDoCarro(int anoDoCarro) {
		this.anoDoCarro = anoDoCarro;
	}

	public static void main(String[] args) {
		Carro carro = new Carro("Volks", "Teste", 2018);
		carro.apresentar();
	}
}