
public abstract class Vertebrados extends Animais {
	
	public Vertebrados(int pes, String cor) {
		super(pes, cor, 2);
	}
	
	public String imprimeInformacaoDeVertebrado() {
		return toString();
	}
	
	protected abstract void movimentar();
}
