package capitulo5;

import capitulo1.Orcamento;

public class EmAprovacao implements EstadoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.05);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException();	
	}
}
