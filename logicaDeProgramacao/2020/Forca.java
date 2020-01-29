
import java.util.Scanner;
import java.util.Random;

class Main {
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
      
      //Imprimindo o estado das letras que ja foram descobertas
      for(String b: palavraEscondida){
        System.out.print(b + " ");        
      }
      System.out.println("");
      
      //Tentando descobrir uma letra da forca
      System.out.print("Digite: ");
      inputDoUsuario = leitor.next();

      //Esta flag vai auxiliar na contagem de vidas do jogador
      boolean acertou = false;
      
      //Varrer a palavra e verificar se a letra que o jogador passou esta
      //na palavra que se deseja advinhar
      for(int i = 0; i < palavraParaAdvinhar.length(); i++){
        
        //Fazendo uma conversão de char para String 
        String caracter = Character.toString(palavraParaAdvinhar.charAt(i));
        
        if(inputDoUsuario.equals(caracter)){
          acertou = true;
          letrasAcertadas++;
          
          //mostra a letra que foi advinhada
          palavraEscondida[i] = inputDoUsuario;

          //verifica fim do jogo
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
