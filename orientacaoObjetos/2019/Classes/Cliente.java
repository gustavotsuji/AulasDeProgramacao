
public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;

	public Cliente(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String toString() {
		return "Cliente= [nome= "+nome+", "+endereco+", cpf= "+cpf+"]";
	}
}
