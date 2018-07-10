package capitulo6;

public class TesteNotaFiscal {
	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		///Method chain
		builder.paraEmpresa("TEste").comCnpj("0000/0000").comItens(new ItemDaNota("Item 0", 200))
				.comItens(new ItemDaNota("Item 1", 300)).comItens(new ItemDaNota("Item 2", 400))
				.comItens(new ItemDaNota("Item 3", 500)).comItens(new ItemDaNota("Item 4", 600))
				.comItens(new ItemDaNota("Item 5", 700)).comObservacao("obs").naDataAtual();

		NotaFiscal nf = builder.constoi();

		System.out.println(nf.getValorBruto());
	}
}
