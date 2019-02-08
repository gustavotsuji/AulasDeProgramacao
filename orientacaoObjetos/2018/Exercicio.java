import java.lang.reflect.Array;

public class Exercicio {
	
	private int numeroDaQuestao;
	
	public static int buscaCarro(Carro[] array, String modelo) {
		int resultado = -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i].getModelo().equals(modelo)) {
				return i;
			}
		}
		//System.out.println(numeroDaQuestao);
		return resultado;
	}
	
	public static void ordenaLista(Carro[] lista) {
		
		for(int j = 0; j < lista.length; j++) {
			int indiceDoMenor = j;
			for(int i = j + 1; i < lista.length; i++) {
				if(lista[i].getPeso() < lista[indiceDoMenor].getPeso()) {
					indiceDoMenor = i;
				}
			}
			Carro auxiliar = lista[j];
			lista[j] = lista[indiceDoMenor];
			lista[indiceDoMenor] = auxiliar;	
		}
	}
	
	public static void ordenaListaPorModelo(Carro[] lista) {
		
		for(int j = 0; j < lista.length; j++) {
			int indiceDoMenor = j;
			for(int i = j + 1; i < lista.length; i++) {
				if(lista[i].getModelo().compareTo(lista[indiceDoMenor].getModelo()) < 0 ) {
					indiceDoMenor = i;
				}
			}
			Carro auxiliar = lista[j];
			lista[j] = lista[indiceDoMenor];
			lista[indiceDoMenor] = auxiliar;	
		}
	}
	
	public static void imprimeLista(Carro[] lista) {
		for(Carro carro : lista) {
			System.out.println(carro);
		}
	}
}
