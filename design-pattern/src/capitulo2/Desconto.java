package capitulo2;

import capitulo1.Orcamento;

public interface Desconto {
	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);
}
