
public class Fila {
	public static final int tamanhoDaFila = 3;

	private Pessoa[] pessoas = new Pessoa[tamanhoDaFila];
	private int numeroDePessoas = 0;
	
	
	private static Fila fila;
	
	private Fila() {
		
	}
	
	public static Fila getInstance() {
		if(fila == null) {
			fila = new Fila();
		}
		return fila;
	}
	
	public void insereComecoDaFila(Pessoa pessoa) {
		if(this.numeroDePessoas < pessoas.length) {
			this.pessoas[numeroDePessoas] = pessoa;
			numeroDePessoas++;			
		} else {
			System.out.println(pessoa.getNome() + ", volte outro dia");
		}
		
		mostraFila();
	}

	public void primeiroFoiAtendido() {
		for(int i = 1; i < pessoas.length; i++) {
			pessoas[i-1] = pessoas[i];
		}
		numeroDePessoas--;
	}
	
	private void mostraFila() {
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null) {
				System.out.print(pessoas[i].getNome() +" ");
			} else {
				System.out.print("Vazio ");
			}
		}
		System.out.println("");
	}

}
