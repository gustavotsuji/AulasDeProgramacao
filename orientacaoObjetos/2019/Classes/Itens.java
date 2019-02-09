
public class Itens {
	private int quantidade;
	private Produto produto;

	public Itens(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}
	
	public Itens(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String toString() {
		return "[quantidade="+quantidade+", "+produto+"]";
	}
	
	public double getSubTotal() {
		return quantidade * produto.getPreco();
	}
}
