package switchArray;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
  
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		int opcao;
	
	    
	    do {
	    	
	    	System.out.println("1-Adicionar / 2-Alterar / 3-Remover / 4-Procurar / 5-Exibir / 6-Encerrar");
	    	opcao = Integer.parseInt(leia.nextLine());
	    	
	    	switch (opcao) {
	    	case 1:
	    		
	    	     String nome;
	    	     
	    		 System.out.println("Nome do convidade: ");
	    		 nome = leia.nextLine();
	    		 
	    		 nomes.add(nome);
	    		 break;
	    	
	    	case 2:
	    	
	    		int posicao;
	    		
	    		System.out.println("Posição do convidado: ");
	    		int posicao = Integer.parseInt(leia.nextLine());
	    		
	    		if (posicao == nomes) {
	    			nomes.set();
	    		} else {
	    			System.out.println("Posição invalida!");
	    		}
	    		 break;
	    		
	    	case 3: 
	    		
 	    		System.out.print("Nome do convidado: ");
	    		String nomeRemover1 = leia.nextLine();
	    		
	    		if(nomes.contains(nomeRemover1)) {
	    			nomes.remove(nomeRemover1);
	    		} else {
	    			System.out.println("Não encontrado");
	    			
	    		}
	    		break;
	    		
	    	case 4:
	    		
	    		System.out.println("Nome do convidado: ");
	    		String nomeProcurado = leia.nextLine();
	    		
	    		int posicaoEncontrada = nomes.indexOf(nomeProcurado);
	    		
	    		if (posicaoEncontrada >= 0) {
	    			System.out.println("Posicao: " + posicaoEncontrada);
	    		} else {
	    			System.out.println("Não encontrado");
	    		}
	    		
	    	
	    	break;
	       
	    	case 5: 
	    		
	    		System.out.println("Lista de convidados");
	    		System.out.println(nomes);
	    		
	    		break;
	    		
	    	case 6: 
	    		
	    		System.out.println("Programa encerrado");
	    		
	    	}while(opcao != 0);		
	   
	    }
  }
}