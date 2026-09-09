package investimento_Carlos_joao;

public class App {

	public static void main(String[] args) {
		double carlos = 3000.00;
		double joao = 1000.00;
 
        int contador = 0;
		
		do {
		
		carlos = carlos * 1.02;
		joao = joao * 1.05;
		contador++;
	
		}while (carlos > joao);
	
		System.out.println("Mêses necessario: "+ contador);
		System.out.println("Valor acumulado por carlos: R$ " + String.format("%.2f", carlos));
		System.out.println("Valor acumulado por joão: R$ " + String.format("%.2f", joao));
}
}