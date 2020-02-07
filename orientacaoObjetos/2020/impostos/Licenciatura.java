public class Licenciamento extends Imposto {
  public final static double taxaPadrao = 0.03;
  private double valorAutomovel;
  
  public Licenciamento(double valorBase){
    super(taxaPadrao);
    valorAutomovel = valorBase;
  }

  public Licenciamento(double taxa, double valorBase){
    super(taxa);
    valorAutomovel = valorBase;
  }

  public double calculaImpostoDevido(){
    return super.calculaImpostoDevido(valorAutomovel);
  }
}
