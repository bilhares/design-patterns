package capitulo11;

public class Subtracao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Subtracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorEsquerda = esquerda.avalia();
		int valorDireita = direita.avalia();

		return valorEsquerda - valorDireita;
	}

	public Expressao getDireita() {
		return direita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSubtracao(this);

	}
}
