package livr;

public class Livraria extends Livro {

	private double preco;
	private int qtdEstoque;
	
	public Livraria(String titulo, String editora, String autor, int anoPublicacao, int nuPaginas, double preco,
			int qtdEstoque) {
		super(titulo, editora, autor, anoPublicacao, nuPaginas);
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	

	public Livraria() {
		super();
		this.preco = 0;
		this.qtdEstoque = 0;
	}


	public Livraria(String titulo, String editora, String autor, int anoPublicacao, int nuPaginas) {
		super(titulo, editora, autor, anoPublicacao, nuPaginas);
	}


	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	@Override
	public void exibirDados () {
		   System.out.println("Titulo: " + getTitulo());
		   System.out.println("Autor: " + getAutor());
		   System.out.println("Editora: " + getEditora());
		   System.out.println("Ano de publicação: " + getAnoPublicacao());
		   System.out.println("Numero de paginas: " + getNuPaginas());
		   System.out.println("Preço: " + getPreco());
		   System.out.println("Quantidade de Estoque: " + getQtdEstoque());
	}
}
