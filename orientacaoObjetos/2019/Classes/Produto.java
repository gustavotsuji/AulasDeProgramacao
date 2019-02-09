
public class Produto {
	private String nomeDoProduto;
	private double preco;
	private int unidadesDoEstoque;
	
	public Produto(String nomeDoProduto, double preco, int unidadesDoEstoque) {
		this.nomeDoProduto = nomeDoProduto;
		this.preco = preco;
		this.unidadesDoEstoque = unidadesDoEstoque;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getUnidadesDoEstoque() {
		return unidadesDoEstoque;
	}

	public void setUnidadesDoEstoque(int unidadesDoEstoque) {
		this.unidadesDoEstoque = unidadesDoEstoque;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	
	public String toString() {
		return "nomeDoProduto="+nomeDoProduto+", unidadesDoEstoque="+unidadesDoEstoque+", preco="+preco;
	}
}
