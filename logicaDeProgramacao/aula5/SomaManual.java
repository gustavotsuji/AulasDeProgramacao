class SomaManual {
  public static void main(String[] args) {
    int[] vetorA = new int[]{0,1,3};
    int[] vetorB = new int[]{-1,0,-3};
    int[] vetorC = new int[3];

    int indice = 0;
    while(indice < vetorC.length){
      vetorC[indice] = vetorA[indice] + vetorB[indice];
      indice++;
    }

    //Soma manual

    /*vetorC[0] = vetorA[0] + vetorB[0];
    vetorC[1] = vetorA[1] + vetorB[1];
    vetorC[2] = vetorA[2] + vetorB[2];
    */
}
