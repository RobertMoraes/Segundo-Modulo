package br.com.fiap.segundo.modulo.segundaaula.implementar;

import br.com.fiap.segundo.modulo.segundaaula.beans.Pessoa;

public class ImplementarPessoas {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Robert");
		p1.setEndereco("Rua Jo�o Santisi, 88");
		p1.setBairro("Mooca");
		p1.setCidade("S�o Paulo");
		p1.setEstado("SP");
		
		
		System.out.println("Nome :: " + p1.getNome() + " Endere�o :: " + p1.getEndereco());
	}

}
