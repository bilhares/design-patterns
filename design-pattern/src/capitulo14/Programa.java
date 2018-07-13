package capitulo14;

public class Programa {

	public static void main(String[] args) {
		EmpresaFacade empresaFacade = new EmpresaFacadeSingleton().getInstancia();
		empresaFacade.buscaCliente("123");
	}

}
