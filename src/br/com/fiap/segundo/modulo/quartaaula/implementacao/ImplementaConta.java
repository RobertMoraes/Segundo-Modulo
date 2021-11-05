package br.com.fiap.segundo.modulo.quartaaula.implementacao;

import br.com.fiap.segundo.modulo.quartaaula.beans.Cliente;
import br.com.fiap.segundo.modulo.quartaaula.beans.ContaCorrente;

public class ImplementaConta {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Robert Moraes");
		cliente.setCpf("391.454.758-81");
		cliente.setFone("11998992503");
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setAgencia(1010);
		contaCorrente.setConta(10829182);
		contaCorrente.setSaldo(1000);
		contaCorrente.setCliente(cliente);
		
		System.out.println("Ag :: " + contaCorrente.getAgencia() + " C/C :: " + contaCorrente.getConta() +
				" Saldo :: " + contaCorrente.getSaldo() + " Cliente :: " + contaCorrente.getCliente().getNome() +
				" Fone :: " + contaCorrente.getCliente().getFone());
		
	}

}
