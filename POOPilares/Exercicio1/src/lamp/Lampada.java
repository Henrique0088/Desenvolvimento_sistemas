package lamp;

public class Lampada {
	
  private String nome;
  private double preco;
  private int quantidade;
  boolean Luzligada;
  
  public Lampada(String nome, double preco, int quantidade) {
	super();
	this.nome = nome;
	this.preco = preco;
	this.quantidade = quantidade;
	this.Luzligada = Luzligada;
  }
   
  public Lampada() {
	super();
	this.nome = "";
	this.preco = 0.0;
	this.quantidade = 0;
	this.Luzligada = true;
		
}

  void ligada () {
	  Luzligada = true;
	  System.out.println("Luz está ligada");
  }
  
  void desligado () {
	  Luzligada = false;
	  System.out.println("Luz está desligada");
	  
  }
  public boolean isLuzligada() {
	return Luzligada;
}

  public void setLuzligada(boolean luzligada) {
	Luzligada = luzligada;
  }

  public String getNome() {
	return nome;
  }

  public void setNome(String nome) {
	  
	  if(nome.isEmpty()) {
		  System.out.println("Nome não preenchido");
 	  } else {
 		  this.nome = nome;  		  
 	  }
  }

  public double getPreco() {
	return preco;
  }

  public void setPreco(double preco) {
	  
	  if (preco < 0) {
		  System.out.println("Preco abaixo de 0");
	  } else {
	this.preco = preco;
	  }
  }

  public int getQuantidade() {
	return quantidade;
  }

  public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
  }
  
  void exibirDados () {
	  System.out.println("Nome: " + nome);
	  System.out.println("Preço: " + preco);
	  System.out.println("Quantidade: " + quantidade);
	  System.out.println("Estado da lampáda: " + Luzligada);
  }
  
}
