
public class IPTU extends Imposto {
	
	public IPTU(String nome, double taxa) {
		super(nome, taxa);
	}
    public double atualizaValor(double valor){
        return valor * super.getTaxa() * 1.15;
    }    
}

