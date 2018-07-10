package capitulo1;

public enum Impostos {
	ICMS(new ICMS()), 
	ISS(new ISS());

	private RegrasDeCalculo regra;

	Impostos(RegrasDeCalculo regra) {
		this.regra = regra;
	}

	public RegrasDeCalculo getRegra() {
		return regra;
	}

}
