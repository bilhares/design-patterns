package capitulo1;

public class ICMS implements RegrasDeCalculo {

	public void realizaCalculo(Orcamento orcamento) {
		double icms = orcamento.getValor() * 0.1;
		System.out.println(icms);
	}
}
