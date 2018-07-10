package capitulo3;

import capitulo1.Orcamento;

public class ICPP extends TemplateImpostoCondicional {

	@Override
	public String minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return String.valueOf(orcamento.getValor() * 0.05);
	}

	@Override
	public String maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return String.valueOf(orcamento.getValor() * 0.07);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500;
	}

}
