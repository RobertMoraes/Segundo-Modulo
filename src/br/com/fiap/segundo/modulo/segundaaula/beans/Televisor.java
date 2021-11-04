package br.com.fiap.segundo.modulo.segundaaula.beans;

public class Televisor {
	
	private int canal;
	private int volume;
	private boolean ligado;
	
	//Getters e Setters
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	//Metodos de operacao
	public void aumentarVolume() {
		if(this.ligado == true && this.volume<10) {
		this.volume = volume +1;
		System.out.println("Volume +");
		}else if (this.ligado == true && this.volume == 10) {
			System.out.println("Televisor no volume máximo.");
		}else {
			System.out.println("Necessário ligar o televisor.");
		}
		
	}
	
	public void reduzirVolume() {
		if(this.ligado == true && this.volume>0) {
			this.volume = volume -1;
			System.out.println("Volume -");
			}else if (this.ligado == true && this.volume == 0) {
				System.out.println("Televisor no volume mínimo.");
			}else {
				System.out.println("Necessário ligar o televisor.");
			}
	}
	
	public void subirCanal() {
		this.canal = canal +1;
		System.out.println("Canal +");
	}
	
	public void descerCanal() {
		this.canal = canal -1;
		System.out.println("Canal -");
	}
	
	public void ligarTelevisor() {
		this.ligado = true;
		System.out.println("Televisor Ligado");
	}
	
	public void desligarTelevisor() {
		this.ligado = false;
		System.out.println("Televisor desligado");
	}
	
	public void mostraStatus() {
		
		System.out.println("Televisor ::: " + this.ligado + " Canal ::: " + this.canal + " Volume ::: " + this.volume);
		
	}

}
