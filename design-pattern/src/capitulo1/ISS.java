package capitulo1;

public class ISS implements RegrasDeCalculo{

	public void realizaCalculo(Orcamento orcamento) {

		double iss = orcamento.getValor() * 0.6;
		System.out.println(iss);

	}
}
