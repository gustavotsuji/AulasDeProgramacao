import java.util.Scanner;

class Jogo {
  public static void main(String[] args) {
    int tamanho = 3;
    String[][] jogo = new String[tamanho][tamanho];
    String input = "";
    Scanner scanner = new Scanner(System.in);
    int numeroDeJogadas = 0;

    //Inicialização do jogo
    for(int i = 0; i < jogo.length; i++){
      for(int j = 0; j < jogo.length; j++){
        jogo[i][j] = "_";
      }
    }

    boolean jogoAcabou = false;
    while(!input.equals("sair")) {  
      
      //Imprime o estado jogo
      for(int i = 0; i < jogo.length; i++){
        for(int j = 0; j < jogo.length; j++){
          System.out.print(jogo[i][j] + " ");
        }
        System.out.println("");
      }

      if(jogoAcabou){
        return;
      }

      //Leitura das jogadas
      int linha = -1;
      int coluna = -1;
      boolean entradaNaoEhValida = true;

      while(entradaNaoEhValida){
        try {
          linha = scanner.nextInt();
          coluna = scanner.nextInt();

          //Verifica se a polsição é válida
          if(linha < 0 || linha >= jogo.length){
            System.out.println("A coordenada linha está fora do limite!");
          } else if(coluna < 0 || coluna >= jogo.length){
            System.out.println("A coordenada coluna está fora do limite!");
          }
          else if(!"_".equals(jogo[linha][coluna]) ){
            System.out.println("Essa posição já foi marcada, jogue novamente");
          } else {
            entradaNaoEhValida = false;
          }
        } catch (Exception e){
          System.out.println("Jogada inválida! Você digitou "+ scanner.nextLine());  
        }
      }

      //Efetua jogada
      if(numeroDeJogadas%2 == 0){
        jogo[linha][coluna] = "X";
      } else {
        jogo[linha][coluna] = "O";
      }
      numeroDeJogadas++;

      //verifica diagonais
      if(!"_".equals(jogo[0][0]) &&
        jogo[0][0].equals(jogo[1][1]) &&
        jogo[0][0].equals(jogo[2][2])){
        System.out.println("Fim de jogo");
        jogoAcabou = true;
        continue;
      } else if(!"_".equals(jogo[0][2]) &&
        jogo[0][2].equals(jogo[1][1]) &&
        jogo[0][2].equals(jogo[2][0])){
        System.out.println("Fim de jogo");
        jogoAcabou = true;
        continue;
      }

      for(int i = 0; i < jogo.length; i++){
        //verifica fim do jogo
        if(!"_".equals(jogo[i][0]) &&
           jogo[i][0].equals(jogo[i][1]) &&
           jogo[i][0].equals(jogo[i][2])){
          System.out.println("Fim de jogo");
          jogoAcabou = true;
        }
        
        if(!"_".equals(jogo[0][i]) &&
          jogo[0][i].equals(jogo[1][i]) &&
          jogo[0][i].equals(jogo[2][i])){
          System.out.println("Fim de jogo");
          jogoAcabou = true;
        }
      }

      if(numeroDeJogadas == jogo.length * jogo.length){
        System.out.println("Fim de jogo, ninguém ganhou!");
        jogoAcabou = true;
      }

    }
  }
}
