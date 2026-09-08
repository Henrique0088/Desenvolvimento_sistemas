package atividade4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	double base,altura;
	
	
	System.out.println("Digite a altura: ");
	altura = leia.nextDouble();
	
	System.out.println("Digite a base: ");
	base = leia.nextDouble();
	
	do {
	
		System.out.println("Digite a altura: ");
		altura = leia.nextDouble();
		
		System.out.println("Digite a base: ");
		base = leia.nextDouble();
		
	 if(altura <= 0 || base <= 0) {
		 System.out.println("Erro");
	 }
	
	 System.out.println("Valor: " + (base * altura)/2);
} while(altura <= 0 || base <= 0);

	
 }
}