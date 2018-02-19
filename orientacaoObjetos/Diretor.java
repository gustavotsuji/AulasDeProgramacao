
public class Diretor extends Funcionario{
	private int tempoGestao;
	
	public Diretor(String nome, String registro, String setor, int tempoDeGestao) {
		super(nome, registro, setor);
		this.tempoGestao = tempoDeGestao;
	}

	public String imprimeIdentificacao() {
		return super.getNome() + " - " + tempoGestao + " anos";
	}
	
	public int getTempoGestao() {
		return tempoGestao;
	}

	public void setTempoGestao(int tempoGestao) {
		this.tempoGestao = tempoGestao;
	}
	
	
}
