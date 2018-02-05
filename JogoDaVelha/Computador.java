import java.util.Random;
public class Computador extends Jogador{
	private Random rand = new Random();
	
	public Computador(int id) {
		super.id = id;
	}
	
	@Override
	public void efetuaJogada(Tabuleiro tabuleiro) {
		boolean jogadaValida = false;

		while (!jogadaValida) {
			System.out.println("Digite a linha");
			int linha = rand.nextInt(3);
			System.out.println("Digite a coluna");
			int coluna = rand.nextInt(3);

			jogadaValida = tabuleiro.efetuaJogada(id, linha, coluna);
		}
	}

}
