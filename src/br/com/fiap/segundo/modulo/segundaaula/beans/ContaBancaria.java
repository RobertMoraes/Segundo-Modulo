package br.com.fiap.segundo.modulo.segundaaula.beans;

public class ContaBancaria {
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	//Getters e Setters
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodos operacoes
	
	public void extratoBancario() {
		
		System.out.println("Agencia ::: " + this.agencia + " Numero Conta ::: " + this.numeroConta + " Saldo Conta ::: " + this.saldo);
		
	}
	
	public void saqueBancario(double valor) {
		if(this.saldo < valor ) {
			System.out.println("Saldo insuficiente para realizar o saque.");
		}else {
			this.saldo = saldo - valor;
			System.out.println("Saque no valor "+ valor +" realizado com sucesso, seu saldo atual é "+this.saldo);
		}
	}
	
	public void depositoBancario(double valor) {
		
		this.saldo = saldo + valor;
		
		System.out.println("Seu saldo atual é "+this.saldo);
		
	}
}
