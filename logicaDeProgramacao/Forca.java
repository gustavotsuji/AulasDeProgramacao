import java.util.Scanner;
import java.util.Random;

class Forca {
  static char[] texto;
  static int erros;
  static int acertos;
  static String letrasErradas = "";
  static String letrasUsadas = "";
  static String[] palavrasParaAdvinhar = {"banana", "baleia", "caju", "cadeira"};

  public static void main(String[] args) {
    String palavra = selecionaPalavra();
    inicializaTexto(palavra.length());
    try(Scanner scanner = new Scanner(System.in)) {
    
      char letra = ' ';
      while(acertos != palavra.length() && erros != 6){
        System.out.println("Digite uma letra: ");
        letra = scanner.next().charAt(0);
        if(entradaValida(letra)){
          encontreiLetra(palavra, letra);
          imprimeArray();
        }
        System.out.println("As letras usadas foram: "+letrasUsadas);
        System.out.println("As letras erradas foram: "+letrasErradas);
      }
    }
  
    System.out.println(letrasErradas);
  }

  public static void encontreiLetra(String palavra, char letra){
    boolean achou = false;
    for(int i = 0; i < palavra.length(); i++){
      if(palavra.charAt(i) == letra){
        texto[i] = letra;
        achou = true;
        acertos++;
      }
    }
    if(!achou){
      erros++;
      letrasErradas += letra+" ";
    }
  }

  public static boolean entradaValida(char letra){
    for(int i = 0; i < letrasUsadas.length(); i++){
      if(letrasUsadas.charAt(i) == letra) {
        return false;
      }
    }
    letrasUsadas += letra;
    return true;
  }

  public static void imprimeArray(){
    for(char c : texto){
      System.out.print(c);
    }
    System.out.println("");
  }

  public static void inicializaTexto(int tamanhoDaPalavra){
    texto = new char[tamanhoDaPalavra];
    for(int i = 0; i < tamanhoDaPalavra; i++){
      texto[i] = '_';
    }
  }

  public static String selecionaPalavra(){
    Random random = new Random();
    int indice = random.nextInt(palavrasParaAdvinhar.length);
    return palavrasParaAdvinhar[indice];
  }
}
