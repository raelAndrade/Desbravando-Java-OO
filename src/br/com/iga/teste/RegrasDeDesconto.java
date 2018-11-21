package br.com.iga.teste;

import br.com.iga.livraria.Autor;
import br.com.iga.livraria.produtos.Livro;
import br.com.iga.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {

	public static void main(String[] args) {

		Autor autor = new Autor(); // criando uma instancia da classe Autor
		autor.setNome("Rodrigo Turini");
		
		/*Livro livro =  new LivroFisico(autor);
		livro.setValor(59.90);*/

		/*if(!livro.aplicarDescontoDe(0.3)) {
			System.out.println("Desconto no livro não pode ser maior do que 30%");
		}else {
			System.out.println("Valor do livro com desconto: "
					+ livro.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if(!ebook.aplicarDescontoDe(0.15)) {
			System.out.println("Desconto no ebook não pode ser maior do que 15%");
		}else {
			System.out.println("Valor do ebook com desconto: "
					+ ebook.getValor());
		}*/
		
		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
		/*if(!livro.aplicarDescontoDe(0.3)) {
			System.out.println("Desconto no livro não pode ser maior do que 30%");
		}else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}*/
	}

}
