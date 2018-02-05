
public class Tabuleiro {
	private int[][] tabuleiro = new int[3][3];
	int jogadasRestantes = 9;
	
	public void imprimeJogadas() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public boolean efetuaJogada(int jogador, int linha, int coluna) {
		boolean jogadaValida = false;
		if (linha < tabuleiro.length &&
			linha >= 0 && 
			coluna < tabuleiro.length && 
			coluna >= 0 &&
			tabuleiro[linha][coluna] == 0) {
			jogadaValida = true;
			tabuleiro[linha][coluna] = jogador;
			jogadasRestantes--;
		} else {
			System.out.println("Jogada invalida, tente novamente");
		}
		
		return jogadaValida;
	}

	public int jogoAcabou(int jogador) {
		boolean resultado = checaLinha(jogador) ||
				            checaColuna(jogador) ||
				            checaDiagonalPrincipal(jogador)
				|| checaDiagonalSecundaria(jogador);

		if (!resultado && jogadasRestantes == 0) {
			System.out.println("Fim de jogo, deu empate!");
			return -1;
		} else if (resultado) {
			System.out.println("Fim de jogo, jogador " + jogador + " ganhou!");
			return jogador;
		} else {
			System.out.println("Proxima jogada!");
			return 0;
		}

	}

	private boolean checaLinha(int jogador) {
		boolean venceu = true;

		for (int i = 0; i < tabuleiro.length; i++) {
			venceu = true;
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] != jogador) {
					venceu = false;
					break;
				}
			}
			if (venceu) {
				return true;
			}
		}
		return false;
	}

	private boolean checaColuna(int jogador) {
		boolean venceu = true;

		for (int i = 0; i < tabuleiro.length; i++) {
			venceu = true;
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[j][i] != jogador) {
					venceu = false;
					break;
				}
			}
			if (venceu) {
				return true;
			}
		}
		return false;
	}

	private boolean checaDiagonalPrincipal(int jogador) {
		for (int i = 0; i < tabuleiro.length; i++) {
			if (tabuleiro[i][i] != jogador) {
				return false;
			}
		}
		return true;
	}

	private boolean checaDiagonalSecundaria(int jogador) {
		for (int i = 0; i < tabuleiro.length; i++) {
			if (tabuleiro[i][tabuleiro.length - i - 1] != jogador) {
				return false;
			}
		}
		return true;

	}
}
