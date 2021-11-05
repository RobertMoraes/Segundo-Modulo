package br.com.fiap.segundo.modulo.quartaaula.beans;

public class ContaCorrente {
	private int agencia;
	private int conta;
	private double saldo;
	private Cliente cliente;
	private Banco banco;
	
	//Construtor
	
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int conta, double saldo, Cliente cliente) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;

	}
	
	public ContaCorrente(int agencia, int conta, double saldo, Cliente cliente, Banco banco) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.banco = banco;
	}
	
	//Getters e Setters
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
	//Metodos(operacoes)
	
	public void extrato() {
		System.out.println("Ag :: " + this.agencia + " C/C :: " + this.conta + " Saldo :: " + this.saldo);
	}
	
	public void saque (double valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente para saque");
		}else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}

}
