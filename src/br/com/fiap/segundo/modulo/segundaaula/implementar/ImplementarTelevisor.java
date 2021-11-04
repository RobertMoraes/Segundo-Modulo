package br.com.fiap.segundo.modulo.segundaaula.implementar;

import br.com.fiap.segundo.modulo.segundaaula.beans.Televisor;

public class ImplementarTelevisor {

	public static void main(String[] args) {

		Televisor televisor = new Televisor();
		
			televisor.ligarTelevisor();
			System.out.println(televisor.isLigado());
			
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			televisor.aumentarVolume();
			System.out.println(televisor.getVolume());
			
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			televisor.reduzirVolume();
			System.out.println(televisor.getVolume());
			
			televisor.mostraStatus();
		
	}

}
