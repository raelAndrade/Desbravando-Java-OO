package br.com.iga.livraria.produtos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GerenciadorDeCupons {

	// Interface java.util.List
//	private List<String> cupons;
	
//	public GerenciadorDeCupons() {
//		// O método estático 'asList' é uma fábrica(factory) de 'List' 
//		this.cupons = Arrays.asList("CUP74", "CUP158", "CUP14", "CUP52", "CUP21", "CUP221", "CUP91", 
//				"CUP327", "CUP410", "CUP275", "CUP484", "CUP207", "CUP96", "CUP119", "CUP174", "CUP291", 
//				"CUP1", "CUP115", "CUP222", "CUP272");
//	}

	// Interface java.util.Set
	//private Set<String> cupons;
	
	private Map<String, Double> cupons;
		
//	public GerenciadorDeCupons() {
//		// Para utilizar um Set precisamos instanciar alguma de suas implementações, como o HashSet, que é uma das implementações mais usada
//		this.cupons = new HashSet<String>();
//		cupons.addAll(Arrays.asList("CUP74", "CUP158", "CUP14", "CUP52", "CUP21", "CUP221", "CUP91", 
//				"CUP327", "CUP410", "CUP275", "CUP484", "CUP207", "CUP96", "CUP119", "CUP174", "CUP291", 
//				"CUP1", "CUP115", "CUP222", "CUP272"));
//	}
	
//	public boolean validaCupom(String cupom) {
//		// O método 'contains' serve para fazer uma consulta
//		return this.cupons.contains(cupom);
//	}
	
	public GerenciadorDeCupons() {
		this.cupons = new HashMap<>();
		
		cupons.put("cab11", 10.0);
		cupons.put("cab22", 12.0);
		cupons.put("cab33", 13.0);
		cupons.put("cab44", 14.0);
	}

	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}

}
