
public abstract class Imposto {
    private double taxa = 0.15;
    private String nome;
    public abstract double atualizaValor(double valor);
    
    protected Imposto(String nome, double taxa) {
    	this.nome = nome;
    	this.taxa = taxa;
    }
    
    @Override
    public String toString() {
    	return nome;
    }

	public double getTaxa() {
		return taxa;
	}

	public String getNome() {
		return nome;
	}
    
    
}

