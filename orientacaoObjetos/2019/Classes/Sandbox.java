
public class Sandbox {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua do Matao", "Butanta", "Sao Paulo", "SP", "Brasil", "05632020", "1010", "Bloco B - Sala 101");
		Cliente gustavo = new Cliente("Gustavo", "32021784827", endereco);
		
		Produto leite = new Produto("leite", 4.0, 10);
		Produto queijo = new Produto("queijo", 15.0, 5); 
		
		Itens[] itens = new Itens[] { 
				new Itens(leite),
				new Itens(2, queijo)
		};
		
		Pedido pedido = new Pedido(itens, gustavo);
		
		System.out.println(pedido.getValorTotal() == 34.0);
		
		
		
		
		
		Itens[] outrosItens = new Itens[] {
				new Itens(2, leite)
		};
		
		Pedido outroPedido = new Pedido(outrosItens, gustavo);
		
	}
}
