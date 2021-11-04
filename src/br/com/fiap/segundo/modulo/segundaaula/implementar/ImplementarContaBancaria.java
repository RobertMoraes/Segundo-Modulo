package br.com.fiap.segundo.modulo.segundaaula.implementar;

import java.util.Scanner;

import br.com.fiap.segundo.modulo.segundaaula.beans.ContaBancaria;

public class ImplementarContaBancaria {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		
		System.out.println("Informe a agencia ::: ");
		conta.setAgencia(leitor.nextInt());
		System.out.println("Informe o numero da conta ::: ");
		conta.setNumeroConta(leitor.nextInt());
		
		System.out.println("Informe o valor de deposito :::: ");
		conta.depositoBancario(leitor.nextDouble());
		conta.extratoBancario();
		System.out.println("Informe o valor de saque ::: ");
		conta.saqueBancario(leitor.nextDouble());
		
		leitor.close();
	}

}
