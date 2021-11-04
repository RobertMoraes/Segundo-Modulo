package br.com.fiap.segundo.modulo.segundaaula.implementar;

import br.com.fiap.segundo.modulo.segundaaula.beans.Pessoa;

public class ImplementarPessoas {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Robert");
		p1.setEndereco("Rua João Santisi, 88");
		p1.setBairro("Mooca");
		p1.setCidade("São Paulo");
		p1.setEstado("SP");
		
		
		System.out.println("Nome :: " + p1.getNome() + " Endereço :: " + p1.getEndereco());
	}

}
