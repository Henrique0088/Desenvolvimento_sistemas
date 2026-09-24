package livr;

public class App {

	public static void main(String[] args) {
	   Livro l1 = new Livro();
	   
	   l1.setTitulo("7 Reinos");
	   l1.setAutor("Machado de assis");
	   l1.setEditora("Marvel");
	   l1.setNuPaginas(500);
	   l1.setAnoPublicacao(2011);
	   
	   l1.exibirDados();
	   
	   System.out.println("");
	   
	   Livraria l2 = new Livraria();
	   
	   l2.setPreco(20.00);
	   l2.setQtdEstoque(10);
			
	   l2.exibirDados();

	}

}
