
public class Felinos extends Mamiferos implements Quadrupede {
	private Boolean ehDomesticavel = false;
	private boolean temUnhas;
	
	public Felinos(Boolean ehDomesticavel, String cor) {
		super(4, cor);
		this.ehDomesticavel = ehDomesticavel;
		this.temUnhas = true;
	}

	
	@Override
	public String toString() {
		return "Felinos [ehDomesticavel=" + ehDomesticavel + ", temUnhas=" + temUnhas + "]";
	}



	public void movimentar() {
		System.out.println("Esta andando");
	}


	public void anda() {
		Quadrupede.anda();
		System.out.println("Estou andando");
	}
	
	@Override
	public void andaComQuatroPatas() {
		System.out.println("Estou andando com quatro patas");
	}


	@Override
	public String ondeAndo() {
		return "Sao terrestres";
	}
}
