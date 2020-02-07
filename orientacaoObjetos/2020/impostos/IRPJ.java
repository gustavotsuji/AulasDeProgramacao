public class IRPJ extends Imposto {
  final public static double taxaPadrao = 0.09;
  private double faturamentoAnual;

  public IRPJ(double valorBase){
    super(taxaPadrao);
    faturamentoAnual = valorBase;
  }

  public IRPJ(double taxa, double valorBase){
    super(taxa);
    faturamentoAnual = valorBase;
  }

  public double calculaImpostoDevido(){
    if(faturamentoAnual > 10000){
      return faturamentoAnual * getTaxa();
    }
    return 0;
  }
}
