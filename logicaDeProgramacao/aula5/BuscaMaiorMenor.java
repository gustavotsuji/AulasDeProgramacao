class ImprimeMatriz {
  public static void main(String[] args) {
    int[] meuArray = new int[]{1, 2, 4, 7, 8};

    System.out.println("O maior elemento eh:");
    System.out.println(meuArray[meuArray.length - 1]);

    System.out.println("O menor elemento eh:");
    System.out.println(meuArray[0]);

    int[] meuArrayDesordenado = new int[]{5, 7, 3, 2, 6, 4};

    int maior = meuArrayDesordenado[0];
    int menor = meuArrayDesordenado[0];
    for(int i = 1; i < meuArrayDesordenado.length ; i++){
        if(maior < meuArrayDesordenado[i]){
          maior = meuArrayDesordenado[i];
        } else if(menor > meuArrayDesordenado[i]){
          menor = meuArrayDesordenado[i];
        }
        System.out.println(maior);
        System.out.println(menor);
        System.out.println("--------------");
    }
  }
}
