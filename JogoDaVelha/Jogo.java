public class Jogo {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador1 = new Computador(1);
		Jogador jogador2 = new Computador(2);
		Jogador atual = jogador1;
		
		while(true) {
			atual.efetuaJogada(tabuleiro);
			tabuleiro.imprimeJogadas();
			if(tabuleiro.jogoAcabou(atual.getId()) != 0) {
				break;
			}
			atual = trocaJogador(atual, jogador1, jogador2);
		}
	}
	
	public static Jogador trocaJogador(Jogador atual, Jogador jogador1, Jogador jogador2) {
		if(atual == jogador1) return jogador2;
		return jogador1;
	}
}
