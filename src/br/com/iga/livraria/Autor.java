package br.com.iga.livraria;

public class Autor {

	private String nome;
	private String email;
	private String cpf;

	public void mostrarDetalhes() {
		System.out.println("---------------- Dados do Autor ----------------");
		System.out.println("Nome do Autor:" + nome);
		System.out.println("Email do Autor: " + email);
		System.out.println("CPF do Autor: " + cpf);
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public boolean equals(Object obj) {
		// Se o parametro passado não foi uma instância do tipo Autor, retornamos false indicando que não são objetos iguais.
		if(!(obj instanceof Autor)) return false;
		Autor outro = (Autor) obj;
		return this.nome.equals(outro.nome);
	}
}
