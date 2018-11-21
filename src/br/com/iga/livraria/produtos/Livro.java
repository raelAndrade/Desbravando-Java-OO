package br.com.iga.livraria.produtos;

import br.com.iga.livraria.Autor;
import br.com.iga.livraria.exception.AutorNuloException;

// Um livro é apenas uma abstração de tudo que os diferentes tipos de livro devem ter (herdar) em nossa livraria
public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private boolean impresso;

	// Adicionando um atributo do tipo Autor
	// Isso é chamado de composição
	public Autor autor;

	// void é o tipo de retorno e seguido com o nome do método
	/*
	 * Void é uma palavra reservada, ou seja, não estamos retornando nada e, sim
	 * apenas executando uma instrução dentro do método
	 */
	public void mostrarDetalhes() {
		String mensagem = "******** Mostrando os detalhes do livro ********";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("ISBN: " + isbn);
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("\n------------------------------------------------");
	}

	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}

	public boolean temAutor() {
		return this.autor != null;
	}

	// CONSTRUTORES
	public Livro(Autor autor) {
		// encadeando a chamada dos construtores utilizando a palavra reservada 'this'
		// this(); 
		if (autor == null) {
			/**
			 * Repare que a palavra reservada throw precede a exception que está sendo
			 * disparada, neste caso uma RuntimeException.
			 */ 
			throw new AutorNuloException("O Autor do Livro não pode ser nulo");
		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public boolean isImpresso() {
		return impresso;
	}

	public void setImpresso(boolean impresso) {
		this.impresso = impresso;
	}

//	@Override
//	public void toString() {
//		System.out.println("Nome: " + this.nome);
//		System.out.println("Descrição: " + this.descricao);
//		System.out.println("Valor: " + this.valor);
//		System.out.println("ISBN: " + this.isbn);
//
//		if (this.temAutor()) {
//			autor.toString();
//		}
//		System.out.println("--");
//	}
	
//	@Override
//	public int compareTo(Produto outro) {
//		if(this.getValor() < outro.getValor()) {
//			return -1;
//		}
//		if(this.getValor() > outro.getValor()) {
//			return 1;
//		}
//		return 0;
//	}
	
	@Override
	public int compareTo(Produto outro) {
		return (int) (this.getValor() - outro.getValor());
	}
}
