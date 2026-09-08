package dia_semana;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
    	System.out.println("Escolha opção de 1 a 7");
    	int opcao = leia.nextInt();
    	
    
    switch (opcao) {
     case 1:
    	System.out.println("Domingo");
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
     case 5:
    	 System.out.println("Quinta");
    	 break;
     case 6:
    	 System.out.println("Sexta");
    	 break;
     case 7:  
    	 System.out.println( "Sabado");
    	 break;
    	 
     default:
    	 System.out.println("Opção invalida");
     
    }
	}

}
