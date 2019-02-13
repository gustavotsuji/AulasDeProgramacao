package dominio;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeDoProduto == null) ? 0 : nomeDoProduto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nomeDoProduto == null) {
			if (other.nomeDoProduto != null)
				return false;
		} else if (!nomeDoProduto.equals(other.nomeDoProduto))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		return true;
	}

	
	
	
}
