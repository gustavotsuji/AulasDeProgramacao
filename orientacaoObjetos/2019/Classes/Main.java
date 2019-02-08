
public class Main {
	public static void main(String[] args) {
		//Felinos felinos = new Felinos(false, "Preto");
		//System.out.println(felinos);
		//Marsupiais marsupiais = new Marsupiais(2, "Marrom");
		//marsupiais.movimentar();
		
		Mamiferos[] listaBichos = new Mamiferos[] {
				new Felinos(true, "Marrom"),
				new Marsupiais(2, "Malhado")
		};
		
		for(Mamiferos mamifero : listaBichos) {
			mamifero.jaMamou();
			System.out.println(mamifero);
		}
		
		/*for (int i = 0; i < listaBichos.length; i++) {
			Animais animais = listaBichos[i];
			if(animais instanceof Mamiferos) {
				
			}
		}*/
		
		//Mamiferos mamiferos = new Marsupiais(2, "Branco");
		//mamiferos.movimentar();
		
		Felinos felino = new Felinos(true, "Cinza");
		felino.anda();
		System.out.println(felino.possoAndar());
		System.out.println(felino.ondeAndo());
		
		//Marsupiais marsupial = new Marsupiais(2, "Marrom");
		//marsupial.andaComQuatroPatas();
		
		
	}
}
