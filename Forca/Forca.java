
public class Forca {
	private String palavra;
	private boolean[] aberta;
	private int tentativas;
	private String letrasUsadas = "";
	private int letrasRestantes;
	
	public Forca(String palavra) {
		this.palavra = palavra;
		tentativas = 10;
		aberta = new boolean[palavra.length()];
		letrasRestantes = palavra.length();
	}
	
	public boolean fazJogada(char letra) {
		boolean jogadaInvalida = true;
		
		for(int i = 0; i < letrasUsadas.length(); i++) {
			if(letra == letrasUsadas.charAt(i)) {
				System.out.println("A letra "+letra+" ja foi!");
				return false;
			}
		}
		letrasUsadas += letra;
		
		
		for(int i = 0; i < palavra.length(); i++) {
			if(letra == palavra.charAt(i)) {
				aberta[i] = true;
				jogadaInvalida = false;
				letrasRestantes--;
			}
		}
		
		if(jogadaInvalida) {
			System.out.println("Nao existe a letra "+letra);
			tentativas--;
			return true;
		}
		
		return true;
	}
	
	public boolean fimDeJogo() {
		if(tentativas == 0) {
			System.out.println("Voce foi enforcado! =(");
			return true;
		} else if(letrasRestantes == 0) {
			System.out.println("Voce descobriu a palavra!");
			return true;
		}
		return false;
	}
	
	public void imprimeJogadas() {
		
		System.out.println("Letras usadas: "+letrasUsadas);
		System.out.println("Tentativas: "+tentativas);
		for(int i = 0; i < palavra.length(); i++) {
			if(aberta[i]) {
				System.out.print(palavra.charAt(i));
			} else {
				System.out.print("_");
			}
		}
		System.out.println("");
	}
}
