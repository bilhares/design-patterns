package capitulo3;

import capitulo1.Orcamento;
import capitulo1.RegrasDeCalculo;

public abstract class TemplateImpostoCondicional implements RegrasDeCalculo {

	@Override
	public void realizaCalculo(Orcamento orcamento) {

		if (deveUsarMaximaTaxacao(orcamento)) {
			System.out.println(maximaTaxacao(orcamento));
		} else {
			System.out.println(minimaTaxacao(orcamento));
		}

	}

	public abstract String minimaTaxacao(Orcamento orcamento);

	public abstract String maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
