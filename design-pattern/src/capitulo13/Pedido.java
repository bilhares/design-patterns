package capitulo13;

import java.util.Calendar;

public class Pedido {
	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataFinalizado;

	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.status = status.NOVO;
	}

	public void paga() {
		status = Status.PAGO;
	}

	public void finaliza() {
		dataFinalizado = Calendar.getInstance();
		status = Status.FINALIZADO;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	
}
