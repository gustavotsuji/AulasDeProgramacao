class BuscaDiaComMaisAlunos {
  public static void main(String[] args) {
    
    int[] alunos = new int[]{21, 23, 19, 20};
    String[] semana = new String[]{"Segunda", "Terca", "Quarta", "Quinta"};

    String diaDaSemanaQueTeveMaisAlunos = semana[0];
    int numeroMaximoDeAlunos = alunos[0];

    for(int indice = 0; indice < alunos.length; indice++){
      if(numeroMaximoDeAlunos < alunos[indice]){
        diaDaSemanaQueTeveMaisAlunos = semana[indice];
        numeroMaximoDeAlunos = alunos[indice];
      }
    }

    System.out.println("O dia que teve mais alunos foi: " + diaDaSemanaQueTeveMaisAlunos);

  }
}