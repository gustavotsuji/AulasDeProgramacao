class TesteDelta {
  public static void main(String[] args) {
    double a = 1.0;
    double b = 0.0;
    double c = 4.0;

    //double x1 = 0.0;
    //double x2 = 0.0;

    double delta = Math.pow(b, 2) - 4 * a * c;
    if(delta > 0.0) {
      System.out.println("Tem duas raizes reais");
    } else if (delta == 0.0) {
      System.out.println("Tem uma raiz real");
    } else {
      System.out.println("Nao tem raiz real");
    }
  }
}
