
public class EfeitoColateral {
	public static void main(String[] args) {
		int[] meuValor = new int[]{1,2};
		
		alteraValor(meuValor);
		
		System.out.println(meuValor[0]);
	}
	
	public static void alteraValor(int[] valor) {
		valor[0] = 3;
	}
}
