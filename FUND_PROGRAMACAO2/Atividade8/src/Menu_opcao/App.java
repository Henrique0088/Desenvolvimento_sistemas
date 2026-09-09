package Menu_opcao;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite o primeiro numero");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero");
		n2 = leia.nextInt();

		System.out.println("Digite opção de 1 a 4");
		int opcao = leia.nextInt();
		
		   switch (opcao) {
		     case 1:
		    	System.out.println("A média é: "+ (n1 + n2) /2);
		    	break;
		     case 2:
		    	 if(n1 > n2) {
		    		 System.out.println("Soma: "+ n1 + n2);
		    	 } else if (n2 > n1) {
		    		 System.out.println("Subtrair: " + n1 + n2);
		    	 }
		    	 break;
		     case 3:
		    	 System.out.println("Multiplicar: "+ n1 * n2);
		    	 break;
		     case 4:
		    	 System.out.println("Dividir: "+ n1 / n2 );
		    	 break;
		     default:
		    	 System.out.println("Opção invalida");
		     
		    }
	}

}
