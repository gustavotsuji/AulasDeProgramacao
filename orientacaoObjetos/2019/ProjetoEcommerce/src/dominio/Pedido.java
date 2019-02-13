package dominio;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<Itens> itens;
	private Cliente cliente;
	private int numeroDoPedido;
	private static int contadorDePedidos;

	public Pedido(Cliente cliente) {
		this.itens = new ArrayList<Itens>();
		this.cliente = cliente;
		this.numeroDoPedido = contadorDePedidos++;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Itens> getItens() {
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
		return "["+cliente+ "], Itens: ["+itens+"]";
	}
	
	public void adicionaItem(int quantidade, Produto produto) {
		
		if(itens.isEmpty()) {
			itens.add(new Itens(quantidade, produto));
		} else {
			for(Itens item : itens) {
				if(item.getProduto().equals(produto)) {
					int novaQuantidade = item.getQuantidade() + quantidade;
					item.setQuantidade(novaQuantidade);
					return;
				} 
			}
			itens.add(new Itens(quantidade, produto));
		}
	}
	
}
