
public class SandBox {
	
	public static void main(String[] args) {
		MinhaClasse minhaClasse = MinhaClasse.criaInstancia();
		minhaClasse.setNome("Gustavo");
		
		MinhaClasse outraReferencia = MinhaClasse.criaInstancia();
		outraReferencia.setNome("Manoel");
		
		System.out.println(minhaClasse.getNome());
		System.out.println(outraReferencia.getNome());
		
	}

}
