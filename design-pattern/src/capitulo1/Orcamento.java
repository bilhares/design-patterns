package capitulo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import capitulo2.Item;
import capitulo5.EstadoOrcamento;

public class Orcamento {
	private double valor;
	// private Impostos imposto;
	private final List<Item> itens;
	public EstadoOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		// this.imposto = imposto;
		itens = new ArrayList<>();
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void calculaOrcamento() {
		// imposto.getRegra().realizaCalculo(this);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(this.itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

}
