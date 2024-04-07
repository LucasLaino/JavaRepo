package classe;

public class CalculoProduto {

	/**
	 * Classe Produto com os seguintes atributos: Nome do produto,
	 * Preço do produto, Id do produto e Desconto a ser aplicado no produto. Possui
	 * um método que calcula o preço do produto com desconto. Realiza um reajuste
	 * no atributo Desconto de forma que altere o desconto em todos os outros
	 * produtos.
	 */
	
	String nomeDoProduto;
	double precoDoProduto;
	int idDoProduto;
	static double descontoDoProduto = 0.8;

	public void calcDesc() {
		double precoComDesconto = this.precoDoProduto * descontoDoProduto;
		System.out.println("Preco com Desconto: " + precoComDesconto);
	}

	public static void main(String[] args) {
		CalculoProduto produto = new CalculoProduto();
		produto.precoDoProduto = 17.2;
		produto.calcDesc();

	}
}