package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0;
		double media = 0;
		
		for(int  i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º nota ");
			notas[i] = leia.nextInt();
			
			soma += notas[i];
		}
     media = soma / notas.length;
     
     System.out.println("Soma das notas: "+ soma);
     System.out.printf("\nMédia: %.2f%n", media);
	}
}
