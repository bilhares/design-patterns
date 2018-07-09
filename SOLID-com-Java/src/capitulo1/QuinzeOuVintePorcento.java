package capitulo1;

public class QuinzeOuVintePorcento implements RegraDeCalculo{

	@Override
	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 20) {
			return funcionario.getSalarioBase() * 4;
		} else {
			return funcionario.getSalarioBase() * 5;
		}
	}

}
