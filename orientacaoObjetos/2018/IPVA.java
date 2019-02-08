
public class IPVA extends Imposto {

	private String modelo;
	
	public IPVA(String nome, double taxa) {
		super(nome, taxa);
	}
	
	@Override
	public double atualizaValor(double valor) {
		return valor * super.getTaxa() * 0.35;
	}
	
	public String getModelo() {
		return modelo;
	}
}
