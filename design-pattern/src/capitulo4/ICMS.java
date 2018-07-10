package capitulo4;

import capitulo1.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto outroimposto) {
		super(outroimposto);
	}
	
	public ICMS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.1 +  caculoDoOutroImposto(orcamento);
	}

	private double caculoDoOutroImposto(Orcamento orcamento) {
		if (outroimposto == null)
			return 0;
		return outroimposto.calcula(orcamento);
	}
}
