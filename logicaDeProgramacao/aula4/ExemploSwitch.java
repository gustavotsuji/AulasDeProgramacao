
class ExemploSwitch {
  public static void main(String[] args) {
    char codigoDaAreaDoEstudante = 'E';

    //Como seria o codigo usando apenas ifs e else ifs
    /*if(codigoDaAreaDoEstudante == 1) {
      System.out.println("Exatas");
    } else if(codigoDaAreaDoEstudante == 2){
      System.out.println("Humanas");
    } else if(codigoDaAreaDoEstudante == 3) {
      System.out.println("Biologicas");
    }*/

    switch(codigoDaAreaDoEstudante){
      case 'E':
        System.out.println("Exatas");
        break;
      case 'H':
        System.out.println("Humanas");
        break;
      case 'B':
        System.out.println("Biologicas");
        break;
      default:
        System.out.println("Nao eh um aluno");
        break;  
    }

  }
}