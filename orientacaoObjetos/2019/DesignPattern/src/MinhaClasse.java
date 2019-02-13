
public class MinhaClasse {
	private static MinhaClasse instancia;
	private String nome;
	private MinhaClasse() {
		
	}
	
	public static MinhaClasse criaInstancia() {
		if(instancia == null) {
			instancia = new MinhaClasse();
		}
		return instancia;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
