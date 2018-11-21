package br.com.iga.livraria.produtos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

	private double total;
	private List<Produto> produtos; // O List é uma interface

	public CarrinhoDeCompra() {
		this.produtos = new ArrayList<Produto>(); 
	}
	//public void adiciona(Livro livro) { // Ainda estamos recebendo um Livro como parâmetro para continuar usando o polimorfismo.
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}

	public double getTotal() {
		return total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
