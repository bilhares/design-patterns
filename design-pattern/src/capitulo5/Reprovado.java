package capitulo5;

import capitulo1.Orcamento;

public class Reprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("nao pode ser reprovado!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reprova(Orcamento orcamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub

	}

}
