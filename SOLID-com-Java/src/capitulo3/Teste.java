package capitulo3;

public class Teste {
	public static void main(String[] args) {
		TabelaDePreco tabela = new TabelaDePrecoDiferenciada();
		ServicoDeEntrega entrega = new Frete();
		Compra produto = new Compra();

		new CalculadoraDePrecos(tabela, entrega).calcula(produto);
	}
}
