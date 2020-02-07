public class IPVA extends Imposto {
  final public static double taxaPadrao = 0.03;
  private double valorAutomovel;

  public IPVA(double valorBase){
    super(taxaPadrao);
    valorAutomovel = valorBase;
  } 

  public IPVA(double taxa, double valorBase){
    super(taxa);
    valorAutomovel = valorBase;
  }

    public double calculaImpostoDevido(){
    return super.calculaImpostoDevido(valorAutomovel);
  }
}
