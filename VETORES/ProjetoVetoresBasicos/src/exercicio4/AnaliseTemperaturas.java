package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	
	       
		        double[] temperaturas = new double[7];
		     
		        for (int i = 0; i < temperaturas.length; i++) {
		            System.out.print("Digite a temperatura do " + (i + 1) + "º dia: ");
		            temperaturas[i] = scanner.nextDouble();
		        }

		        
		        double maior = temperaturas[0];
		        double menor = temperaturas[0];

		   
		        for (int i = 1; i < temperaturas.length; i++) {
		            if (temperaturas[i] > maior) {
		                maior = temperaturas[i];
		            }

		            if (temperaturas[i] < menor) {
		                menor = temperaturas[i];
		            }
		        }

		      
		        System.out.println("\nTemperaturas cadastradas:");

		        for (int i = 0; i < temperaturas.length; i++) {
		            System.out.println((i + 1) + "º dia: " + temperaturas[i] + " °C");
		        }

		     
		        System.out.println("\nMaior temperatura: " + maior + " °C");
		        System.out.println("Menor temperatura: " + menor + " °C");

	
		    }
		}


	
