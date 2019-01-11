class Palindrome {
  public static void main(String[] args) {
    int numero1 = 6136;

    int primeiro = numero1/1000;
    int ultimoDigito = numero1%10;

    System.out.println(primeiro);
    System.out.println(ultimoDigito);

    if(primeiro == ultimoDigito) {
      System.out.println("Eh palindromo");
    } else {
      System.out.println("Nao eh palindromo");
    }
  }
}