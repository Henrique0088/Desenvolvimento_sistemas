package Quadrado_cubo_raiz;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        double numero = 1;

		        while (numero > 0) {
		            System.out.print("Digite um número positivo (0 ou negativo para sair): ");
		            numero = scanner.nextDouble();

		            if (numero > 0) {
		                System.out.println("Valor digitado: " + numero);
		                System.out.println("Quadrado: " + (numero * numero));		                System.out.println("Cubo: " + (numero * numero * numero));
		                System.out.println("Raiz quadrada: " + Math.sqrt(numero));
		                System.out.println();
		            }
		        }

		        System.out.println("Programa encerrado.");
		        scanner.close();
		    }
		}


