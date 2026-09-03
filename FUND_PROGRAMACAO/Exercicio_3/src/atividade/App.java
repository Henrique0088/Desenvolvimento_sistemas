package atividade;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite um número: ");
		idade = leia.nextInt();
		
		if (idade < 5) {
		    System.out.println("Nenhuma categoria");
		} else if (idade >= 5 && idade <= 7) {
		    System.out.println("Infantil");
		} else if (idade >= 8 && idade <= 10) {
		    System.out.println("Juvenil");
		} else if (idade >= 11 && idade <= 15) {
		    System.out.println("Adolescente");
		} else if (idade >= 16 && idade <= 30) {
		    System.out.println("Adulto");
		} else {
		    System.out.println("Sênior");
		}

			
		
		

	}

}
