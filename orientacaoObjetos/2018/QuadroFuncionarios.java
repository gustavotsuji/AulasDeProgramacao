
public class QuadroFuncionarios {
	
	public static void main(String[] args) {
		
		Professor mauro = new Professor("Mauro", "23456", "Estatistica", "Probabilidade", "Doutor");
		System.out.println(mauro);
		//System.out.println(mauro.getEspecialidade());
		
		Diretor carlos = new Diretor("Carlos", "45678", "Administrativo", 4);
		System.out.println(carlos);
	}
}
