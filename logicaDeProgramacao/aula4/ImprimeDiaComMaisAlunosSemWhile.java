class ImprimeDiaComMaisAlunosSemWhile {
  public static void main(String[] args) {
    int alunosNaSegunda = 21;
    int alunosNaTerca = 23;
    int alunosNaQuarta = 19;
    int alunosNaQuinta = 20;

    String diaDaSemanaQueTeveMaisAlunos = "Segunda";
    int numeroMaximoDeAlunos = alunosNaSegunda;

    if(numeroMaximoDeAlunos < alunosNaTerca){
      diaDaSemanaQueTeveMaisAlunos = "Terca";
      numeroMaximoDeAlunos = alunosNaTerca;
    }

    if(numeroMaximoDeAlunos < alunosNaQuarta){
      diaDaSemanaQueTeveMaisAlunos = "Quarta";
      numeroMaximoDeAlunos = alunosNaQuarta;
    }

    if(numeroMaximoDeAlunos < alunosNaQuinta){
      diaDaSemanaQueTeveMaisAlunos = "Quinta";
      numeroMaximoDeAlunos = alunosNaQuinta;
    }

    System.out.println("O dia que teve mais alunos foi: " + diaDaSemanaQueTeveMaisAlunos);

  }
}