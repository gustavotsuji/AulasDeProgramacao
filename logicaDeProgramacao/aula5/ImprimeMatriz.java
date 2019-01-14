class ImprimeMatriz {
  public static void main(String[] args) {
    int[][] matriz = {{1, 3,-1}, {0, 2, 7}, {-2, 8, 1}};


    for(int l = 0; l < matriz.length; l++){
      for(int c = 0; c < matriz[l].length; c++){
        System.out.print(matriz[l][c] + " ");   
      }
      System.out.println(""); 
    }
  }
}
