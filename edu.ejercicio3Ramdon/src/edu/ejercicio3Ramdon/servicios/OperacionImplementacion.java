package edu.ejercicio3Ramdon.servicios;

import edu.ejercicio3Ramdon.controladores.*;

public class OperacionImplementacion implements OperacionInterfaz{

	public int generarNumero() {
		int numeroGenerar;
		double numeroDouble = Math.random()*100;
		numeroGenerar = (int)numeroDouble;
		return numeroGenerar;
		
	}
	
	
	/*
	public void DameNumeros(int numeroIntroducido) {
		int numeroGenerado;
		int intentos;
		int numeroIntroducido;
		
		
	}*/
}
