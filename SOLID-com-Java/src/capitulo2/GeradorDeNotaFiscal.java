package capitulo2;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoAposGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;

	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for (AcaoAposGerarNota acaoAposGerarNota : acoes) {
			acaoAposGerarNota.executa(nf);
		}

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}

	public static void main(String[] args) {
		
		List<AcaoAposGerarNota> acoes = new ArrayList<>();
		acoes.add(new EnviadorDeEmail());
		acoes.add(new NotaFiscalDao());

		Fatura fatura = new Fatura();
		fatura.setCliente("Felipe");
		fatura.setValorMensal(10);
		
		new GeradorDeNotaFiscal(acoes).gera(fatura);
	}
}