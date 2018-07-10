package capitulo5;

import capitulo1.Orcamento;

public class Aprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.05);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException();	
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException();	
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
