import java.util.Scanner;

class Memoria {
  //define tabuleiro
  static int[][] resposta = {{6, 1, 2, 3}, 
                             {4, 2, 6, 5},
                             {4, 3, 1, 5}};
  //define como mostrar o tabuleiro para o jogador
  static int [][] display = {{0, 0, 0, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0}};

  static int acertos = 0;

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    boolean jogoAcabou = false;

    //Enquanto o jogo nao acabou
    while(jogoAcabou()) {
      int linha1 = -1;
      int coluna1 = -1;
      int linha2 = -1;
      int coluna2 = -1;
      //Escolhe um espaco
      do {
        System.out.println("Escolha uma linha(0-2)");
        linha1 = scanner.nextInt();
        System.out.println("Escolha uma coluna(0-3)");
        coluna1 = scanner.nextInt();
      } while(!entradaValida(linha1, coluna1));
      
      atualizaDisplay(linha1, coluna1);
      //Mostrar o display para o usuario apos escolher o primeiro espaco
      imprimeDisplay();

      //Escolhe outro espaco
      do {
        System.out.println("Escolha uma linha(0-2)");
        linha2 = scanner.nextInt();
        System.out.println("Escolha uma coluna(0-3)");
        coluna2 = scanner.nextInt();
      } while(!entradaValida(linha2, coluna2));
      
      atualizaDisplay(linha2, coluna2);
      //Mostrar o display para o usuario apos escolher o outro espaco

      imprimeDisplay();
    
      //Se for iguais, deixar fixo no tabuleiro
      if(resposta[linha1][coluna1] != resposta[linha2][coluna2]){
        ocultaDisplay(linha1, coluna1);
        ocultaDisplay(linha2, coluna2);
      } else {
        acertos++;
      }

      //Mostra display atualizado para o jogador
      imprimeDisplay();
    }
  }

  static void imprimeDisplay(){
    System.out.println("-------------------");
    for(int i = 0; i < display.length; i++){
      for(int j = 0; j < display[i].length; j++){
        System.out.print(display[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("-------------------");
  }

  static void atualizaDisplay(int linha, int coluna){
    display[linha][coluna] = resposta[linha][coluna];
  }

  static void ocultaDisplay(int linha, int coluna){
    display[linha][coluna] = 0;
  }

  static boolean jogoAcabou(){
    return acertos < 6;
  }

  static boolean entradaValida(int linha, int coluna){
    if(linha < 0 || linha > resposta.length - 1|| coluna < 0 || coluna > resposta[0].length - 1){
      System.out.println("O numero esta fora do limite");
      return false;
    } 
    return true;
  }
}
