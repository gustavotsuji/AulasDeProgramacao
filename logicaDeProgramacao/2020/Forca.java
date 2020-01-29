
import java.util.Scanner;
import java.util.Random;

class Forca {
  public static void main(String[] args) {
    String inputDoUsuario = "";
    Scanner leitor = new Scanner(System.in);
    String[] palavras = {"PARIS", "ROMA", "TOQUIO", "SANTIAGO"};
    Random random = new Random();
    int vidas = 6;

    //Escoher a palavra
    int indiceDaPalavra = random.nextInt(palavras.length);
    String palavraParaAdvinhar = palavras[indiceDaPalavra];

    String[] palavraEscondida = new String[palavraParaAdvinhar.length()];
    for(int a = 0; a < palavraEscondida.length; a++){
      palavraEscondida[a] = "_";
    }

    int letrasAcertadas = 0;
    while(!inputDoUsuario.equals("sair")) {
      for(String b: palavraEscondida){
        System.out.print(b + " ");        
      }
      System.out.println("");
      
      System.out.print("Digite: ");
      inputDoUsuario = leitor.next();

      boolean acertou = false;
      
      for(int i = 0; i < palavraParaAdvinhar.length(); i++){
        //Fazerndo uma 
        String caracter = Character.toString(palavraParaAdvinhar.charAt(i));
        
        if(inputDoUsuario.equals(caracter)){
          acertou = true;
          letrasAcertadas++;
          palavraEscondida[i] = inputDoUsuario;

          if(letrasAcertadas == palavraParaAdvinhar.length()){
            System.out.println("Você acertou a palavra!");
            return;
          }
        } 
      }
      
      if(!acertou) {
        vidas--;
        System.out.println("Você ainda tem " + vidas + " vidas!");
      }

      if(vidas == 0) {
        System.out.println("Você morreu!");
        break;
      }
    }
  }
}
