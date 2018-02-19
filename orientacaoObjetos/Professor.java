
public class Professor extends Funcionario{
	
	private String especialidade;
	private String titulacao;
	
	
	
	public Professor(String nome, String registro, String setor, String especialidade, String titulacao) {
		super(nome, registro, setor);
		this.especialidade = especialidade;
		this.titulacao = titulacao;		
	}
	
	public String toString() {
		return this.titulacao + " " + super.getNome();
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public String imprimeIdentificacao() {
		return this.getNome();
	}
}
