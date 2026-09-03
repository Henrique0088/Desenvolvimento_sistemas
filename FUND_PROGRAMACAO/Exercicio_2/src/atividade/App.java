package atividade;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero1;
		
		System.out.println("Digite um número: ");
		numero1 = leia.nextInt();
		
		if(numero1 > 20) {
			System.out.println("Numero maior que 20");
		} else {
			System.out.println("Numero abaixo de 20");
		}
		

	}

}
