package capitulo13;

public class Programa {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido("Mauricio", 250);
		Pedido pedido2 = new Pedido("Felipe", 800);

		FilaDeTrabalho fila = new FilaDeTrabalho();

		fila.adiciona(new PagaPedido(pedido1));

		fila.adiciona(new PagaPedido(pedido2));
		
		fila.adiciona(new ConcluiPedido(pedido1));
	}

}
