package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<>();
		String tarefa;
		String continuar;
		
		do {
			System.out.print("Digite uma Tarefa: ");
			tarefa = leia.nextLine();
			
			tarefas.add(tarefa);
			
			System.out.print("Deseja cadastrar outra tarefa? (s/n): ");
			continuar = leia.nextLine();
			
		} while (continuar.equalsIgnoreCase("s"));
		
		System.out.println("\nTarefas cadastradas: ");
		
		for(String tarefasCadastrada : tarefas) {
			System.out.println(tarefasCadastrada);
		}
		
	leia.close();	
	}

}
