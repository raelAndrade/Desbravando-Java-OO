package br.com.iga.teste;

import br.com.iga.livraria.Autor;
import br.com.iga.livraria.produtos.Livro;
import br.com.iga.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Davi de Oliveira Andrade");
		autor.setEmail("davi@andrade.com");
		autor.setCpf("123.123.123-12");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem Java");
		livro.setValor(59.90);
		//livro.setIsbn("978-78-12345-12-6");

		livro.mostrarDetalhes();

		Autor outroAutor = new Autor();
		outroAutor.setNome("Bianca de Oliveira Andrade");
		outroAutor.setEmail("bianca@andrade.com");
		outroAutor.setCpf("321.321.321-32");
		
		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("Lógica de Porgramação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("789-45-54321-21-0");

		outroLivro.mostrarDetalhes();

//		boolean resultado = Boolean.parseBoolean("false");
//		System.out.println(resultado);
//
//		byte parseByte = Byte.parseByte("1");
//		System.out.println(parseByte);
//
//		int parseInt = Integer.parseInt("10");
//		System.out.println(parseInt);
//
//		int parseInt3 = Integer.valueOf("10");
//		System.out.println(parseInt3);

		// Transformar qualquer um desses valores em uma String, podemos utilizar o método estático valueOf.
//		String numeroEmTexto = String.valueOf(10);
//		System.out.println(numeroEmTexto);
//		
//		int parseInt2 = Integer.parseInt("ABC");
//		System.out.println(parseInt2);
		
//		Random random = new Random();
//		System.out.println(random.nextInt(10));
		
//		String java = "java";
//		String novaString = java.replace("v", "c");
//		System.out.println(novaString);
//		char charAt =  java.charAt(2);
//		System.out.println(charAt);
//		boolean endsWith = java.endsWith("a");
//		System.out.println(endsWith);
//		boolean startsWith = java.startsWith("j");
//		System.out.println(startsWith);
		
//		boolean equals = java.equalsIgnoreCase("JAVA");
//		System.out.println(equals);
		
		

	}
}
