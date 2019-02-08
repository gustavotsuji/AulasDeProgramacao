
public abstract class Mamiferos extends Vertebrados {
	private boolean temPelo;
	
	public Mamiferos(int pes, String cor){
		super(pes, cor);		
	}
	
	public Mamiferos(int pes, String cor, boolean temPelo) {
		super(pes, cor);
		this.temPelo = temPelo;
	}

	@Override
	public String toString() {
		return "Mamiferos [temPelo=" + temPelo + "]";
	}
	
	public boolean jaMamou() {
		return false;
	}
	
	protected abstract void movimentar();
}
