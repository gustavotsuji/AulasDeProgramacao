class BuscaMaiorEMenorElemento {
  public static void main(String[] args) {
    int[][] matriz = {{1, 3,-1}, {0, 2, 7}, {-2, 8, 1}};

    int maior = matriz[0][0];
    int menor = matriz[0][0];
    for(int l = 0; l < matriz.length; l++){
      for(int c = 0; c < matriz[l].length; c++){
        if(menor > matriz[l][c]) {
        	menor = matriz[l][c];
        } else if(maior < matriz[l][c]){
        	maior = matriz[l][c];
        }
      }
    }

    System.out.println("O maior eh " + maior);
    System.out.println("O maior eh " + menor);

  }
}
