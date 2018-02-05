import java.util.Scanner;
public class Humano extends Jogador{
	private Scanner scan = new Scanner(System.in);
	
	public Humano(int id) {
		super.id = id;
	}
	
	@Override
	public void efetuaJogada(Tabuleiro tabuleiro) {
		boolean jogadaValida = false;

		while (!jogadaValida) {
			System.out.println("Digite a linha");
			int linha = scan.nextInt();
			System.out.println("Digite a coluna");
			int coluna = scan.nextInt();

			jogadaValida = tabuleiro.efetuaJogada(id, linha, coluna);
		}
	}

}
