package br.com.iga.teste;

import java.util.List;

import br.com.iga.livraria.Autor;
import br.com.iga.livraria.produtos.CarrinhoDeCompra;
import br.com.iga.livraria.produtos.Ebook;
import br.com.iga.livraria.produtos.Livro;
import br.com.iga.livraria.produtos.LivroFisico;
import br.com.iga.livraria.produtos.Produto;

public class RegistroVendas {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Mauricio de Souza");

		Livro fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven-Development");
		fisico.setValor(59.90);

		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven-Development");
		ebook.setValor(29.90);

		CarrinhoDeCompra carrinho =  new CarrinhoDeCompra();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);

		System.out.println("Total: " + carrinho.getTotal());
		
		List<Produto> produtos = carrinho.getProdutos();

		// usando o enhanced-for
		for(Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
		/*for(int i=0; i <= produtos.length; i++) { // pega a tamanho da lista de produtos
			try {
				Produto produto = produtos[i]; // Armazena cada produtos na variável produto
				//System.out.println(produto);
				if(produto != null) { // verifica se o produto é nulo
					System.out.println(produto.getValor()); // caso não for nulo imprimi o valor do produto
				}
			//Nesse caso, dentro do catch podemos colocar o código que queremos executar apenas quando uma exception do tipo declarado acontecer.	
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("deu exception no índice: " + i);
			}catch(NullPointerException e) { // ou fazer algo mais generico
				System.out.println("Array não foi instanciado! ");
				//e.printStackTrace();
			}
		}*/
		
		System.out.println("Fui executado");

	}

}
