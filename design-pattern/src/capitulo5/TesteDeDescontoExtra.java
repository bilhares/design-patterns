package capitulo5;

import capitulo1.Orcamento;

public class TesteDeDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		
		reforma.aplicaDescontoExtra();
		
		
		System.out.println(reforma.getValor());
	}
}
