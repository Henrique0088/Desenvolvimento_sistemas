package switchArray2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> alunos = new ArrayList<>();
		ArrayList<Double> notas = new ArrayList<>();
		int opcao;
		
		do {
		  System.out.println("1- Cadastrar aluno / 2- Listar Alunis / 3- Procurar aluno / 4- Alterar nota / 5- Remover aluno / 6- Media da turma / 7- Maior e menor nota / 8- Situação dos alunos / 9- Encerrar");
	      System.out.print("Escolha uma opção: ");

          opcao = Integer.parseInt(leia.nextLine());
          
          switch (opcao ) {
           
          case 1: {
        	  
        	  System.out.println("Digite nome do aluno: ");
        	  String nome = leia.nextLine();
        	  
        	  System.out.println("Digite nota do aluno: ");
        	  Double nota = leia.nextDouble();
        	  
        	  break;
          }
          
          case 2: {
        	  
              System.out.println("Lista de alunos:");

              if (alunos.isEmpty()) {
                  System.out.println("A lista está vazia!");
              } else {
                  System.out.println(alunos);
              }

              break;
          }
          
          case 3: {
        	  
              System.out.print("Nome de alunos: ");
              String nomeProcurado = leia.nextLine();

              if (alunos.contains(nomeProcurado)) {
                  int posicao = alunos.indexOf(nomeProcurado);

                  System.out.println("Convidado encontrado na posição: " + posicao);
              } else {
                  System.out.println("Não encontrado!");
              }

              break;
          }
          
          case 4: {
        	  
              System.out.print("Posição do convidado: ");
              int posicao = Integer.parseInt(leia.nextLine());

              if (posicao >= 0 && posicao < notas.size()) {

                  System.out.print("Digite o novo nome: ");
                  Double novaNota = leia.nextDouble();

                  notas.set(posicao, novaNota);

                  System.out.println("Nota alterado!");

              } else {
                  System.out.println("Posição inválida!");
              }

              break;
          }
           
          case 5: {
        	  
              System.out.print("Nome do aluno: ");
              String nomeRemover = leia.nextLine();

              if (alunos.contains(nomeRemover)) {
                  alunos.remove(nomeRemover);
                  System.out.println("Aluno removido!");
              } else {
                  System.out.println("Não encontrado!");
              }

              break;
          }
          
          case 6: {
        	  
        	  if (notas.isEmpty()) {
        		  System.out.println("Lista de notas vazia");
        	  } 
        	  
        	  System.out.println("A média da turma: ");
        	  double media = 0;
        			  
        	 for(double nota : notas) {
        		
        	 }
    
          }
          }
		
		} while (opcao != 9);
	}

}
