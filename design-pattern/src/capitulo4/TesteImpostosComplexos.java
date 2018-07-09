package capitulo4;

import capitulo4.ISS;
import capitulo1.Orcamento;
import capitulo4.Imposto;

public class TesteImpostosComplexos {

	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS());

		Orcamento orcamento = new Orcamento(500);
		
		
		double calcula = iss.calcula(orcamento);
		
		System.out.println(calcula);
	}

}
 