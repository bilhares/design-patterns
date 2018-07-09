package capitulo1;

import java.time.LocalDate;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario){
		return funcionario.calcularSalario();
	}
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setCargo(Cargo.DESENVOLVEDOR);
		funcionario.setDataDeAdmissao(LocalDate.now());
		funcionario.setNome("Felipe");
		funcionario.setSalarioBase(5);
		
		double calcula = new CalculadoraDeSalario().calcula(funcionario);
		
		System.out.println("Result: "+calcula);
	}

}