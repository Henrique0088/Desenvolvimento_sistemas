package livr;

public class Livro {
   private String titulo, editora, autor;
   private int anoPublicacao, nuPaginas;
   
   public Livro(String titulo, String editora, String autor, int anoPublicacao, int nuPaginas) {
	super();
	this.titulo = titulo;
	this.editora = editora;
	this.autor = autor;
	this.anoPublicacao = anoPublicacao;
	this.nuPaginas = nuPaginas;
   }

   public Livro() {
	   
	super();
	this.titulo = "";
	this.editora = "";
	this.autor = "";
	this.anoPublicacao = 0;
	this.nuPaginas = 0;
	
   }

   public String getTitulo() {
	return titulo;
   }

   public void setTitulo(String titulo) {
	   
	   if(titulo.isEmpty()) {
		   System.out.println("Nome vázio");
	   } else {
	this.titulo = titulo;
	   }
   }

   public String getEditora() {
	return editora;
   }

   public void setEditora(String editora) {
	   
	   if(editora.isEmpty()) {
		   System.out.println("Editóra vázia");
	   } else {
	this.editora = editora;
	   }
   }

   public String getAutor() {
	return autor;
   }

   public void setAutor(String autor) {
	   
	   if(autor.isEmpty()) {
		   System.out.println("Autor vázia");
	   } else {
	this.autor = autor;
	   }
   }

   public int getAnoPublicacao() {
	return anoPublicacao;
   }

   
   public void setAnoPublicacao(int anoPublicacao) {
	   if(anoPublicacao < 0) {
		   System.out.println("ano de publicação vázia");
	   } else {
	this.anoPublicacao = anoPublicacao;
	   }
   }

   public int getNuPaginas() {
	return nuPaginas;
   }

   public void setNuPaginas(int nuPaginas) {
	   
	   if(nuPaginas < 0) {
		   System.out.println("Numero de paginas vázia");
	   } else {
	this.nuPaginas = nuPaginas;
	   }
   }
   
   public void exibirDados () {
	   System.out.println("Titulo: " + titulo);
	   System.out.println("Autor: " + autor);
	   System.out.println("Editora: " + editora);
	   System.out.println("Ano de publicação: " + anoPublicacao);
	   System.out.println("Numero de paginas: " + nuPaginas);
   }
   
}