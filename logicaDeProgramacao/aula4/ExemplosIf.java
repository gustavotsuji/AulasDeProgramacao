class ExemplosIf {
  public static void main(String[] args) {
    int alunosPresentesNaSegunda = 18;
    int alunasPresentesNaSegunda = 31;
    int alunosPresentesNaTerca = 16;
    int alunasPresentesNaTerca = 14;
    int alunosPresentesNaQuarta = 11;
    int alunasPresentesNaQuarta = 17;
    //System.out.println("Quantos alunos presentes na terca");
    //System.out.println(alunosPresentesNaTerca + alunasPresentesNaTerca);

    System.out.println("Teve mais alunos na segunda?");

    int totalDeAlunosNaSegunda = alunosPresentesNaSegunda + alunasPresentesNaSegunda;

    int totalDeAlunosNaTerca = alunosPresentesNaTerca + alunasPresentesNaTerca;

    int totalDeAlunosNaQuarta = alunosPresentesNaQuarta + alunasPresentesNaQuarta;

    int resultado = totalDeAlunosNaSegunda - totalDeAlunosNaTerca;

    //System.out.println(totalDeAlunosNaSegunda > totalDeAlunosNaTerca);

    if(totalDeAlunosNaSegunda > totalDeAlunosNaTerca){
        System.out.println("Sim");
    } else {
      System.out.println("Nao");
    }

    System.out.println("Qual dia teve mais aluno");
    
    boolean temMaisNaSegundaDoQueNaTerca = totalDeAlunosNaSegunda > totalDeAlunosNaTerca;

    boolean temMaisNaSegundaDoQueNaQuarta = totalDeAlunosNaSegunda > totalDeAlunosNaQuarta;

    boolean naoTemMaisNaSegundaDoQueNaQuarta = !(totalDeAlunosNaSegunda > totalDeAlunosNaQuarta);
    //boolean naoTemMaisNaSegundaDoQueNaQuarta = !temMaisNaSegundaDoQueNaQuarta;

    boolean temMaisNaTercaDoQueNaQuarta = totalDeAlunosNaTerca > totalDeAlunosNaQuarta;

    if(temMaisNaSegundaDoQueNaTerca && temMaisNaSegundaDoQueNaQuarta) {
      System.out.println("Segunda");

      if(alunosPresentesNaSegunda > alunasPresentesNaSegunda){
        System.out.println("Houve mais alunos");
      } else {
        System.out.println("Houve mais alunas");
      }

    } else if(temMaisNaTercaDoQueNaQuarta){
      System.out.println("Terca");
    
    } else {
      System.out.println("Quarta");
    
    }
    
    
  }
}