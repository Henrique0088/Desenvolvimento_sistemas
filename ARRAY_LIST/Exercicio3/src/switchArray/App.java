package switchArray;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        int opcao;

        do {

            System.out.println("\n1-Adicionar / 2-Alterar / 3-Remover / 4-Procurar / 5-Exibir / 6-Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(leia.nextLine());

            switch (opcao) {

                case 1: {
                    System.out.print("Nome do convidado: ");
                    String nome = leia.nextLine();

                    nomes.add(nome);

                    System.out.println("Convidado adicionado!");
                    break;
                }

                case 2: {
                    System.out.print("Posição do convidado: ");
                    int posicao = Integer.parseInt(leia.nextLine());

                    if (posicao >= 0 && posicao < nomes.size()) {

                        System.out.print("Digite o novo nome: ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                        String novoNome = leia.nextLine();

                        nomes.set(posicao, novoNome);

                        System.out.println("Nome alterado!");

                    } else {
                        System.out.println("Posição inválida!");
                    }

                    break;
                }

                case 3: {
                    System.out.print("Nome do convidado: ");
                    String nomeRemover = leia.nextLine();

                    if (nomes.contains(nomeRemover)) {
                        nomes.remove(nomeRemover);
                        System.out.println("Convidado removido!");
                    } else {
                        System.out.println("Não encontrado!");
                    }

                    break;
                }

                case 4: {
                    System.out.print("Nome do convidado: ");
                    String nomeProcurado = leia.nextLine();

                    if (nomes.contains(nomeProcurado)) {
                        int posicao = nomes.indexOf(nomeProcurado);

                        System.out.println("Convidado encontrado na posição: " + posicao);
                    } else {
                        System.out.println("Não encontrado!");
                    }

                    break;
                }

                case 5: {
                    System.out.println("Lista de convidados:");

                    if (nomes.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        System.out.println(nomes);
                    }

                    break;
                }

                case 6: {
                    System.out.println("Programa encerrado!");
                    break;
                }

                default: {
                    System.out.println("Opção inválida!");
                    break;
                }
            }

        } while (opcao != 6);

        leia.close();
    }
}
