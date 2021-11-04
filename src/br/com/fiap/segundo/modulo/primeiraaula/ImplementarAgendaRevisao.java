package br.com.fiap.segundo.modulo.primeiraaula;

import java.text.SimpleDateFormat;

public class ImplementarAgendaRevisao {

	public static void main(String[] args) throws Exception {
		
		AgendaRevisao cliente1 = new AgendaRevisao();
		
		cliente1.cliente = "Robert Moraes";
		cliente1.fone = "11998992503";
		cliente1.modelo = "New Civic";
		SimpleDateFormat minhaData = new SimpleDateFormat("dd/MM/yyyy");
		cliente1.data = minhaData.parse("27/12/2021");
		
		System.out.println("Cliente ::: "+ cliente1.cliente + " modelo ::: " + cliente1.modelo + " data ::: "+ minhaData.format(cliente1.data));

	}

}
