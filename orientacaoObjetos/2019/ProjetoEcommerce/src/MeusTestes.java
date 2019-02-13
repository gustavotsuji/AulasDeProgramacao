import dominio.Produto;

public class MeusTestes {
	public static void main(String[] args) {
		Produto novoProduto = new Produto("Banana", 4, 10);
		Produto outroProduto = new Produto("Banana", 4, 20);
		
		System.out.println(novoProduto == outroProduto);
		System.out.println(novoProduto.equals(outroProduto));
	}
}
