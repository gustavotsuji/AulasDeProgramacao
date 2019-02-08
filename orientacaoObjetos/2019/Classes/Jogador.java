
public class Jogador {
	private String nome;
	private int gols;
	private int partidas;
	private Clube clube;
	public static int quantidadeTotalDeJogadoresNoTime = 0; 
	
	public Jogador(String nome) {
		this.nome = nome;
		quantidadeTotalDeJogadoresNoTime++;
	}
	
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	public int getPartidas() {
		return partidas;
	}
	public void setPartidas(int partidas) {
		this.partidas = partidas;
	}
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	public String getNome() {
		return nome;
	}
}
