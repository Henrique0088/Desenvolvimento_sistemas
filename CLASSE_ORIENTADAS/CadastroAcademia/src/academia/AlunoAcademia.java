package academia;

public class AlunoAcademia {
	  String nome;
	   int idade;
	   double peso;
	   double altura;

	
	public AlunoAcademia() {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}


		boolean ehMenorDeIdade() {
			
		    if (idade < 18) {
		        return true;
		    } else {
		        return false;
		    }
		}
	
		double calcularIMC() {
			double calculo;
			
			calculo = peso / (altura * altura);
			
			return calculo;
		}
		
		public void exibirDados () {
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Peso: " + peso);
			System.out.println("Altura: " + altura);
			System.out.println("Calculo do IMC: " );
							
		}	
			
		}

	
