import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculadora {
	
	public static void main(String[] args) {
		IPVA ipva = new IPVA("ipva", 1.2);
		ipva.getModelo();
		
		IPTU iptu = new IPTU("iptu", 1.5);
		
		List<Imposto> minhaLista = new ArrayList<Imposto>();
		
		minhaLista.add(ipva);
		minhaLista.add(iptu);
		
		Imposto imposto = new IPVA("outro ipva", 1.1);
		
		minhaLista.add(imposto);
		
		System.out.println(minhaLista);
		
		Collections.sort(minhaLista, new ComparadorDeImposto());
		
		System.out.println(minhaLista);
	}
}
