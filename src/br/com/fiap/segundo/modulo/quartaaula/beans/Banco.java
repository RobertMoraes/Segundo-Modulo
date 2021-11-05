package br.com.fiap.segundo.modulo.quartaaula.beans;

public class Banco {
	private String razao;
	private int idBancario;
	
	
	//Construtor
	public Banco() {}
	
	public Banco(String razao, int idBancario) {
		this.razao = razao;
		this.idBancario = idBancario;
	}
	
	//Getters e Setters

	public String getRazao() {
		return razao;
	}


	public void setRazao(String razao) {
		this.razao = razao;
	}


	public int getIdBancario() {
		return idBancario;
	}


	public void setIdBancario(int idBancario) {
		this.idBancario = idBancario;
	}
}
