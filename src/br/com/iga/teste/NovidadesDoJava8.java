package br.com.iga.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.iga.livraria.Autor;
import br.com.iga.livraria.produtos.Livro;
import br.com.iga.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");
		
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");
		
		List<Livro> livros = Arrays.asList(javaoo, java8);
		
		//Collections.sort(livros, new ComparadorPorNome());
		
		/**
		 * é o mesmo código da classe ComparadorPorNome, mas declarado numa única instrução. 
		 * Esse recurso é conhecido como classe anônima, pois afnal essa classe não tem nem mesmo um nome.
		 */
//		Collections.sort(livros, new Comparator<Livro>() {
//
//			@Override
//			public int compare(Livro l1, Livro l2) {
//				return l1.getNome().compareTo(l2.getNome());
//			}
//		});
		
		/**
		 * Para simplifcar esse processo o Java 8 introduziu algumas mudanças, uma delas foi adicionando o método sort na 
		 * própria interface List! Pode parecer uma mudança simples, mas agora podemos fazer.
		 * Para não quebrar a compatibilidade da interface List, esse método sort é um método concreto, com código dentro.
		 * Esse método é chamado de 'Default Method'.
		 */
//		livros.sort(new Comparator<Livro>() {
//			@Override
//			public int compare(Livro l1, Livro l2) {
//				return l1.getNome().compareTo(l2.getNome());
//			}
//		});
		
//		for(Livro livro : livros) {
//			System.out.println(livro.getNome());
//		}
		/**
		 * Vimos brevemente que o Java 8 introduziu o conceito de interfaces funcionais. 
		 * Em poucas palavras, uma interface com um único método abstrato pode ser considerada funcional, 
		 * como é o caso da interface Comparator que possui apenas o método compare. Com isso ganhamos algumas possibilidades, 
		 * como por exemplo transformar aquela classe anônima em uma expressão lambda! Uma primeira forma de fazer isso seria:
		 */
		//livros.sort((l1, l2) -> l1.getNome().compareTo(l2.getNome()));
		
		/**
		 * O método forEach, assim como a maior parte dos default methods, recebe uma interface funcional como parâmetro. 
		 * Portanto note que foi possivel utilizar uma expressão lambda para representar nossas intenções.
		 */
		//livros.forEach(l -> System.out.println(l.getNome()));
		
		/**
		 * Dada uma lista de livros, queremos fltar apenas os que tenham a palavra Java em seu nome. 
		 * Até o Java 1.7 uma das formas mais tradicionais de se fazer isso seria criando uma nova lista 
		 * para o resultado e condicionando os elementos que deveriam ser inseridos, como a seguir:
		 */
//		List<Livro> filtrados = new ArrayList<>();
//		for(Livro livro : livros) {
//			if(livro.getNome().contains("Java")) {
//				filtrados.add(livro);
//			}
//		}
		
//		for(Livro livro : filtrados) {
//			System.out.println(livro.getNome());
//		}
		
		/**
		 * Operações comuns como essa, fltrar elementos de uma coleção, estão agora presentes em uma nova API, 
		 * conhecida como Stream. O Stream traz para o Java uma forma mais funcional de trabalhar com as nossas coleções, 
		 * usando uma interface ﬂuente! Separando as funcionalidades do Stream da Collection, 
		 * também fcou mais fácil de deixar claro que métodos são mutáveis, evitar problema de conﬂito de nome de métodos, entre outros.
		 */
//		Stream<Livro> stream = livros.stream();
//		livros.stream().filter(l -> l.getNome().contains("Java"));
		
//		for(Livro livro : livros) {
//			System.out.println(livro.getNome());
//		}
		
		/**
		 * Portanto, no lugar de iterar na lista original podemos utilizar o método forEach 
		 * também presente na API de Streams da seguinte forma:
		 */
		livros.stream()
			.filter(l -> l.getNome().contains("Java"))
			.forEach(l -> System.out.println(l.getNome()));
	}

}
