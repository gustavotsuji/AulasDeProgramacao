
public class Clube {
	private String nome;
	private int anoFundacao;
	private int vezesCampeao;
	
	public Clube(String nome, int anoFundacao, int vezesCampeao) {
		this.nome = nome;
		this.anoFundacao = anoFundacao;
		this.vezesCampeao = vezesCampeao;
	}
	public int getVezesCampeao() {
		return vezesCampeao;
	}
	public void setVezesCampeao(int vezesCampeao) {
		this.vezesCampeao = vezesCampeao;
	}
	public String getNome() {
		return nome;
	}
	public int getAnoFundacao() {
		return anoFundacao;
	}
}
