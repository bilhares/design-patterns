package capitulo2;

import capitulo1.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.7;
		} else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		// TODO Auto-generated method stub

	}
}
