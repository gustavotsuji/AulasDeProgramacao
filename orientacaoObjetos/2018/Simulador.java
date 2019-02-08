
public class Simulador {
	public static void main(String[] args) {
		Fila fila = Fila.getInstance();
		Pessoa gustavo = new Pessoa("Gustavo", 32);
		fila.insereComecoDaFila(gustavo);
		
		Pessoa cecilia = new Pessoa("Cecilia", 40);
		fila.insereComecoDaFila(cecilia);
		
		fila.primeiroFoiAtendido();
		
		Pessoa rafael = new Pessoa("Rafael", 18);	
		fila.insereComecoDaFila(rafael);

		Pessoa valter = new Pessoa("Valter", 41);
		fila.insereComecoDaFila(valter);
		
		Pessoa gabriel = new Pessoa("Gabriel", 25);
		fila.insereComecoDaFila(gabriel);
		
		Fila novaFila = Fila.getInstance();
		novaFila.insereComecoDaFila(gabriel);
		
	}
}
