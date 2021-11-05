package br.com.fiap.segundo.modulo.quartaaula.implementacao;

import br.com.fiap.segundo.modulo.quartaaula.beans.Banco;
import br.com.fiap.segundo.modulo.quartaaula.beans.Cliente;
import br.com.fiap.segundo.modulo.quartaaula.beans.ContaCorrente;
import br.com.fiap.segundo.modulo.quartaaula.tools.Input;

public class ExecutaConta {

	public static void main(String[] args) {
		
		//Criar dados do Banco
		Banco banco = new Banco(Input.texto("Digite a razao social :: "),
				Input.inteiro("Digite o Id Bancario :: "));
		
		
		//Capturar dados do Cliente
		
		Cliente cliente = new Cliente(Input.texto("Informe nome do cliente :: "),
				Input.texto("Digite o CPF do cliente informado :: "),
				Input.texto("Informe o telefone de contado :: "));
		
		//Abrir ContaCorrente (Banco + Cliente + ContaCorrente)
		
		ContaCorrente contaCorrente = new ContaCorrente(Input.inteiro("Digite o numero da agencia :: "),
				Input.inteiro("Informe a conta corrente :: "),
				Input.decimal("Informe o saldo da conta corrente :: "),
				cliente,
				banco);
		
		System.out.println("Ag :: " + contaCorrente.getAgencia() + " C/C :: " + contaCorrente.getConta() +
				" Cliente :: " + contaCorrente.getCliente().getNome() +
				" Banco :: " + contaCorrente.getBanco().getRazao());
	}

}
