package academia;

public class Principal {

	public static void main(String[] args) {
	 AlunoAcademia ac1 = new AlunoAcademia ();
	 
	 ac1.nome = "Ana";
	 ac1.idade = 17;
	 ac1.peso = 60;
	 ac1.altura = 1.65; 
	 
	 ac1.exibirDados();
	 
	 ac1.nome = "Bruno";
	 ac1.idade = 23;
	 ac1.peso = 70;
	 ac1.altura = 1.80;

	 
	 ac1.exibirDados();
	}

}
