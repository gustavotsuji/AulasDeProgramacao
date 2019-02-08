
public class Marsupiais extends Mamiferos {

	public Marsupiais(int pes, String cor) {
		super(pes, cor);
	}
	
	public void movimentar() {
		System.out.println("Esta pulando");
	}

	@Override
	public String toString() {
		return "Marsupiais [temUnhas=" + temUnhas + "]";
	}

}
