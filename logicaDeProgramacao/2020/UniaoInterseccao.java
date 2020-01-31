import java.util.Scanner;

class UniaoInterseccao {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
  
    System.out.print("Informe o tamanho do primeiro array: ");
    int tamanho = scanner.nextInt();
    int[] array1 = new int[tamanho];
    for(int a = 0; a < tamanho; a++){
      System.out.print("Digite a posicao "+a+": ");
      array1[a] = scanner.nextInt();
    }    

    System.out.print("Informe o tamanho do segundo array: ");
    tamanho = scanner.nextInt();
    int[] array2 = new int[tamanho];
    for(int a = 0; a < tamanho; a++){
      System.out.print("Digite a posicao "+a+": ");
      array2[a] = scanner.nextInt();
    }

    System.out.println("Array1");
    impressao(array1);
    System.out.println("Array2");
    impressao(array2);

    //Calculando a uniao
    System.out.print("Calculando a uniao");
    int[] uniao = calculaUniao(array1, array2);
    impressao(uniao);
    System.out.println("");
    
    //Calculando a interseccao
    System.out.print("Calculando a interseccao");
    int[] interseccao = calculaInterseccao(array1, array2);
    impressao(interseccao);
  }

  static void impressao(int[] imprime){
    //Imprimindo a uniao
    for(int a = 0; a < imprime.length; a++ ){
      if (imprime[a]!=0) { 
        System.out.print(imprime[a] + " ");
      }
    }
    System.out.println("");
  }

  static int[] calculaUniao(int[] array1, int[] array2){
    int[] uniao = new int[array1.length + array2.length];

    //Codigo para a uniao
    for (int i = 0; i<array1.length; i++){
      uniao[i] = array1[i];
    }

    //Juntando os 2 arrays para o calculo da uniao
    int c = 0;
    for(int j = array1.length; c<array2.length; j++){
      uniao[j]=array2[c];
      c++;
    }

    //Substituindo por 0 elementos repetidos na uniao
    for(int i = 0; i<uniao.length; i++){
      for(int j=i+1;j<uniao.length;j++){
        if(uniao[i]==uniao[j]){
          uniao[j] = 0;
        }
      }
    }

    return uniao;
  }

  static int[] calculaInterseccao(int[] array1, int[] array2){
    int tamanho = (array1.length > array2.length)? array2.length: array1.length;
    int[] interseccao = new int[tamanho];

    //Calculando a interseccao
    for (int i = 0; i<array1.length;i++){
      for(int j = 0; j<array2.length;j++){
        if (array1[i]==array2[j]){
          interseccao[i] = array1[i];
        }
      }
    }

    return interseccao;
  }
}
