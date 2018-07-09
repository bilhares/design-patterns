package capitulo3;

import java.util.Optional;

import capitulo1.Orcamento;
import capitulo2.Item;

public class IKCV extends TemplateImpostoCondicional{

	private boolean temItemMaiorQueCemReais(Orcamento orcamento) {
		boolean ret = false;
		Optional<Item> findAny = orcamento.getItens().stream().filter(x -> x.getValor() > 100).findAny();

		if (findAny != null) {
			ret = true;
		}

		return ret;
	}

	@Override
	public String minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
		return String.valueOf(orcamento.getValor() * 0.06);
	}

	@Override
	public String maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return String.valueOf(orcamento.getValor() * 0.10);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500 && temItemMaiorQueCemReais(orcamento);
	}
}