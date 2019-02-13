import java.util.Scanner;

import dominio.*;

public class Sandbox {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Endereco endereco = cadastraEndereco();
		Cliente cliente = cadastraCliente(endereco);
		Produto produto1 = new Produto("Banana", 4, 10);
		Produto produto2 = new Produto("Tomate", 10, 20);
		Pedido novoPedido = cadastraPedido(produto1, produto2, cliente);
		
		System.out.println(novoPedido);
	}
	
	private static Pedido cadastraPedido(Produto produto1, Produto produto2, Cliente cliente) {
		System.out.println("Adicione um item:");
		Pedido novoPedido = new Pedido(cliente);
		
		novoPedido.adicionaItem(2, produto1);
		novoPedido.adicionaItem(3, produto2);
		novoPedido.adicionaItem(1, produto1);
		novoPedido.adicionaItem(2, produto2);
		novoPedido.adicionaItem(2, produto1);
		return novoPedido;
	}

	private static Produto cadastraProduto() {
		System.out.println("Digite o nome do seu produto");
		String nomeDoProduto = scanner.nextLine();
		
		System.out.println("Digite o preco do produto");
		double preco = scanner.nextDouble();
		
		System.out.println("Digite a quantidade no estoque desse produto");
		int estoque = scanner.nextInt();
		
		return new Produto(nomeDoProduto, preco, estoque);
	}
	
	private static Cliente cadastraCliente(Endereco endereco) {
		System.out.println("Digite o nome do cliente");
		String nomeDoCliente = scanner.nextLine();
	
		System.out.println("Digite o numero do cpf");
		String cpf = scanner.nextLine();
		
		return new Cliente(nomeDoCliente, cpf, endereco);
	}
	
	private static Endereco cadastraEndereco() {
		System.out.println("Digite o nome da sua rua");
		String logradouro = scanner.nextLine();
		
		System.out.println("Digite o seu bairro");
		String bairro = scanner.nextLine();
		
		System.out.println("Digite a sua cidade");
		String cidade = scanner.nextLine();
		
		System.out.println("Digite o seu estado");
		String estado = scanner.nextLine();
		
		System.out.println("Digite o seu pais");
		String pais = scanner.nextLine();
		
		System.out.println("Digite o numero da sua residencia");
		String numero = scanner.nextLine();
		
		System.out.println("Digite o cep");
		String cep = scanner.nextLine();
		
		System.out.println("Digite o complemento da sua residencia");
		String complemento = scanner.nextLine();
		
		return new Endereco(logradouro, bairro, cidade, estado, pais, cep, numero, complemento);
	}
	
	void teste() {
		Endereco endereco = new Endereco("Rua do Matao", "Butanta", "Sao Paulo", "SP", "Brasil", "05632020", "1010", "Bloco B - Sala 101");
		Cliente gustavo = new Cliente("Gustavo", "32021784827", endereco);
		
		Produto leite = new Produto("leite", 4.0, 10);
		Produto queijo = new Produto("queijo", 15.0, 5); 
		
		Itens[] itens = new Itens[] { 
				new Itens(leite),
				new Itens(2, queijo)
		};
		
		Pedido pedido = new Pedido(gustavo);
		
		System.out.println(pedido.getValorTotal() == 34.0);
		
		Itens[] outrosItens = new Itens[] {
				new Itens(2, leite)
		};
		
		//Pedido outroPedido = new Pedido(outrosItens, gustavo);	
	}
}
