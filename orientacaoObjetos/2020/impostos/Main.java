class Main {
  public static void main(String[] args) throws Exception {
    
    Imposto[] impostos = {
                          new IPTU(200000),
                          new IPVA(30000),
                          new IRPF(4000),
                          new IRPJ(150000)
                         };

    double impostoDevido = 0;
    for(int i = 0; i < impostos.length; i++){
      try {
        impostoDevido += impostos[i].calculaImpostoDevido();
      } catch (IndexOutOfBoundsException ioobException){
        break;
      } catch(RuntimeException rException){
        System.out.println("Ocorreu um erro aqui!");
        throw new Exception("Erro fatal!!!");
      } finally {
         
      }
    }

    for(Imposto imposto : impostos){
      if(imposto instanceof IPTU){
        //System.out.println(imposto.calculaImpostoDevido());
      }

     // System.out.println(imposto.getClass().getName());
    }

    Filho f = new Filho();
    f.a();

    //System.out.println(impostoDevido);
  }
}
