package contaBancaria;

public class App {

	public static void main(String[] args) {
	  conta c1 = new conta();
	  
	  c1.setNomeConta("Henrique");
	  c1.setNuConta(20);
	  c1.setSaldo(2.00);
	  
	  c1.depositar(2.00);
	  
	  c1.exibirDados();
	  

	}

}
