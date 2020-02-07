public class IRPF extends Imposto {
 
  public final static double taxaPadrao = 0.17; 
  private double rendaAnual;

  public IRPF(double valorBase){
    super(taxaPadrao);
    rendaAnual = valorBase;
  }

  public IRPF(double taxa, double valorBase){
    super(taxa);
    rendaAnual = valorBase;
  }

  public double calculaImpostoDevido(){
    return super.calculaImpostoDevido(rendaAnual);
  }
}
