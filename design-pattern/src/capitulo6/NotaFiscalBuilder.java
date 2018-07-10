package capitulo6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItems = new ArrayList<>();
	private double valorBruto;
	private double imposto;
	private String obs;
	private Calendar daata;

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;

	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItens(ItemDaNota item) {
		todosItems.add(item);
		valorBruto += item.getValor();
		imposto += item.getValor() * 0.5;
		return this;
	}

	public NotaFiscalBuilder comObservacao(String obs) {
		this.obs = obs;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.daata = Calendar.getInstance();
		return this;

	}

	public NotaFiscal constoi() {
		return new NotaFiscal(razaoSocial, cnpj, daata, valorBruto, imposto, todosItems, obs);
	}
}
