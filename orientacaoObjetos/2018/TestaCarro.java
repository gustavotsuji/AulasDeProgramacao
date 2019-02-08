public class TestaCarro {
	public static void main(String[] args) {
		Carro[] lista = new Carro[] { 
				new Carro("Etios", 700), 
				new Carro("Fusca", 500), 
				new Carro("Brasilia", 1000),
				new Carro("A3", 800), 
				new Carro("Kombi", 600) };
		
		Exercicio.ordenaListaPorModelo(lista);
		
		Exercicio.imprimeLista(lista);
	}
}
