
public abstract class Funcionario {
	private String nome;
	protected String registro;
	protected String setor;
	

	
	public Funcionario(String nome, String registro, String setor) {
		this.nome = nome;
		this.registro = registro;
		this.setor = setor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public abstract String imprimeIdentificacao();
}
