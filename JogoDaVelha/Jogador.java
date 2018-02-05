
public abstract class Jogador {
	protected int id;
	public abstract void efetuaJogada(Tabuleiro tabuleiro);
	
	public int getId() {
		return this.id;
	}
}
