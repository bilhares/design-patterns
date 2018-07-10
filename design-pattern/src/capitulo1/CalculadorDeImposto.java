package capitulo1;

public class CalculadorDeImposto {
	public void realizaCalculo(Orcamento orcamento, RegrasDeCalculo calculo) {
//		orcamento.calculaOrcamento();
		
		calculo.realizaCalculo(orcamento);
	}
	
	public static void main(String[] args) {
//		Orcamento orcamento = new Orcamento(10, Impostos.ISS);
//		new CalculadorDeImposto().realizaCalculo(orcamento);
		Orcamento orcamento = new Orcamento(10);
		new CalculadorDeImposto().realizaCalculo(orcamento, new ISS());
	}
}
