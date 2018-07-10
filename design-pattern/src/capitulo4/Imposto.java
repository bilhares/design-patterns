package capitulo4;

import capitulo1.Orcamento;

public abstract class Imposto {

	protected Imposto outroimposto;

	public Imposto(Imposto outroimposto) {
		outroimposto = outroimposto;
	}

	public Imposto() {
	}

	public abstract double calcula(Orcamento orcamento);

}
