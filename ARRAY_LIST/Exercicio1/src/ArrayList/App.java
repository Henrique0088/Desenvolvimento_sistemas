package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		String nome;
		String continuar;
		
		do {
			System.out.print("Digite um numero:");
			nome = input.nextLine();
			
			nomes.add(nome);
			
			System.out.print("Deseja adicionar outro nome? (s/n): ");
			continuar = input.nextLine();
			
		} while (continuar.equalsIgnoreCase("S'"));
		
       System.out.println("\nNomes cadastrados: ");
       
       for (String nomeCadastrado : nomes) {
    	   System.out.println(nomeCadastrado);
       }
       
       input.close();
	}

}
