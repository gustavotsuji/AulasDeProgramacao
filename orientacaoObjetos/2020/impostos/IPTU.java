public class IPTU extends Imposto {
  final public static double taxaPadrao = 0.002;
  private double valorImovel;

  public IPTU(double valorBase){
    super(taxaPadrao);
    valorImovel = valorBase;
  }

  public IPTU(double taxa, double valorBase){
    super(taxa);
    valorImovel = valorBase;
  }

  public double calculaImpostoDevido(){
    return super.calculaImpostoDevido(valorImovel);
  }
}
