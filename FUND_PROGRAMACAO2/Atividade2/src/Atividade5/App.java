package Atividade5;

import java.util.Scanner;

public class App {

	public static void main (String[] args) {
	Scanner escreva = new Scanner(System.in); 
	
	int numero = escreva.nextInt();
	
	System.out.println("Tabuada");
	
	do {
	if(numero >= 1 && numero <= 10) {
		System.out.println("Digite a tabuada de 1 a 10 que deja visualizar");
		numero = escreva.nextInt();
	}
	
	} while (numero < 0 && numero> 10 );
	
	for (int i = 1; i <=10; i++) {
		if(numero == 1) {
			System.out.println(numero + "x" + "+" + numero *i);
		}
		
		}
		
	}
	
	}
	
	


