package br.com.iga.livraria.produtos;

import br.com.iga.livraria.Autor;

public class Ebook extends Livro implements Promocional{

	public Ebook(Autor autor) {
		// utilizamos a palavra 'super' para delegar a responsabilidade para a superclasse que já tem esse comportamento bem defnido.
		super(autor); 
	}

	private String waterMark;

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) { // o método 'set' não retorna nada
		this.waterMark = waterMark;
	}
	
	/*@Override
	public boolean aplicarDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		System.out.println("Aplicando desconto no Ebook");
		return super.aplicarDescontoDe(porcentagem); // Estamos delegando para a lógica do método 'aplicaDescontoDe' da classe pai.
	}*/
	
	public void adiciona(Livro livro) {
		Ebook ebook = (Ebook) livro;
		ebook.getWaterMark();
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("Aplicando desconto no Ebook");
		return true;
	}

//	@Override
//	public String toString() {
//		return "Eu sou um Ebook";
//	}

}
