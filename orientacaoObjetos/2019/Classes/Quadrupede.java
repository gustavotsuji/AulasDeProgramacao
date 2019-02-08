
public interface Quadrupede extends PodeAndar{
	final String nome = "";
	
	public void andaComQuatroPatas();
	
	default void anda() {
		System.out.println("Vou andar com 4 patas");
	}
}
