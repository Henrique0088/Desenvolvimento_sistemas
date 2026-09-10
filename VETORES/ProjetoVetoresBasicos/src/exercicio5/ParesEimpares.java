package exercicio5;

import java.util.Scanner;

public class ParesEimpares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[8];
		int  contadorPares = 0; 
		int contadorImpar = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º numero ");
			numeros[i] = leia.nextInt();
			
			if(numeros[i] % 2 == 0 ) {
				contadorPares++;
				System.out.println("Quantidade pares: " + contadorPares);
		    	 
		     } else {
		    	contadorImpar++;
		    	System.out.println("Quantidade impares: " + contadorImpar);
		     }
		}
    
	}

}
