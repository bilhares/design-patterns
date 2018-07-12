package capitulo11;

public class Programa {
	public static void main(String[] args) {
		
		Expressao direita = new Subtracao(new Numero(10), new Numero(5));
		Expressao esquerda = new Soma(new Numero(54), new Numero(20));
		
		Expressao soma = new Soma(esquerda, direita);
		
		int resultado = soma.avalia();
		
		System.out.println(resultado);
		
		ImpressoraVisistor impressora = new ImpressoraVisistor();
		
		soma.aceita(impressora);
	}
}
