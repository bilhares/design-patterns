package capitulo11;

public class Soma implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorEsquerda = esquerda.avalia();
		int valorDireita = direita.avalia();

		return valorEsquerda + valorDireita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}

	@Override
	public void aceita(ImpressoraVisistor impressora) {
		impressora.visitaSoma(this);
	}
}
