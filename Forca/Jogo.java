import java.io.FileNotFoundException;

public class Jogo {
	public static void main(String[] args) throws FileNotFoundException {
		Forca forca = new Forca("carnaval");
		Jogador jogador = new Computador();
		//Jogador jogador = new Estatistico();
		
		while(true) {
			jogador.efetuaJogada(forca);
			forca.imprimeJogadas();
			if(forca.fimDeJogo()) {
				break;
			}
		}
	}
}
