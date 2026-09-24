package contaBancaria;

public class contaEspecial extends conta {
   private double limiteCredito;
   
   private double limite;

   public contaEspecial(String nomeConta, int nuConta, double saldo, double limiteCredito) {
	super(nomeConta, nuConta, saldo);
	this.limiteCredito = limiteCredito;
   }

   public contaEspecial(String nomeConta, int nuConta, double saldo) {
	super(nomeConta, nuConta, saldo);
	this.limiteCredito = 0.0;
	
   }
   
   @Override
   public void sacar(double saque) {
      if(saque > (getSaldo() + limite) {
    	  System.out.println("Saque acima do limite");
      }
 }
}   