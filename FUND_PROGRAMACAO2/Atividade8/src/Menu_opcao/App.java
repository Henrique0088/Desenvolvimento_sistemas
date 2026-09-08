package Menu_opcao;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2;
		int media;
		
		System.out.println("Digite o primeiro numero");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero");
		n2 = leia.nextInt();

		System.out.println("Digite opção de 1 a 4");
		int opcao = leia.nextInt();
		
		   switch (opcao) {
		     case 1:
		    	media = (n1 + n2) / 2
		    	break;
		     case 2:
		    	 System.out.println("Segundo");
		    	 break;
		     case 3:
		    	 System.out.println("Terça");
		    	 break;
		     case 4:
		    	 System.out.println("Quarta");
		    	 break;
		     default:
		    	 System.out.println("Opção invalida");
		     
		    }
	}

}
