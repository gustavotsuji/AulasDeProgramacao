
public class Sambodromo {
	public static void main(String[] args) {
		EscolaDeSamba escola = new GavioesDaFiel();
		System.out.println(escola.mostraMestreSala());
		
		GavioesDaFiel gf = new GavioesDaFiel();
		System.out.println(gf.mostraMestreSala());
		
		EscolaDeSamba escola2 = new X9();
		System.out.println(escola2.mostraMestreSala());
		
		X9 v = new X9();
		System.out.println(v.mostraMestreSala());
		
		TemMestreSala esc1 = new GavioesDaFiel();
		System.out.println(esc1.mostraMestreSala());
		
		TemMestreSala esc2 = new X9();
		System.out.println(esc2.mostraMestreSala());
		
		
	}
}
