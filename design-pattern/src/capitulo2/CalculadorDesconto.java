package capitulo2;

import capitulo1.Orcamento;

public class CalculadorDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);

		return d1.desconta(orcamento);
	}
	
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(600);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 251.0));
		orcamento.adicionaItem(new Item("LAPIS", 251.0));
		orcamento.adicionaItem(new Item("LAPIS", 251.0));
		orcamento.adicionaItem(new Item("LAPIS", 251.0));
		orcamento.adicionaItem(new Item("LAPIS", 251.0));
		
		double calcula = new CalculadorDesconto().calcula(orcamento);
		
		System.err.println(calcula);
	}
}
