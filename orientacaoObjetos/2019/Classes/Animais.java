
public abstract class Animais {
	private int quantidadeDePes;
	private String cor;
	private int quantidadeDeOlhos;
	protected boolean temUnhas;
	
	public Animais(int quantidadeDePes, String cor, int quantidadeDeOlhos) {
		this.quantidadeDePes = quantidadeDePes;
		this.cor = cor;
		this.quantidadeDeOlhos = quantidadeDeOlhos;
	}

	@Override
	public String toString() {
		return "Animais [quantidadeDePes=" + quantidadeDePes + ", cor=" + cor + ", quantidadeDeOlhos="
				+ quantidadeDeOlhos + ", temUnhas=" + temUnhas + "]";
	}

	public int getQuantidadeDeOlhos() {
		return quantidadeDeOlhos;
	}

	public String getCor() {
		return cor;
	}
	
	protected abstract void movimentar();
	
}
