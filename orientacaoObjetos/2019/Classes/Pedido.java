
public class Pedido {
	private Itens[] itens;
	private Cliente cliente;
	private int numeroDoPedido;
	private static int contadorDePedidos;
	
	public Pedido(Itens[] itens, Cliente cliente) {
		this.itens = itens;
		this.cliente = cliente;
		this.numeroDoPedido = contadorDePedidos++;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Itens[] getItens() {
		return itens;
	}

	public int getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public double getValorTotal() {
		double resultado = 0.0;
		for(Itens item : itens) {
			resultado += item.getSubTotal();
		}
		
		return resultado;
	}
	
	public String toString() {
		String lista = "[";
		for(Itens item : itens) {
			lista += item.toString() +", ";
		}
		lista += "]";
		
		return "["+cliente+ "], Itens: ["+lista+"]";
	}
	
}
