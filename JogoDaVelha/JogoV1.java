import java.util.Scanner;

public class JogoV1 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] tabuleiro = new int[3][3];
		int jogadasRestantes = 9;
		int jogador = 1;
		while(true) {
			efetuaJogada(tabuleiro, jogador);
			imprimeJogadas(tabuleiro);
			if(jogoAcabou(tabuleiro, jogador, jogadasRestantes) != 0) {
				break;
			}
			jogador = trocaJogador(jogador);
		}
	}

	private static int trocaJogador(int jogador) {
		if (jogador == 1) {
			return 2;
		} else {
			return 1;
		}
	}

	private static void efetuaJogada(int[][] tabuleiro, int jogador) {
		boolean jogadaValida = false;

		while (!jogadaValida) {
			System.out.println("Digite a linha");
			int linha = scan.nextInt();
			System.out.println("Digite a coluna");
			int coluna = scan.nextInt();

			if (linha < tabuleiro.length && linha >= 0 && 
				coluna < tabuleiro.length && coluna >= 0 && 
				tabuleiro[linha][coluna] == 0) {
				jogadaValida = true;
				tabuleiro[linha][coluna] = jogador;
			} else {
				System.out.println("Jogada invalida, tente novamente");
			}
		}

	}

	private static void imprimeJogadas(int[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println("");
		}
	}

	private static int jogoAcabou(int[][] tabuleiro, int jogador, int jogadasRestantes) {
		boolean resultado = checaLinha(tabuleiro, jogador) || 
				            checaColuna(tabuleiro, jogador)|| 
				            checaDiagonalPrincipal(tabuleiro, jogador) || 
				            checaDiagonalSecundaria(tabuleiro, jogador);

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

	private static boolean checaLinha(int[][] tabuleiro, int jogador) {
		boolean venceu = true;

		for (int i = 0; i < tabuleiro.length; i++) {
			venceu = true;
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] != jogador) {
					venceu = false;
					break;
				}
			}
			if(venceu) {
				return true;
			}
		}
		return false;
	}

	private static boolean checaColuna(int[][] tabuleiro, int jogador) {
		boolean venceu = true;

		for (int i = 0; i < tabuleiro.length; i++) {
			venceu = true;
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[j][i] != jogador) {
					venceu = false;
					break;
				}
			}
			if(venceu) {
				return true;
			}
		}
		return false;
	}

	private static boolean checaDiagonalPrincipal(int[][] tabuleiro, int jogador) {
		for (int i = 0; i < tabuleiro.length; i++) {
			if (tabuleiro[i][i] != jogador) {
				return false;
			}
		}
		return true;
	}

	private static boolean checaDiagonalSecundaria(int[][] tabuleiro, int jogador) {
		for (int i = 0; i < tabuleiro.length; i++) {
			if (tabuleiro[i][tabuleiro.length - i - 1] != jogador) {
				return false;
			}
		}
		return true;

	}
}
