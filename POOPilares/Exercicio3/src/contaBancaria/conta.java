package contaBancaria;



public class conta {
	private String nomeConta;
	private int nuConta;
	private double saldo;
	private boolean vsualizarConta;
	private String depositar;

	public conta(String nomeConta, int nuConta, double saldo) {
		super();
		this.nomeConta = nomeConta;
		this.nuConta = nuConta;
		this.saldo = saldo;
		this.vsualizarConta = vsualizarConta;
	}

	public conta() {
       super();
       this.nomeConta = "";
       this.nuConta = 0;
       this.saldo = 0.0;
       
       if(saldo >= 0) {
    	   saldo = saldo;
       } else {
    	   System.out.println("Não é permitido valor abaixo de 0");  
       }

	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		} else {
			System.out.println("Não é possível depositar valor abaixo de 0");
		}
	}

	public void sacar(double saque) {
		if (saque <= 0) {
			System.out.println("Não é possível sacar valor abaixo de 0");
		} else if (saque > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo -= saque;
			System.out.println("Saque realizado com sucesso!");
		}
    	 
     }

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public int getNuConta() {
		return nuConta;
	}

	public void setNuConta(int nuConta) {
		this.nuConta = nuConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void exibirDados() {
		System.out.println("Nome: "+ getNomeConta());
		System.out.println("Numero da conta: "+ getNuConta());
		System.out.println("Saldo da conta: "+ getSaldo());
		
	 }
	}

