public abstract class Imposto {
  private double taxa;

  protected Imposto(double taxa){
    if(taxa > 0) {
      this.taxa = taxa;
    } else {
      throws new RuntimeException("Sua taxa é negativa");
    }
  }

  public abstract double calculaImpostoDevido();

  protected double calculaImpostoDevido(double valor) throws Exception {
    if(valor > 0){
      return valor * taxa;
    }
    throw new Exception("O valor é negativo");
  }

  public String toString(){
    return "Taxa: "+ taxa;
  }

  protected double getTaxa(){
    return this.taxa;
  }
}
