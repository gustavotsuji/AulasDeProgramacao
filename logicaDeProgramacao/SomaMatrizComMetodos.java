class SomaMatrizComMetodos {
  static int[][] matrizA = {{2, 1},
                       {-3,2}};

  static int [][] matrizB = {{0, -1},
                        {2, 3}};

  public static void main(String[] args) {
    int [][] matrizC = {{0,0},
                        {0,0}};                  

    matrizC = somaMatriz();                    
    imprimeMatriz(matrizC);
  }

  public static int[][] somaMatriz(){
    int[][] matrizC = new int[2][2];
    for(int l = 0; l < matrizC.length; l++){
      for(int c = 0; c < matrizC[l].length; c++){
        matrizC[l][c] = matrizA[l][c] + matrizB[l][c];
      }
    }
    return matrizC;
  }

  public static void imprimeMatriz(int[][] matriz){
    for(int l = 0; l < matriz.length; l++){
      for(int c = 0; c < matriz[l].length; c++){
        System.out.print(matriz[l][c] + " ");
      }
      System.out.println("");
    }
  }
}
