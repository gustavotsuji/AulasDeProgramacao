
public class Carro {
	private String modelo;
	private int peso;
		
	public Carro(String modelo, int peso) {
		this.modelo = modelo;
		this.peso = peso;
	}
	
	public int getPeso() {
		return this.peso;
	}

	public String getModelo() {
		return modelo;
	}
	
	public String toString() {
		return modelo + " "+ peso;
	}
}
