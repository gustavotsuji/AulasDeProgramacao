class ExemplosIteradores {
  public static void main(String[] args) {
    int contador = 0;

    //Exemplo de while
    while(contador <= 10){
      System.out.println(contador);
      System.out.println("Loop infinito");
      contador++;
    }

    //Exemplo de for
    for(contador = 0; contador <= 10; ++contador){
      System.out.println(contador);
      System.out.println("Loop infinito");
    }

    //aqui seria um loop infinito se nao houvesse o break 
    while(true){
      System.out.println("Comecou o loop");
      break;
    }

    //Exemplo de do while
    do {
      System.out.println(contador);
      System.out.println("Loop infinito");
      contador++;
    } while(contador <= 10);
  }
}