public class livro {
	String titulo;
	String autor;
	int ano;
	String categoria;
	String posicao;
	boolean emprestado;
	
	void exibirlivro() {
		System.out.println("Titulo" + titulo + " Autor" + autor + ("ano: " + ano) );
		System.out.println("Categoria" + categoria + "Posicao" + posicao + "Emprestado" + emprestado);
	}
}
