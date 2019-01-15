class ComparadorDePalavras {
  public static void main(String[] args) {
    int numero = 1;
    Integer numeroClasse = 1;
    String texto1 = "caju";
    String texto2 = "caju";

    int palavraMenor = 0;

    if(texto1.length() > texto2.length()){
      palavraMenor = texto2.length();
    } else {
      palavraMenor = texto1.length();
    }

    boolean saoDiferentes = false;

    for(int indice = 0; indice < palavraMenor; indice++){
      char primeiraLetra1 = texto1.charAt(indice);
      char primeiraLetra2 = texto2.charAt(indice);
      if(primeiraLetra1 == primeiraLetra2){
        continue;
      } else if(primeiraLetra1 > primeiraLetra2) {
        System.out.println("texto2 vem antes de texto1");
        saoDiferentes = true;
        break;
      } else {
        System.out.println("texto1 vem antes de texto2");
        saoDiferentes = true;
        break;
      }
    }

    if(!saoDiferentes){
      if(texto2.length() > texto1.length()){
        System.out.println("texto1 vem antes de texto2");
      } else if(texto2.length() < texto1.length()){
        System.out.println("texto2 vem antes de texto1");
      } else {
        System.out.println("Sao iguais");
      }
    }
  }
}
