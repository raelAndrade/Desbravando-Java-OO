package br.com.iga.teste;

import br.com.iga.livraria.produtos.GerenciadorDeCupons;

public class ConsultaDeDescontos {

	public static void main(String[] args) {

		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
//		if(gerenciador.validaCupom("CUP1234")) {
//			System.out.println("Cupom de desconto válido.");
//		}else {
//			System.out.println("Esse cupom não existe :( ");
//		}
		Double desconto = gerenciador.validaCupom("cab11");
		if(desconto != null) {
			System.out.println("Cupom de desconto válido.");
			System.out.println("Valor: " + desconto);
		}
		else {
			System.out.println("Esse cupom não existe.");
		}
	}

}
