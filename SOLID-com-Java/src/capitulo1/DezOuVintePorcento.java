package capitulo1;

public class DezOuVintePorcento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 10) {
			return funcionario.getSalarioBase() * 2;
		} else {
			return funcionario.getSalarioBase() * 3;
		}
	}

}
